package org.example;
import java.util.Scanner;
// this is the main logic of the game



public class Main {
    static int cheats = 0;
    static int mememoney = 11;
    static Scanner obj = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("welcome to JSGAS a Java version of my CLI game");
        System.out.println("select a level: LVL1");
        String lvlinput = obj.nextLine();
        if (lvlinput.equals("LVL1")) {
            lvl1();

        }

    }

    static void lvl1() {

        System.out.println("you are in the village what to do?");
        System.out.println("talk to the mayor -- shopkeeper");
        String cmdinput = obj.nextLine();

        if (cmdinput.equals("shopkeeper")) {
            shopkeeper();
        }
        if (cmdinput.equals("talk to the mayor")) {
            System.out.println("Hi *fart* oopsie doopsie");
            String mayortalk = obj.nextLine();
        }



    }

    static void shopkeeper() {
        System.out.println("Welcome to my shop! what can i get you?");
        System.out.println("i have: ");
        System.out.println("fartsword - 10");
        String buysomething = obj.nextLine();

        if (buysomething.equals("fartsword")) {
            if (mememoney > 10) {
                mememoney -= 10;
                System.out.println("you bought the fartsword for 10 mememoney!");
                shopkeeper();

            } else {
                if (mememoney < 10) {
                    System.out.println("you cant afford that");
                    shopkeeper();

                }
            }


        }
        if (buysomething.equals("exit")) {
            System.out.println("ewxiting the shopkeepers shop");
            lvl1();
        }



    }
}