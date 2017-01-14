/**
 * Created by scott_000 on 1/13/2017.
 */
public class NewBean{
    //CST-235 - assignment1a
    double bytes;
    double mb;
    double gb;

    public NewBean(){

    }

    public NewBean(double x){
        bytes = x;
    }

    public double getMB(){
        double mb = bytes/1000000;
        return mb;
    }

    public double getGb() {
        double gb = bytes/1073741824;
        return gb;
    }

}


















