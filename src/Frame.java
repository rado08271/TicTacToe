import javax.swing.*;
import java.awt.*;

public class Frame {
    public static void main(String[] args){
        int xAxis = 720;
        int yAxis = 480;


        JFrame panel = new JFrame();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = (int) screenSize.getHeight();
        int width = (int) screenSize.getWidth();
        panel.setBounds(width/2-360,height/2-240, xAxis,yAxis);
        panel.setVisible(true);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setResizable(false);
        panel.setTitle("TicTacToe");



    }






}
