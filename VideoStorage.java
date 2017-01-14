import java.io.File;
import java.text.DecimalFormat;

/**
 * Created by scott_000 on 1/12/2017.
 */

public class VideoStorage {
    public static void main(String[]args) {
        File file = new java.io.File("C:\\Users\\scott_000\\Videos\\Sofia_Matilda_Piano.mp4");
        double bytes = file.length();
        System.out.println("File size: " + bytes);
        NewBean storageBean = new NewBean(bytes);


        DecimalFormat df2 = new DecimalFormat(".###");
        System.out.println("Megabytes required: " + df2.format(storageBean.getMB()));
        System.out.println("Gigabytes required: " + df2.format(storageBean.getGb()));

    }

}
