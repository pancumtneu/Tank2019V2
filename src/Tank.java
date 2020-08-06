import java.awt.*;
import java.awt.event.KeyEvent;

public class Tank {
    private int x,y;
    private Dir dir;
    public static final int SPEED=5;
    private boolean bL,bU,bR,bD;//boolean默认是false

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
                    bL=true;
                break;
                 case KeyEvent.VK_W:
                     bU=true;
                break;
                 case KeyEvent.VK_D:
                     bR=true;
                break;
                 case KeyEvent.VK_S:
                     bD=true;
                break;

        }
        setDir();

    }

    private void setDir() {
        if (bL&&!bD&&!bR&&!bU)
        {
            dir=Dir.L;
        }
        if (!bL&&bD&&!bR&&!bU)
        {
            dir=Dir.D;
        }
        if (!bL&&!bD&&bR&&!bU)
        {
            dir=Dir.R;
        }
        if (!bL&&!bD&&!bR&&bU)
        {
            dir=Dir.U;
        }
        if (!bL&&!bD&&!bR&&!bU)
        {
            dir=Dir.STOP;
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
            case STOP:


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
                bL=false;
                break;
            case KeyEvent.VK_W:
                bU=false;
                break;
            case KeyEvent.VK_D:
                bR=false;
                break;
            case KeyEvent.VK_S:
                bD=false;
                break;

        }
        setDir();
    }
}
