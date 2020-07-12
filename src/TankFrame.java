import java.awt.*;

public class TankFrame extends Frame {
    private int x=100,y=100;

    public TankFrame()  {
        this.setTitle("Tank war!");
        this.setLocation(400,100);
        this.setSize(800,600);

    }

    @Override
   public void paint(Graphics g) {
        //g.fillRect(x,y,30+x,40);贪吃蛇这么移动
        //g.fillRect(10,y,30+x,40);进度条这么移动
        g.fillRect(x,y,30+x,40);
        x++;
    }




//    @Override
//    public void paint(Graphics g){
//
//        for(;;){
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            g.fillRect(x,y,30,40);
//            x++;
//            repaint();
//        }



}
