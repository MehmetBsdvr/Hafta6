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
public class soru3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println(" Sayı 1 giriniz");
        int m=input.nextInt();
        
        System.out.println("Sayı 2 giriniz");
        int n=input.nextInt();
        
        int ta=0,tb=0;
        for(int i=1;i<m;i++){
            if(m%i==0){
                ta=ta+i;
            }
        }
        for(int j=1;j<n;j++){
            if(n%j==0){
               tb=tb+j;   
            }
        }
            if(m==ta && n==tb){
                System.out.print("Dost Sayıdır:");
            }
            else{
                System.out.print("Dost sayıdegildir:");
            }
          }
            
       }  
                     
             
        
    
    

