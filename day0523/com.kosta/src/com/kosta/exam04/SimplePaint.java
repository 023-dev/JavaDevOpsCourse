import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class SimplePaint extends JFrame {
    private DrawArea drawArea;
    private BufferedImage image;
    private Graphics2D g2d;
    private int prevX, prevY;
    private Color currentColor = Color.BLACK;
    private boolean eraserMode = false;

    public SimplePaint() {
        setTitle("Simple Paint Program");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        drawArea = new DrawArea();
        add(drawArea, BorderLayout.CENTER);

        // Initialize the drawing area
        image = new BufferedImage(800, 600, BufferedImage.TYPE_INT_ARGB);
        g2d = image.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke(2));
        g2d.setPaint(currentColor);

        JPanel controlPanel = new JPanel();
        JButton brushButton = new JButton("Brush");
        JButton eraserButton = new JButton("Eraser");

        brushButton.addActionListener(e -> {
            eraserMode = false;
            g2d.setPaint(currentColor);
        });

        eraserButton.addActionListener(e -> {
            eraserMode = true;
            g2d.setPaint(Color.WHITE);
        });

        controlPanel.add(brushButton);
        controlPanel.add(eraserButton);
        add(controlPanel, BorderLayout.NORTH);

        setVisible(true);
    }

    private class DrawArea extends JPanel {
        public DrawArea() {
            setDoubleBuffered(false);

            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    prevX = e.getX();
                    prevY = e.getY();
                }
            });

            addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    int x = e.getX();
                    int y = e.getY();

                    if (eraserMode) {
                        g2d.setPaint(Color.WHITE);
                    } else {
                        g2d.setPaint(currentColor);
                    }

                    g2d.drawLine(prevX, prevY, x, y);
                    repaint();

                    prevX = x;
                    prevY = y;
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, null);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SimplePaint::new);
    }
}
