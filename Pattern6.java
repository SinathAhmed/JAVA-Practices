import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedList;
public class first {
    public static void main(String[] args){
        System.out.println("Hello World \n");

    /*  * * * * *
        *       *
        *       *
        *       *
        * * * * *  */

       for (int row= 1; row<= 5; row++) { // a = 5
             if (row==1 || row==5){
                for (int col= 1; col<= 5; col++) {
                        System.out.print("* ");
                }
                System.out.print("\n");
             }
             else {
                 for (int col= 1; col<= 5; col++) {
                    if (col==1 || col==5) {
                     System.out.print("* ");
                    }
                    else System.out.print("  ");
                 }
                     System.out.print("\n");
             }
        }
    }
}
