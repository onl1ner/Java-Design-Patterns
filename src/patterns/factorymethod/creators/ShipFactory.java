package patterns.factorymethod.creators;

import patterns.factorymethod.products.ITransport;
import patterns.factorymethod.products.Ship;

public class ShipFactory extends Factory {

    @Override
    public ITransport create() {
        return new Ship();
    }

}
