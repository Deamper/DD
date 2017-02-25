import java.util.Scanner;

// Created by Deamper on 21.02.2017.
public class Third {
    public static void main(String[] args) {
//Считываем значения А и В с клавиатуры
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число A");
        int nomber_A = in.nextInt();
        System.out.println("Введите число В:");
        int nomber_B = in.nextInt();
//Определяем их значения согласно условию задачи

        if( nomber_A!=nomber_B){
            System.out.println("Значение А = " + (nomber_A+nomber_B));
            System.out.println("Значение В = " + (nomber_A+nomber_B));
        }
        else{
            System.out.println("Значение А = " + (nomber_A = 0));
            System.out.println("Значение B = " + (nomber_B = 0));
        }
    }
}
