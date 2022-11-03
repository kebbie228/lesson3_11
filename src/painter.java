import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class painter {
    public static void main(String[] args) throws IOException {
        JFrame jFrame = new JFrame("Flood fill");
        jFrame.setSize(500, 300);
        jFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setContentPane(new DrawPane());
        jFrame.repaint();
        jFrame.setVisible(true);
    }
}
class DrawPane extends JPanel {
    int color;
    static BufferedImage bufferedImage = null;

    DrawPane() throws IOException {
        File file = new File("src/com/company/Безымянный.bmp");
        //    File file=new File("C:/Users/гк/Desktop");
        bufferedImage = ImageIO.read(file);

        addMouseListener(new Listener() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                color = bufferedImage.getRGB(x, y);
              //  bufferedImage.setRGB(x, y, new Color(255, 0, 0).getRGB());
                floodFill(x,y);
                repaint();
                System.out.printf("x=%d y=%d color=%d\n", x, y, color);
            }
        });
    }


    class Listener extends MouseAdapter {

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(bufferedImage, 0, 0, null);
    }

    void floodFill(int x,int y){
        int colorCurr = bufferedImage.getRGB(x, y);
        if(color!=colorCurr) return;
        bufferedImage.setRGB(x, y, new Color(135, 0, 0).getRGB());
floodFill(x-1,y);
floodFill(x+1,y);
floodFill(x,y-1);
floodFill(x,y+1);

    }
}




