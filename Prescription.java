  
package sadoo;

import java.util.ArrayList;

 
public class Prescription {
   private String patientName;
    private ArrayList<Medication> medications;    

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    
    

    public Prescription(String patientName) {
        this.patientName = patientName;
        this.medications = new ArrayList<>();
    }

    public void addMedication(Medication medication) {
        medications.add(medication);
    }

    public void displayPrescription() {
        System.out.println("Prescription for: " + patientName);
        for (Medication medication : medications) {
            medication.displayInfo();
        }
    }   

     
}
