package dagger;

import car.DieselEngine;
import car.Engine;

@Module
public class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
     Engine provideEngine() {
         return new DieselEngine(horsePower);
     }
}
