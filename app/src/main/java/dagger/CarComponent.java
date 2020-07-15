package dagger;

import car.Car;
import gitandroid.com.dagger2example.MainActivity;

@Component(modules = {WheelsModule.class,DieselEngineModule.class})     // The most important part of Dagger.
public interface CarComponent {   // The Injector.
    Car getCar();
    void inject(MainActivity mainActivity);
}
