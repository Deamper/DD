import java.util.Random;

//12. Создайте массив из 15 случайных целых чисел из отрезка [0;9].
//Выведите массив на экnран. Подсчитайте сколько в массиве чётных элементов
// и выведете это количество на экран на отдельной строке.
public class Twelve {
    public static void main(String[] args) {
   int [] myArray = new int[15];
        Random random = new Random();
        for (int i=0; i<myArray.length;i++){
           myArray[i] =0+ random.nextInt(10);
            System.out.print(myArray[i]+" ");
        }
    }
}
