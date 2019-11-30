package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class Sunflower extends Plant
{
    Sun suntoken;
    private static int time=0;
    private static Timer timer;
    public Sunflower(int x,int y)
    {
        super(100,0,2,new ImageView(new Image("/Photos/sunflower.png")),x,y,new ImageView(new Image("/Photos/sun_flower.gif")),0,"/Photos/sun_flower.gif");
        suntoken=new Sun(x,y);
        timer=new Timer();
    }

    @Override
    public void attack(Characters c)
    {
        c.dechp(0);
    }
    private static class task extends TimerTask
    {
        @Override
        public void run() {
            time-=1;
            if(time==0)
                timer.cancel();
        }
    }
    public static boolean isvalid()
    {
        return time==0;
    }
    public static void invalid()
    {
        time=Sunflower.getTime();
        TimerTask task1=new Sunflower.task();
        timer.schedule(task1,0L,1000l);
    }
    @Override
    public void animate() {

    }
}