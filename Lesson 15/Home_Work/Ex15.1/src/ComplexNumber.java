import java.util.Objects;

public class ComplexNumber {
    private final double re;
    private final double im;
    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }
    public double getRe() {
        return re;
    }
    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComplexNumber that)) return false;
        return Double.compare(that.getRe(), getRe()) == 0 && Double.compare(that.getIm(), getIm()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRe(), getIm());
    }
}
