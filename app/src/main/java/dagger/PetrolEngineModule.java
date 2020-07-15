package dagger;

import car.Engine;
import car.PetrolEngine;

@Module
public abstract class PetrolEngineModule {
    @Binds // Binds method only takes one argument that is the implementation for the interface.Binds PetrolEngine implementation to the Engine interface.
    abstract Engine bindEngine(PetrolEngine engine);
}
