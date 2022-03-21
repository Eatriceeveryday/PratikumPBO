public class Bidang {
    double length , wide ;

    public Bidang(double length, double wide) {
        this.length = length;
        this.wide = wide;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    double circumference(){
        return 2*length+2*wide;
    }

    double area (){
        return length*wide;
    }
}
