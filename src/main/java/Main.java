import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        System.out.println("Введите первый коэффициент квадратного уравнения \"a\":");
        quadraticEquation.setA(Integer.parseInt(scanner.nextLine()));
        System.out.println("Введите второй коэффициент квадратного уравнения \"b\":");
        quadraticEquation.setB(Integer.parseInt(scanner.nextLine()));
        System.out.println("Введите свободный член квадратного уравнения \"c\":");
        quadraticEquation.setC(Integer.parseInt(scanner.nextLine()));
        Discriminant discriminant = new Discriminant();
        double discr = discriminant.discr(quadraticEquation.getA(), quadraticEquation.getB(), quadraticEquation.getC());
        System.out.println("Дискриминант квадратного уравнения равен " + discr);
        if (discr > 0) {
            double x1 = discriminant.root1(discr, quadraticEquation.getA(), quadraticEquation.getB());
            double x2 = discriminant.root2(discr, quadraticEquation.getA(), quadraticEquation.getB());
            System.out.println("Корни квадратного уравнения: " + x1 + ", " + x2);
        }
        if (discr == 0) {
            double x = discriminant.root1(discr, quadraticEquation.getA(), quadraticEquation.getB());
            System.out.println("Корень квадратного уравнения: " + x);
        }
        if (discr < 0) {
            System.out.println("Корней нет.");
        }
    }

}
