package patterns.factorymethod.products;

public class Truck implements ITransport {
    
    public void deliver() {
        System.out.println("Delivering by Truck!");
    }
    
}
