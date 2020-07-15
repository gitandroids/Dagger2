package dagger;

import car.Rims;
import car.Tires;
import car.Wheels;

@Module
public abstract class WheelsModule {   // If all of @provides are static then make the class abstract
    // make them static for better performance . Dagger call them directly on the class without instantiating.
    @Provides
    static Rims provideRims() {
        return new Rims();
    }
    // We can use Provides methods to do any configuration before returning them.
    // Whenever Dagger needs this object it calls this and creates Tires and call the method and return the object.
    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }
    // Just like injected constructor we can use the rims and tires as argument. Because Dagger know where they came from.
    // that means the tires below will be inflated because of provideTires method above.
    @Provides
    static Wheels provideWheels(Rims rims , Tires tires) {
        return new Wheels(rims, tires);
    }
}
