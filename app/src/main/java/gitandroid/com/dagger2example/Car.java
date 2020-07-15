package gitandroid.com.dagger2example;

import android.util.Log;

import javax.inject.Inject;  // If you want to use different dependency injection Framework , you don't have to change this.
                             // JSR 330 - Java Specification Request. The annotations that standardized.
public class Car {
    private static final String TAG = "Car";
    // Engine and wheels are dependencies of Car.
    private Engine engine;  //  @Inject Engine engine;  We could inject this with field injection.
    private Wheels wheels;
    //This is called constructor injection . You can only use Inject annotation on a single constructor in the class.
    // Now dagger knows that this is the way to instantiate the car object. This is constructor injection .
    @Inject
    public Car(Wheels wheels,Engine engine) {
        this.wheels = wheels;
        this.engine = engine;
        Log.d(TAG, "Constructor Injection called first.");
    }
    // Method Injection.If you have to pass the injected object itself to the dependency
    // Dagger will execute it after the constructor finished. We don't have to call this method.Dagger call this for us.
    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    public void drive() {
        Log.d(TAG, "driving ..");
    }
}
