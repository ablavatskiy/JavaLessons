package org.example.stepik;

public class Boolean {
    public static void main(String[] args) {
        int temp  = 30;
        boolean hot = temp >= 25;
        boolean cold = temp <= 22;
        int time = 23;
        boolean night = time > 22 || time < 6;
        if (hot && night) {
            System.out.println("Кондиционер включен");}
        else if (cold) {
            System.out.println("Кондиционер выключен");}
        else {
            System.out.println("Кондицинер ничего не делает");



        }
    }
}
