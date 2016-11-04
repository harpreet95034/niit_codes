/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phone_rating;

/**
 *
 * @author VAS_student
 */import java.util.Scanner;
public class Phone_rating {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        customer cs = new customer();
        cs.takeinput();
        cs.dispavg();
    }
    
}
class customer 
{
    String[] name = new String[10] ;
    int[] rate = new int[10] ;
    int trate=0;
    void takeinput()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
             System.out.println("enter name of Customer number : "+(i+1));
             name[i]= sc.next();
             System.out.println("Rate the phone out of 5 : ");
             rate[i]= sc.nextInt();
        }
        
       for (int i= 0 ;i<10;i++)
       {
           trate += rate[i];
       }
    }
    
    void dispavg()
    {
        double avg = (trate/10d);
        System.out.println("Average rating for the phone is "+ avg);
    }
}
