import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TankFrame extends Frame {
    private int x=100,y=100;
    public static final int SPEED=5;

    public TankFrame()  {
        this.setTitle("Tank war!");
        this.setLocation(400,100);
        this.setSize(800,600);
        this.addKeyListener(new TankKeyListener());

    }

    @Override
   public void paint(Graphics g) {
        //g.fillRect(x,y,30+x,40);贪吃蛇这么移动
        //g.fillRect(10,y,30+x,40);进度条这么移动
        g.fillRect(x,y,30,40);

    }

    public class TankKeyListener  extends KeyAdapter {  //implements KeyListener需要实现每一个的方法（需要与不需要的）



        @Override
        public void keyPressed(KeyEvent e) {
            int key=e.getKeyCode();
            switch (key) {
                case KeyEvent.VK_A:
                    x-=SPEED;
                break;
                case KeyEvent.VK_W:
                    y-=SPEED;                   //因为y方向 向下是正方向
                break;
                case KeyEvent.VK_D:
                    x+=SPEED;
                break;
                case KeyEvent.VK_S:
                    y+=SPEED;
                break;

            }

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }



}
