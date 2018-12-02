import java.util.Random;
import java.util.Scanner;

public class TestIsTest4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("введите кол-во чисел");
        int kol=sc.nextInt();
        int[] mas=new int[kol];
        Random ran=new Random();
        int otr=0;
        int pol=0;
        int sumOtr=0;
        int j=0;
        int minPol=0;
        //заполняем массив числами
        for (int i=0;i<kol;i++){
            mas[i]=ran.nextInt();
        }
        //находим первое положительное число
        while (mas[j]<=0&&j<kol){
            j++;
        }
        if(mas[j]>0){
            minPol=mas[j];
        }
        System.out.println(mas[j]);
        for (int i=0;i<kol;i++){
            System.out.println(mas[i]);
            if (mas[i]<0) {
                //считаем число отриц. чисел
                otr++;
                //считаем сумму отрицательных чисел
                sumOtr=sumOtr+mas[i];

            } else if (mas[i]>0){
                //считам число полож.чисел
                pol++;
                //находим самое маленькое полож. число
                if (minPol>mas[i]){
                    minPol=mas[i];
                }
            }
        }
        System.out.println("всего отрицательных чисел "+otr);
        System.out.println("всего положительных чисел "+pol);
        System.out.println("сумма всех отрицательных чисел "+sumOtr);
        if (minPol == 0){
            System.out.println("тут нет положительных чисел");
        } else {
            System.out.println("самое маленькое положительное число "+minPol);
        }
        System.out.println("четвертое задание "+Math.pow(minPol,otr));
    }
}
