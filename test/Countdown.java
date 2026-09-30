
package test;

public class Countdown {

    public static void main(String[] args) {
        
        System.out.println("Countdown to Launch: ");

        for(int i = 1; i <= 20; i=i+2) {
            System.out.print(i + 1 + " "); 
        }

        System.out.println("Blast Off!");
    }
}
