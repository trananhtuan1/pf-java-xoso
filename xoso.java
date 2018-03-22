import java.util.Scanner;

public class xoso {
    public static void main(String[] args) {
        int x;
        x = (int) (Math.random() * 100);
        System.out.println("x=" + x);

        Scanner scanner = new Scanner(System.in);

        int y;
        System.out.println("y =");
        y = scanner.nextInt();



        int sothu1 = x / 10;
        int sothu2 = x % 10;

        int sonhapthu1 = y / 10;
        int sonhapthu2 = y % 10;

        boolean giainhat = (x==y);
        boolean giainhi = (sothu1 == sonhapthu2 && sothu2 == sonhapthu1);
        boolean giaba = (sonhapthu1 == sothu2 || sonhapthu2 == sothu1 || sonhapthu1 == sothu1 || sonhapthu2 == sothu2);


        int dolaar = 0;

        if (giainhat) {
            dolaar = 10000;
        } else if (giainhi) {
            dolaar = 3000;
        } else if (giaba) {
            dolaar = 1000;
        }
        if (dolaar > 0) {
            System.out.println("bạn nhận được $" + dolaar);
        } else {
            System.out.println("chúc bạn may mắn");
        }


    }
}
