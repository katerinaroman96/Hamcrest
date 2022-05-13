public class Discriminant {

    public double discr(int a, int b, int c) {
        return b * b - 4 * a * c;
    }

    public double root1(double d, int a, int b) {
        return (-b + Math.sqrt(d)) / (2 * a);
    }

    public double root2(double d, int a, int b) {
        return (-b - Math.sqrt(d)) / (2 * a);
    }

    public Double[] roots(double x1, double x2) {
        Double[] arrayOfRoots = {
                x1,
                x2
        };
        return arrayOfRoots;
    }

}
