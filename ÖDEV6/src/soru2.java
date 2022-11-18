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
public class soru2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Sayı giriniz");
        int a=input.nextInt();

        int s=0,k;
        for(int i=2;i<a-1;i++){
            if(a%i==0){
                s=s+1;   
            }
            if(s==0){
               k=0;
               k=1;
                
            }
        }
                
        
    }
    
}
