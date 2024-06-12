package com.kosta.test;

import javax.swing .*;
import java.awt .*;
import java.awt.event .*;
import java.util.ArrayList;

public class Test extends JFrame {

        private JPanel contentPanel;
        private DefaultListModel<String> listModel;
        private JList<String> list;
        private JScrollPane scrollPane;
        private boolean loading = false;

        public Test() {
            setTitle("스몰톡");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(400, 700);
            setLocationRelativeTo(null);

            // 상단 패널
            /*
            UI 레이아웃:
                topPanel: 상단에 뒤로가기 버튼, 제목, 검색 버튼, 프로필 버튼이 포함된 패널입니다.
                categoryPanel: 카테고리 버튼을 포함하는 패널입니다.
                listModel 및 list: 게시물 항목을 표시할 리스트입니다.
                scrollPane: 리스트를 감싸는 스크롤 패널입니다.
             */
            JPanel topPanel = new JPanel();
            topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
            JButton backButton = new JButton("<-");
            topPanel.add(backButton);
            topPanel.add(Box.createHorizontalGlue());
            JLabel titleLabel = new JLabel("패션톡");
            titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
            topPanel.add(titleLabel);
            topPanel.add(Box.createHorizontalGlue());
            JButton searchButton = new JButton("🔍");
            JButton profileButton = new JButton("😊");
            topPanel.add(searchButton);
            topPanel.add(profileButton);

            // 카테고리 패널
            JPanel categoryPanel = new JPanel();
            categoryPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
            String[] categories = {"전체", "베스트", "공지", "도와줘요", "자유토크", "패션소식", "코디평가", "살까말까", "컴플핫플"};
            for (String category : categories) {
                JButton categoryButton = new JButton(category);
                categoryPanel.add(categoryButton);
            }

            // 리스트 모델 및 리스트
            listModel = new DefaultListModel<>();
            list = new JList<>(listModel);
            list.setCellRenderer(new ListRenderer());

            // 스크롤 페인
            scrollPane = new JScrollPane(list);
            scrollPane.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() {
                //무한 스크롤 구현:
                //    scrollPane의 수직 스크롤바에 AdjustmentListener를 추가하여 스크롤이 거의 끝에 도달했을 때 더 많은 데이터를 로드합니다.
                //    loadMoreData 메서드에서 더 많은 데이터를 리스트 모델에 추가합니다.
                @Override
                public void adjustmentValueChanged(AdjustmentEvent e) {
                    if (!loading && !e.getValueIsAdjusting() &&
                            (e.getAdjustable().getMaximum() - e.getAdjustable().getVisibleAmount() - e.getAdjustable().getValue() < 10)) {
                        loadMoreData();
                    }
                }
            });

            // 초기 데이터 로드
            loadMoreData();

            // 메인 패널에 추가
            JPanel mainPanel = new JPanel();
            mainPanel.setLayout(new BorderLayout());
            mainPanel.add(topPanel, BorderLayout.NORTH);
            mainPanel.add(categoryPanel, BorderLayout.CENTER);
            mainPanel.add(scrollPane, BorderLayout.SOUTH);

            add(mainPanel);
        }

        private void loadMoreData() {
            loading = true;
            SwingUtilities.invokeLater(() -> {
                for (int i = 0; i < 20; i++) {
                    listModel.addElement("Item " + (listModel.getSize() + 1));
                }
                loading = false;
            });
        }


        private static class ListRenderer extends DefaultListCellRenderer {
            //ListRenderer 클래스에서 리스트 항목의 렌더링 방식을 정의합니다. 여기서는 간단한 HTML을 사용하여 항목을 표시합니다.
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                label.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                label.setText("<html><body><h3>" + value + "</h3><p>세부내용</p></body></html>");
                return label;
            }
        }


        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                Test example = new Test();
                example.setVisible(true);
            });
        }
    }

