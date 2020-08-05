import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TankFrame extends Frame {
    private final Tank mytank;
    private final Tank enemy;
    private int x=100,y=100;

    private Dir dir;
    public TankFrame()  {
        this.setTitle("Tank war!");
        this.setLocation(400,100);
        this.setSize(800,600);
        this.addKeyListener(new TankKeyListener());
        mytank=new Tank(100,100,Dir.R);
        enemy=new Tank(200,200,Dir.D);


    }
    @Override
   public void paint(Graphics g) {
        //g.fillRect(x,y,30+x,40);贪吃蛇这么移动
        //g.fillRect(10,y,30+x,40);进度条这么移动
        mytank.paint(g,Color.ORANGE);
        enemy.paint(g,Color.BLACK);


    }

    public class TankKeyListener  extends KeyAdapter {  //implements KeyListener需要实现每一个的方法（需要与不需要的）



        @Override
        public void keyPressed(KeyEvent e) {
            mytank.keyPressed(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            mytank.keyReleased(e);

        }
    }




}
