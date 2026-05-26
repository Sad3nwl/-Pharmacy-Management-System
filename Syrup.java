 
package sadoo;


public class Syrup extends Medication{

    public Syrup(String name , int dosage,double price, int quantity) {
        super(name,dosage, price, quantity);
    }

    @Override
    public void displayInfo() {
        System.out.println(
                "{'Name: " + getName()+"  "+
                  "dosage: "+getDosage()+
                 " Price: " + getPrice() +"  "+
                " Quantity:" + getQuantity()+"'}");
     }

     
    
}
