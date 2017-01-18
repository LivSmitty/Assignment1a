import java.util.concurrent.TimeUnit;

/**
 * Created by scott_000 on 1/18/2017.
 */

public class VideoBean {

    long startTime;
    long endTime;
    double quality;


    public VideoBean(){

    }

    public VideoBean(double x, long y) {
        quality = x;
        startTime = y;
        endTime = System.nanoTime();

    }

    public double GetElapsedTime(){
        double elapsedTime = (endTime - startTime)/1000000000.0;
        return elapsedTime;
    }



}
