import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String[] chisla = n.split("");
        int[] bits = new int[7];
        for (int i = 0; i < 7; i=i+1) {
            bits[i] = Integer.parseInt(chisla[i]);
        }
        int s1 = (bits[0] + bits[2] + bits[4] + bits[6]) % 2;
        int s2 = (bits[1] + bits[2] + bits[5] + bits[6]) % 2;
        int s3 = (bits[3] + bits[4] + bits[5] + bits[6]) % 2;

        int sindrom = (s3*4 + s2*2 + s1*1) - 1;

        if (sindrom >= 0) {
            System.out.println("Ошибка в " + (sindrom + 1) + " позиции");
            if (bits[sindrom] == 0) {
                bits[sindrom] = 1;
            } else {
                bits[sindrom] = 0;
            }
        } else {
            System.out.println("Ошибок не обнаружено.");
        }
        System.out.println("" + bits[2] + bits[4] + bits[5] + bits[6]);
    }
}
