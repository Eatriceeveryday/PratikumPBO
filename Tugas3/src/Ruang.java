public class Ruang extends Bidang {
    double height;

    public Ruang(double length, double wide, double height) {
        super(length, wide);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    double volume(){
        return length*wide*height;
    }
    double surfacearea(){
        return 2*length*wide + 2*length*height + 2*wide*height;
    }
}
