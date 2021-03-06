package patterns.factorymethod.creators;

import patterns.factorymethod.products.ITransport;
import patterns.factorymethod.products.Truck;

public class TruckFactory extends Factory {

    @Override
    public ITransport create() {
        return new Truck();
    }
    
}
