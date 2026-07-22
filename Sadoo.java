//main class 
package sadoo;

import java.util.Scanner;

 
public class Sadoo {
 static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter the pharmacyname please:");
       Pharmacy ph1=new Pharmacy(in.next());
       
        for (int i = 0; i < 1; i++) {
            System.out.println("enter the  patiantname");
            
         Prescription p=new Prescription(in.next()); 
           p.displayPrescription();System.out.print(1+i+".");
           
             System.out.println("the number the tablet for patiant "+(1+i));
       Medication t=new Tablet( in.next(),in.nextInt(),in.nextDouble(),in.nextInt());
        System.out.println("enter the syrup for patiant"+(1+i));
         Medication s=new Syrup( in.next(),in.nextInt(),in.nextDouble(),in.nextInt());
            ph1.listPrescriptions();
            ph1.listmedications();
              t.displayInfo();
              s.displayInfo();
        }
 
       
    }
   
     }
        
     
    
  
