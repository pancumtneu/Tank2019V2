import java.awt.*;

public class TankFrame extends Frame {
    private int x=100;

    public TankFrame()  {
        this.setTitle("Tank war!");
        this.setLocation(400,100);
        this.setSize(800,600);

    }
    @Override
    public void paint(Graphics g){
        g.fillRect(10,20,30,40);
    }
}
