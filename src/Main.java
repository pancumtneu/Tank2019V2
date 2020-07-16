import java.awt.*;

public class Main {
    public static void main(String[] args) {
        TankFrame tf=new TankFrame();
        tf.setVisible(true);


            for(;;) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                tf.repaint();  //隔一段时间重绘一次TankFrame  这样能够重新
            }



        }
}
