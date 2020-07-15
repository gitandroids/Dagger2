package gitandroid.com.dagger2example;

import dagger.Component;

@Component(modules = WheelsModule.class)     // The most important part of Dagger.
public interface CarComponent {   // The Injector.
    Car getCar();
    void inject(MainActivity mainActivity);
}
