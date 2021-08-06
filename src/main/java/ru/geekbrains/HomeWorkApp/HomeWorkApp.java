package ru.geekbrains.HomeWorkApp;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class HomeWorkApp {

    public static void main(String[] args) {
printThreeWords();
checkSumSign();
printColor();
compareNumbers();

    }

public static void printThreeWords(){

    System.out.println("Orange");
    System.out.println("Banana");
    System.out.println("Apple");

    // ну тут все просто - мучаюсь с GIT

}

    public static void checkSumSign(){
    int a = 5;
    int b = -7;
    int res = a + b;
         String SumSign = res > 0 ? "Сумма положительная" : "Сумма отрицательная" ;

        System.out.println(SumSign);

    }
public static void printColor() {
    int value = -11;

    if (value <= 0) {
                 System.out.println("Красный");

    } else if ((0 < value) && (value <= 100)) {

                System.out.println("Желтый");
    } else      System.out.println("Зеленый");

}

   public static void compareNumbers() {
int a = 10;
int b =  100;
//String res2 = a >= b ? "a >= b" : "a < b" ; // будет выводиться без ковычек
String res2 = a >= b ? "\"a >= b\"" : "\"a < b\"" ; // но согласно заданию должно быть так
       System.out.println(res2);
   }


}
