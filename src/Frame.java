import javax.swing.JFrame;
import java.awt.*;

public class Frame {

    public static int xAxis;
    public static int yAxis;

    public static void main(String[] args){
        xAxis = 720;
        yAxis = 480;

        JFrame panel = new JFrame();
        Board board = new Board();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = (int) screenSize.getHeight();
        int width = (int) screenSize.getWidth();
        panel.setBounds(width/2-360,height/2-240, xAxis,yAxis);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setResizable(false);
        panel.setTitle("TicTacToe");

        panel.add(board);
        panel.setVisible(true);

    }






}
