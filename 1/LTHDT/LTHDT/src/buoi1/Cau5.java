package buoi1;

import java.util.Scanner;

public class Cau5 {
    public void pTrinhBac1(Double a, Double b) {

        double x;
        if (a == 0) {
            System.out.println("Unsolution equation");
        } else {
            x = -b / a;
            System.out.println("Phuong trinh co nghiem x = " + x);

        }
    }

    private void pTrBac2(double a, double b, double c) {
        double delta, x;
        if (a == 0) {
            x = -c / b;
        } else {
            delta = b * b - 4 * a * c;
            if (delta == 0) {
                System.out.println("Phuong trinh co nghiem: " + (-b / (2 * a)));

            } else if (delta > 0) {
                System.out.println("Phuong trinh co 2 nghiem phan biet: \nx1: " + ((-b + Math.sqrt(delta)) / (2 * a))
                        + "\nx2: " + ((-b - Math.sqrt(delta)) / (2 * a)));
            } else {
                System.out.println("Phuong trinh vo nghiem:");
            }
        }
    }

    public static void main(String[] args) {
        Cau5 giaipt = new Cau5();
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 2 tham so a va b:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        giaipt.pTrinhBac1(a, b);
        double c;
        System.out.println("Nhap 3 tham so a va b, c:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        giaipt.pTrBac2(a, b, c);
        sc.close();
    }
}
