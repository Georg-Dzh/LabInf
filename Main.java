import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        int S1=0;
        int S2=0;
        int S3=0;
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String[] chisla = n.split("");
        List<String> list = new ArrayList<>();
        for (String res : chisla){
            list.add(res);
        }
        if ((Integer.parseInt(list.get(0))+Integer.parseInt(list.get(2))
            +Integer.parseInt(list.get(4)) +Integer.parseInt(list.get(6)))%2!=0){
            S1=1;
        }
        if ((Integer.parseInt(list.get(1))+Integer.parseInt(list.get(2))
            +Integer.parseInt(list.get(5))+Integer.parseInt(list.get(6)))%2!=0){
            S2=1;
        }
        if ((Integer.parseInt(list.get(3))+Integer.parseInt(list.get(4))
            +Integer.parseInt(list.get(5))+Integer.parseInt(list.get(6)))%2!=0){
            S3=1;
        }
        int Sindrom = (S3*4+S2*2+S1*1)-1;
        if (Sindrom>0){
            System.out.println("Ошибка в "+(Sindrom+1)+" позиции");
            if (Integer.parseInt(list.get(Sindrom))==0){
                list.set(Sindrom,"1");
            } else {
                list.set(Sindrom,"0");
            }
            System.out.print(list.get(2)+list.get(4)+list.get(5)+list.get(6));
        }
    }
}