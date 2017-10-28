
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

    public class Board extends JFrame implements MouseListener, ActionListener{

        Frame frame = new Frame();
        private int playerTurn = 1;

        public boolean whoseTurn(){
            for(int i=1;i<=9;i++){
                if((i % 2 == playerTurn )){
                }
            }
            return true;
        }

        public void paint(Graphics g){
            g.setColor(Color.white);
            g.drawRect(0,0,frame.xAxis,frame.yAxis);

            g.setColor(Color.black);
            g.drawRect(frame.xAxis/1/3,0,frame.xAxis/3+30,frame.yAxis);
            g.drawRect(frame.xAxis/2/3,0,frame.xAxis/2/3+30,frame.yAxis);
            g.drawRect(0,frame.yAxis/1/3,frame.xAxis,frame.yAxis/1/3);
            g.drawRect(0,frame.yAxis/2/3,frame.xAxis,frame.yAxis/2/3);

            g.dispose();

        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }







        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }








