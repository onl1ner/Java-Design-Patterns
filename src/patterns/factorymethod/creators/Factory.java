package patterns.factorymethod.creators;

import patterns.factorymethod.products.ITransport;

public abstract class Factory {
    
    public void deliver() {
        ITransport transport = this.create();
        transport.deliver();
    }

    public abstract ITransport create();

}
