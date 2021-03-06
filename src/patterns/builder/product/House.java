package patterns.builder.product;

import java.util.ArrayList;

public class House {
    
    // Optional house components.
    private final String garage = "garage";
    private final String swimmingPool = "swimming pool";
    private final String statues = "statues";
    private final String garden = "garden";

    // Default house components.
    private final String walls = "walls";
    private final String floor = "floor";
    private final String roof = "roof";

    private ArrayList<String> components = new ArrayList<String>();

    public void print() {
        System.out.println("You built a house: ");

        for (String component : this.components) {
            System.out.println("– with " + component);
        }
    }

    public House(Boolean needsGarage, Boolean needsPool, 
                 Boolean needsStatues, Boolean needsGarden) {
        // Every house has walls,
        // floor and roof.
        this.components.add(this.walls);
        this.components.add(this.floor);
        this.components.add(this.roof);

        if (needsGarage) this.components.add(this.garage);
        if (needsPool) this.components.add(this.swimmingPool);
        if (needsStatues) this.components.add(this.statues);
        if (needsGarden) this.components.add(this.garden);
    }
}
