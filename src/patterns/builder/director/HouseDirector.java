package patterns.builder.director;

import patterns.builder.*;

public class HouseDirector {
    
    public void constructHouse(HouseType type, IBuilder builder) {
        switch (type) {
            case DEFAULT: break;
            case WITHGARAGE: builder.buildGarage(); break;
            case WITHPOOL: builder.buildSwimmingPool(); break;
            case WITHSTATUES: builder.buildStatues(); break;
            case WITHGARDEN: builder.buildGarden(); break;
        }
    }
}
