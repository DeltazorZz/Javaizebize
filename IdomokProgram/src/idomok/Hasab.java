package idomok;

public class Hasab extends FaIdom {
    private double a,b,magassag;

    public Hasab(double a, double b, double magassag) {
        this.a = a;
        this.b = b;
        this.magassag = magassag;
    }

    @Override
    public String toString() {
        return "Hasab{" + "a=" + a + ", b=" + b + ", magassag=" + magassag + '}';
    }

    @Override
    public double terfogat() {
        return super.terfogat();
    }
    
    
}
