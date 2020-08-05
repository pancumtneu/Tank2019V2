import java.awt.*;
import java.awt.event.KeyEvent;

public class Tank {
    private int x,y;
    private Dir dir;
    public static final int SPEED=5;
    private boolean bL,bU,bR,bD;

    public Tank(int x, int y, Dir dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public void paint(Graphics g,Color c){
        g.setColor(c);
        g.fillRect(x,y,50,50);
        move();
    }

    public void keyPressed(KeyEvent e)
    {
        int key=e.getKeyCode();
        switch (key)
        {
            case KeyEvent.VK_A:
                dir=Dir.L;
                break;
                 case KeyEvent.VK_W:
                dir=Dir.U;
                break;
                 case KeyEvent.VK_D:
                dir=Dir.R;
                break;
                 case KeyEvent.VK_S:
                dir=Dir.D;
                break;

        }

    }




    private void move() throws  NullPointerException{
        switch (dir)
        {
            case L:
                x-=SPEED;
                break;
            case U:
                y-=SPEED;
                break;
            case R:
                x+=SPEED;
                break;
            case D:
                y+=SPEED;
                break;
            default:

                break;

        }
    }

    public void keyReleased(KeyEvent e) {
        int key=e.getKeyCode();
        switch (key)
        {
            case KeyEvent.VK_A:
                dir=Dir.L;
                break;
            case KeyEvent.VK_W:
                dir=Dir.U;
                break;
            case KeyEvent.VK_D:
                dir=Dir.R;
                break;
            case KeyEvent.VK_S:
                dir=Dir.D;
                break;

        }
    }
}
