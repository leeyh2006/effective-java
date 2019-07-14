package ch03.item17;

public final class Complex {
    private final double re;
    private final double im;

    private Complex(double re ,double im){
        this.re = re;
        this.im = im;
    }

    public static Complex valueOf(double re, double im){
        return new Complex(re,im);
    }

    public double realPart() { return re; }
    public double imaginaryPart() { return im; }

    public Complex plus(Complex c){
        return new Complex(re+c.re, im + c.im);
    }

    public Complex minus(Complex c){
        return new Complex(re - c.re, im -c.im);
    }

    public Complex time(Complex c){
        return new Complex(re * c.re - im * c.im, re * c.im + im * c.re);
    }

    public Complex diviedBy(Complex c){
        double tmp = c.re * c.re + c.im * c.im;
        return new Complex(re * c.re + im * c.im / tmp, (im * c.re - re * c.im) /tmp);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return Double.compare(complex.re, re) == 0 &&
                Double.compare(complex.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * Double.hashCode(re) + Double.hashCode(im);
    }

    @Override
    public String toString() {
        return "Complex{" +
                "re=" + re +
                ", im=" + im +
                '}';
    }
}
