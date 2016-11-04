/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer_spending;

/**
 *
 * @author VAS_student
 */import java.util.Scanner;
public class Customer_spending {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        customer cs= new customer();
        cs.takeinput();
        cs.distotalprice();
        cs.disppersalary();
    }
    
}
class customer
{
    String name ;
    int products ;
    int pspend;
    int total=0;
    
    void takeinput()
    {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name : ");
        name = sc.nextLine();
        System.out.println("enter total number of products you purchased : ");
        products = sc.nextInt();
        int[] quantity= new int[products];
        int[] tprice = new int[products] ;
         int[] price = new int[products];
        for (int i =0 ;i<products ; i++)
        {
            System.out.println("enter quantity for product number : "+ (i+1));
            quantity[i]= sc.nextInt();
           // System.out.println(quantity[i]);
             System.out.println("enter price of product number : "+ (i+1));
            price[i] = sc.nextInt();
            tprice[i]=price[i]*quantity[i];
        }
        
            for(int i =0;i<products;i++)
            {
                total = total+tprice[i];
            }
    }
     void distotalprice()
        {
            
            System.out.println("total money spend by "+name+" is "+total);
        }
     void disppersalary()
     {
         float per = (total/10000f)*100;
         System.out.println("percentage of salary spend by "+name +" is "+per+ "%");
     }
    
}