package FunktionTask;

import java.util.Scanner;

public class Funktion {
    /*Вводим n - это то, сколько будет слагаемых
Потом есть фиксированный набор x
И считаешь эту функцию для всех х
И выводишь x = ... f(x) = ...*/
    public void count() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select n: ");
        int n = scanner.nextInt();
        double[]x = new double[]{0.6, 0.7, 0.8, 0.9};
        double fx = 0;
        System.out.println(String.format("%-10s%-10s", "x", "f(x)"));
       for(int i = 0;i<x.length;i++){
           for(int j = 0;j<=n;j++){
               fx += Math.pow((x[i] - 1), j)/Math.pow(x[i]*j, j);
           }
           System.out.println(String.format("%-10s%-10s", x[i], fx));
       }
    }
    public static void main(String[] args) {
        Funktion tester = new Funktion();
        tester.count();
    }
}
