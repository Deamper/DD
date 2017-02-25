import java.util.Scanner;

//Created by Deamper on 21.02.2017.
public class Four {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int nomber = in.nextInt();

     if (nomber %2 == 0){
         System.out.print("Четное ");
     }
         else {
         System.out.print("Не четное ");
     }
      if (nomber>99){
            System.out.print("трехзначное число");
        } else
         if (nomber>9){
            System.out.print("двузначное число");
        }else
         if (nomber<10 ){
            System.out.print("простое число");
         }

    }
}