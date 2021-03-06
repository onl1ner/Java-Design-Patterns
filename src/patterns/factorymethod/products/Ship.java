package patterns.factorymethod.products;

public class Ship implements ITransport {
    
    public void deliver() {
        System.out.println("Delivering by Ship!");
    }
    
}
