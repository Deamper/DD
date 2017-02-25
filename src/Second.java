import java.util.Scanner;

// Created by Deamper on 21.02.2017.
public class Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int nomber = in.nextInt();

        if (nomber > 0 ){
            System.out.println(nomber+1);
        } if(nomber<0){
            System.out.println(nomber-2);
        } else {
            System.out.println(nomber = 10);
        }
    }
}
