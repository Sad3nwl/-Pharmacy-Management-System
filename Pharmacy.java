
package sadoo;
 
import java.util.ArrayList;

public  class Pharmacy  {
   private   String name;
   private ArrayList<Medication> medications;
   private ArrayList<Prescription> prescriptions;
   

    public Pharmacy(String name) {
        this.name = name;
        this.medications=new ArrayList<>();
        this.prescriptions = new ArrayList<>();
    }
     
    public void addmedication(Medication medicaition1){
        medications.add(medicaition1);
        
    }
       public void addPrescription(Prescription prescription1) {
        prescriptions.add(prescription1);
    }
public void listmedications() {                   
        
        for (Medication medication : medications) {
            medication.displayInfo();
        }
    }

    public void listPrescriptions() {
        System.out.println("Prescriptions in " + name + ":");
        for (Prescription p : prescriptions) {
            p.displayPrescription();
    }

 
        }
}
         
    
    

