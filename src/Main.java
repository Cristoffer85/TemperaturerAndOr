import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Nedan ett program som bedömer hur varmt kallt det är beroende på temperatur: ");

        Scanner Jamfortalstorstaforst = new Scanner(System.in);
        System.out.print("Ange temperatur: ");
        int Tal1 = Jamfortalstorstaforst.nextInt();

        if (Tal1 >-500 && Tal1<-50) {
            System.out.println("Aagh jag fryser ihjäl");
        } else if (Tal1 >-50 && Tal1<-30) {
            System.out.println("Vansinnigt kallt");
        } else if (Tal1 >-30 && Tal1<-20) {
            System.out.println("Askallt");
        } else if (Tal1 >-20 && Tal1<-10) {
            System.out.println("t");
        } else if (Tal1 >-10 && Tal1<0) {
            System.out.println("g");
        } else if (Tal1 >0 && Tal1<10) {
            System.out.println("h");
        } else if (Tal1 >10 && Tal1<20) {
            System.out.println("j");
        } else if (Tal1 >20 && Tal1<27) {
            System.out.println("k");
        } else if (Tal1 >27 && Tal1<30) {
            System.out.println("l");
        } else if (Tal1 == 40) {
            System.out.println("ö");
        } else if (Tal1 == 50) {
            System.out.println("o");
        } else if (Tal1 >= 50) {
            System.out.println("u");
        }
    }
}
