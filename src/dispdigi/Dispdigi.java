/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dispdigi;
import java.lang.*;
import java.util.*;

/**
 *
 * @author dell1
 */
public class Dispdigi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scan=new Scanner(System.in);

       System.out.println("Enter a Number");
       int n=scan.nextInt();

       int r;
       while(n>0)
       {
        r=n%10;
        n=n/10;

        System.out.println(r);
       }
        System.out.println(n);
    }
    
}
