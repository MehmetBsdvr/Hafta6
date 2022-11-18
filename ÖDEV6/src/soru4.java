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
public class soru4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println(" Sayı giriniz ");
        int a=input.nextInt();
        
        int b=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                b=b+1;
            }
        }
            if(a%b==0){
                System.out.print("Aritmatik sayıdır:");
            }
            else{
                System.out.print("Aritmatik sayı degildir");
            }
        }
    }
    

