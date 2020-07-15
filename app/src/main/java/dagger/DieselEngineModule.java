package dagger;

import car.DieselEngine;
import car.Engine;

@Module
public abstract class DieselEngineModule {
    @Binds // Binds method only takes one argument that is the implementation for the interface.Binds PetrolEngine implementation to the Engine interface.
    abstract Engine bindEngine(DieselEngine engine);
}
