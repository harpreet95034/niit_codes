/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_grade;

/**
 *
 * @author VAS_student
 */import java.util.Scanner;
public class Student_grade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student s = new student();
        s.takeinput();
        s.disperc();
        s.dispgrade();
    }
}
    class student
    {
        String name ;
        int[] sub = new int[5];
        int total ;
        float grade;
        
        void takeinput()
        {
            Scanner sc = new Scanner(System.in);
             System.out.println("enter the name of the student : ");
             name = sc.nextLine();
             for (int i =1;i<6;i++)
             {
                 System.out.println("enter the grade for subject : "+ i +" : out of 100");
                 sub[i-1]= sc.nextInt();
                 System.out.println(sub[i-1]);
             }
             total = sub[0]+sub[1]+sub[2]+sub[3]+sub[4];
             System.out.println(total);
             float t = total/500.0f;
             System.out.println(t);
             grade = t*100;
             
             System.out.println(grade);
        }
        void disperc()
        {
            System.out.println("percentage for "+name+" is : "+grade );
        }
        void dispgrade()
        {
            if (grade >85)
            {
                System.out.println(name +" has secured A+ grade");
            }
            else if (grade>75)
            {
                System.out.println(name +" has secured B+ grade");
            }
            else if (grade>65)
            {
                System.out.println(name +" has secured C+ grade");

            }
            else if (grade >55)
            {
                System.out.println(name +" has secured D+ grade");
            }
            else 
                System.out.println(name +" has failed");
        }
        
            
    }

