package chapter1;

public class Exercises{
    public static void main (String [] args) {
        // questionOne();
        // secondQuestion();
        thirdQuestion();
    }
    public static void questionOne(){
        int x = 3;
        while (x > 0){
            if (x == 2){
                System.out.print("b c");
            }
            if (x > 2) {
                System.out.print("a");
            }
            x = x - 1;
            System.out.print("-");
            if (x == 1){
                System.out.print("d");
                x -= 1;
            }
        }
    }

    public static void secondQuestion(){
        int x = 5;
        while (x>1){
            x -= 1;
            if (x < 3){
                System.out.println("small x");
            }
        }
    }

    public static void thirdQuestion(){
        // this will go into infinite loop
        int x = 1;
        while (x < 10){
            if (x > 3){
                System.out.println("lol");
            }
        }
    }
}
