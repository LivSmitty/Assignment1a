import java.io.File;
import java.text.DecimalFormat;

/**
 * Created by scott_000 on 1/12/2017.
 */

public class VideoStorage {
    public static void main(String[]args) {
        double seconds;
        double totalStorageMB;
        double totalStorageGB;
        double frameRate;
        double fps;
        int quality;
        int pixelsWide;

        //CREATE BEAN 1 - pass 720b/current time as parameter
        pixelsWide = 1280;
        quality = 720;
        VideoBean video720 = new VideoBean(quality, System.nanoTime());
        frameRate = video720.GetElapsedTime() / 100;
        calculateStorageMB(pixelsWide, quality, frameRate);


        //CREATE BEAN 2 - pass 1080/current time as parameter
        pixelsWide = 1920;
        quality = 1080;
        VideoBean video1080 = new VideoBean(quality, System.nanoTime());
        frameRate = video1080.GetElapsedTime()/ 100;
        calculateStorageMB(pixelsWide, quality, frameRate);
    }


        public static double calculateStorageMB(int pixelsWide, int quality, double frameRate) {
            //calculate MB/Print Results & call method to calculate GB
           double totalStorageMB = ((pixelsWide * quality) * 2) * frameRate / (1024 * 1024);
            System.out.println("Quality: " + quality);
            System.out.println("Total Megabytes: " + totalStorageMB);
           return calculateStorageGB(totalStorageMB);
        }

        public static double calculateStorageGB(double totalStorageMB) {
            //calculate GB/Print results
            double totalStorageGB = totalStorageMB/1024;
            System.out.println("Total Gigabytes: " + totalStorageGB);
            return totalStorageGB;
        }


}
