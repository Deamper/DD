import java.util.Scanner;

// Created by Demper on 21.02.2017.
public class First {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int nomber = in.nextInt();
        if (nomber>0){
            System.out.println(nomber+1);
        }else {
            System.out.println("Число отрицательное или ноль: "+nomber);
        }
        System.out.println();
    }
}
