package dagger;

import javax.inject.Named;

import car.Car;
import car.PetrolEngine;
import gitandroid.com.dagger2example.MainActivity;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})     // The most important part of Dagger.
public interface CarComponent {   // The Injector.
    Car getCar();
    void inject(MainActivity mainActivity);
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(@Named("horse power")int horsePower);
        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);
        CarComponent build();
    }
}
