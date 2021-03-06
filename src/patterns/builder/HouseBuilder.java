package patterns.builder;

import patterns.builder.product.House;

public class HouseBuilder implements IBuilder {

    private Boolean needsGarage = false;
    private Boolean needsPool = false;
    private Boolean needsStatues = false;
    private Boolean needsGarden = false;

    @Override
    public void buildGarage() {
        this.needsGarage = true;
    }

    @Override
    public void buildSwimmingPool() {
        this.needsPool = true;
    }

    @Override
    public void buildStatues() {
        this.needsStatues = true;
    }

    @Override
    public void buildGarden() {
        this.needsGarden = true;
    }
    
    public House getResult() {
        return new House(this.needsGarage, this.needsPool, this.needsStatues, this.needsGarden);
    }
}
