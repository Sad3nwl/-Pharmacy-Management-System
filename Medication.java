 
package sadoo;
 
 abstract public class Medication {
    private String name;
    private int dosage;
     private double price;
    private int quantity;
   

    public Medication(String name,int dosage , double price, int quantity) {
        this.name = name;
        this.dosage=dosage;
         this.price = price;
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDosage() {
        return dosage;
    }

    public void setDosage(int dosage) {
        this.dosage = dosage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity>0){
        this.quantity = quantity;
        }else{
            System.err.println("this medician is not available");}
    }

     
    public  abstract void displayInfo() ;

    
    }
    
