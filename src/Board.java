
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

    public class Board extends JPanel implements MouseListener, ActionListener{

        Frame frame = new Frame();
        private boolean startGame = false;
        private int playerTurn = 1;

        private boolean AIturn = false;

        private Timer time;

        String[][] boardFrame = new String[3][3];
        //for boardFrame[0][0]
        //constructor
        public Board(){
            addMouseListener(this);
            setFocusable(true);
            setFocusTraversalKeysEnabled(false);

            time = new Timer(1,this);
            time.start();
        }

        //GUI
        public void paint(Graphics g){
            g.setColor(Color.white);
            g.fillRect(0,0,frame.xAxis,frame.yAxis);

            g.setColor(Color.black);
            g.fillRect(frame.xAxis*1/3,0,frame.xAxis/200,frame.yAxis);
            g.fillRect(frame.xAxis*2/3,0,frame.xAxis/200,frame.yAxis);
            g.fillRect(0,frame.yAxis*1/3-20,frame.xAxis,frame.yAxis/200);
            g.fillRect(0,frame.yAxis*2/3-20,frame.xAxis,frame.yAxis/200);

            g.dispose();

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(mouseClicked();){
                getGraphics().fillRect(0,0,frame.xAxis/200,frame.yAxis*2/3);
            }
        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }






        //no usage for now
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








