package com.kostagram.view;

import javax.swing.*;
import java.awt.*;
import com.kostagram.view.PrettyScrollBar;

public class Test extends JFrame {
    private DefaultListModel<Post> listModel;
    private JList<Post> list;
    private JScrollPane scrollPane;
    private JPanel postsPanel;
    private boolean loading = false;

    public Test() {
        setTitle("Main");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(480, 950);
        setResizable(false);
        setLocationRelativeTo(null);

        // 상단 패널
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
        topPanel.setBackground(Color.black);
        topPanel.setPreferredSize(new Dimension(450, 55));
        JLabel titleLabel = new JLabel("Kostagram");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 30));
        titleLabel.setForeground(Color.white);
        topPanel.add(titleLabel);
        topPanel.add(Box.createHorizontalGlue());

        // 리스트 모델 및 리스트
        listModel = new DefaultListModel<>();
        list = new JList<>(listModel);
        list.setCellRenderer(new PostRenderer());


        // 스크롤 페인
        scrollPane = new JScrollPane(list);
        JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
        verticalScrollBar.setUI(new PrettyScrollBar());
        scrollPane.setBackground(Color.black);
        scrollPane.setBorder(null);
        scrollPane.getVerticalScrollBar().addAdjustmentListener(e -> {
            if (!loading && !e.getValueIsAdjusting() &&
                    (e.getAdjustable().getMaximum() - e.getAdjustable().getVisibleAmount() - e.getAdjustable().getValue() < 10)) {
                loadMoreData();
            }
        });

        //하단 패널
        JPanel botPanel = new JPanel();
        botPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        botPanel.setBackground(Color.black);
        botPanel.setPreferredSize(new Dimension(450, 55));
        // 이미지를 로드합니다.
        String defaultIconPath = "./src/com/kostagram/icon/";
        ImageIcon homeIcon = new ImageIcon(defaultIconPath+"home.png");
        ImageIcon searchIcon = new ImageIcon(defaultIconPath+"search.png");
        ImageIcon addIcon = new ImageIcon(defaultIconPath+"add.png");
        ImageIcon userIcon = new ImageIcon(defaultIconPath+"user.png");
        // 이미지 아이콘을 사용하여 버튼을 생성합니다.
        JButton homeButton = new JButton(homeIcon);
        JButton searchButton = new JButton(searchIcon);
        JButton addButton = new JButton(addIcon);
        JButton userButton = new JButton(userIcon);
        // 버튼의 투명도와 테두리를 설정할 수 있습니다.
        homeButton.setOpaque(false);
        homeButton.setContentAreaFilled(false);
        homeButton.setBorderPainted(false);
        searchButton.setOpaque(false);
        searchButton.setContentAreaFilled(false);
        searchButton.setBorderPainted(false);
        addButton.setOpaque(false);
        addButton.setContentAreaFilled(false);
        addButton.setBorderPainted(false);
        userButton.setOpaque(false);
        userButton.setContentAreaFilled(false);
        userButton.setBorderPainted(false);
        // 위치 설정
        gbc.insets = new Insets(10, 10, 10, 10); // 간격 설정
        gbc.gridx = 0;
        gbc.gridy = 0;
        botPanel.add(homeButton, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        botPanel.add(searchButton, gbc);
        gbc.gridx = 2;
        gbc.gridy = 0;
        botPanel.add(addButton, gbc);
        gbc.gridx = 3;
        gbc.gridy = 0;
        botPanel.add(userButton, gbc);
        botPanel.add(Box.createHorizontalGlue());

        // 초기 데이터 로드
        loadMoreData();

        // 메인 패널에 추가
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.black);
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(botPanel, BorderLayout.SOUTH);
        setVisible(true);

        add(mainPanel);
    }

    private void loadMoreData() {
        loading = true;
        SwingUtilities.invokeLater(() -> {
            for (int i = 0; i < 20; i++) {
                listModel.addElement(new Post(
                        "User " + (listModel.getSize() + 1),
                        "This is a post content " + (listModel.getSize() + 1),
                        "http://example.com/image.jpg",
                        (int) (Math.random() * 100),
                        (int) (Math.random() * 20)
                ));
            }
            loading = false;
        });
    }

    private static class PostRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            Post post = (Post) value;
            JPanel panel = new JPanel();
            panel.setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            panel.setBackground(Color.black);
            panel.setPreferredSize(new Dimension(450, 800));
            panel.setBorder(BorderFactory.createEmptyBorder(0, 5, 5, 0));

            // 사용자 이름
            JLabel userLabel = new JLabel(post.getUsername());
            userLabel.setFont(new Font("Arial", Font.BOLD, 14));
            userLabel.setForeground(Color.white);
            userLabel.setPreferredSize(new Dimension(450, 30));

            // 게시물 이미지
            String defaultImagePath = "./src/com/kostagram/image/";
            //JLabel imageLabel = new JLabel(new ImageIcon(post.getImageUrl()));
            JLabel imageLabel = new JLabel(new ImageIcon(defaultImagePath+"test.jpg"));
            imageLabel.setPreferredSize(new Dimension(450, 600));

            // 좋아요 및 댓글 수
            JPanel panel1 = new JPanel();
            panel1.setLayout(new GridBagLayout());
            GridBagConstraints gbc1 = new GridBagConstraints();
            panel1.setBackground(Color.black);
            panel1.setPreferredSize(new Dimension(450, 55));
            // 이미지를 로드합니다.
            String defaultIconPath = "./src/com/kostagram/icon/";
            ImageIcon likeIcon = new ImageIcon(defaultIconPath+"like_false.png");
            ImageIcon commentIcon = new ImageIcon(defaultIconPath+"comment.png");
            // 이미지 아이콘을 사용하여 버튼을 생성합니다.
            JButton likeButton = new JButton(likeIcon);
            JButton commentButton = new JButton(commentIcon);
            likeButton.setPreferredSize(new Dimension(30, 25));
            commentButton.setPreferredSize(new Dimension(30, 25));
            // 버튼의 투명도와 테두리를 설정할 수 있습니다.
            likeButton.setOpaque(false);
            likeButton.setContentAreaFilled(false);
            likeButton.setBorderPainted(false);
            commentButton.setOpaque(false);
            commentButton.setContentAreaFilled(false);
            commentButton.setBorderPainted(false);
            // 위치 설정
            gbc1.insets = new Insets(0, 5, 0, 0);
            gbc1.gridx = 0;
            gbc1.gridy = 0;
            gbc1.fill = GridBagConstraints.NONE;
            gbc1.anchor = GridBagConstraints.WEST;
            panel1.add(likeButton, gbc1);
            gbc1.gridx = 1;
            gbc1.gridy = 0;
            gbc1.fill = GridBagConstraints.NONE;
            gbc1.anchor = GridBagConstraints.WEST;
            panel1.add(commentButton, gbc1);
            gbc1.gridx = 2; // 세 번째 열
            gbc1.gridy = 0; // 첫 번째 행
            gbc1.weightx = 1.0; // 남은 공간을 채우기 위해 가중치 설정
            gbc1.fill = GridBagConstraints.HORIZONTAL;
            panel1.add(new JLabel(), gbc1);


            JLabel interactionLabel = new JLabel();
            interactionLabel.setFont(new Font("맑은 고딕", Font.BOLD, 12));
            interactionLabel.setText("  "+post.getLikes() + "명이 좋아합니다." + "   " + post.getComments()+"개의 댓글");
            interactionLabel.setForeground(Color.white);
            interactionLabel.setPreferredSize(new Dimension(450, 50));

            // 게시물 내용
            //JLabel contentLabel = new JLabel("<html>" + post.getContent() + "</html>");
            JLabel contentLabel = new JLabel("<html><b>"+post.getUsername()+"</b>   The soy sauce needs to be pre-boiled and completely.</html>");
            contentLabel.setFont(new Font("Arial", Font.PLAIN, 12));
            contentLabel.setForeground(Color.white);
            contentLabel.setPreferredSize(new Dimension(450, 100));

            // 위치 설정
            gbc.insets = new Insets(5, 5, 5, 5); // 간격 설정
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            panel.add(userLabel, gbc);
            gbc.gridx = 0;
            gbc.gridy = 1;
            panel.add(imageLabel, gbc);
            gbc.gridx = 0;
            gbc.gridy = 2;
            panel.add(panel1, gbc);
            gbc.gridx = 0;
            gbc.gridy = 3;
            panel.add(interactionLabel, gbc);
            gbc.gridx = 0;
            gbc.gridy = 4;
            panel.add(contentLabel, gbc);

            return panel;
        }
    }

    private static class Post {
        private String username;
        private String content;
        private String imageUrl;
        private int likes;
        private int comments;

        public Post(String username, String content, String imageUrl, int likes, int comments) {
            this.username = username;
            this.content = content;
            this.imageUrl = imageUrl;
            this.likes = likes;
            this.comments = comments;
        }

        public String getUsername() {
            return username;
        }

        public String getContent() {
            return content;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public int getLikes() {
            return likes;
        }

        public int getComments() {
            return comments;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Test::new);
    }
}
