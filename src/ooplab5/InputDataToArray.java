package ooplab5;

import java.util.Scanner;

//1.declare array as Integer
//2.allow user to input data into array
//3.show data in array
public class InputDAtaToArray{
    private static  int MAX =5;
}
public static void main(String[]args){
    Integer[]num=new Integer[MAX];
//    int[]num2=new int[MAX];
    num=inputData(num);
    ShowData(num);
}

    private static void ShowData(Integer[] num) {
    System.out.println("Data in array:");
    for (int i=0;i<num.length;i++){
        System.out.println(num[i]+"");
    }
//enchance loop
for (int i:num){
        System.out.println(i+"");
}
}

    }

    private static Integer[]inputData(Integer[]num) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter an integer:");
    for (int i = 0; i < num.length; i++) {
        System.out.println("num[" + i + "]:");
        num[i] = Scanner.nextInt();
    }
    return num;
//}inputData