import com.sun.prism.Graphics;
import com.sun.prism.paint.Color;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

    public class Board extends JFrame implements MouseListener, ActionListener{

        Frame frame = new Frame();




        public void draw(Graphics g){
            g.setColor(Color.black);
            g.drawLine(frame.xAxis/2,frame.yAxes/2,frame.xAxis/2-40,frame.yAxes/2-40);


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








