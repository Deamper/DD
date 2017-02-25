public class Eleven {
    public static void main(String[] args) {
        //Создает массив , используя new mas[arraySize];
        //Ссылка на недавно созданный массив присваивается переменной arrayRef.
        int [] myArray ={2,4,6,8,10,12,14,16,18,20} ;
        for (int i=0; i<myArray.length;i++) {
            System.out.printf(myArray[i]+ ", ");
        }
        for (int j=0;j<myArray.length;j++){
            System.out.println(myArray[j]);
        }
    }
}