package gitandroid.com.dagger2example;

import dagger.Component;

@Component     // The most important part of Dagger.
public interface CarComponent {   // The Injector.
    Car getCar();
}
