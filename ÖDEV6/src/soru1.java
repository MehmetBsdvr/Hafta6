/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehmet
 */
import java.util.Scanner;
public class soru1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Sayı giriniz");
        int a=input.nextInt();
        
        int b=2;
        
        while(a>1){
            if(a%b==0){
                b=b+1;
            }
            a=a/b;
            System.out.print(" "+b);
            }  
        System.out.println(" ASAL BÖLENLERİ ");
    }
    }
    

