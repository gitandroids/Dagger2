package gitandroid.com.dagger2example;

import android.util.Log;

import javax.inject.Inject;  // If you want to use different dependency injection Framework , you don't have to change this.
                             // JSR 330 - Java Specification Request. The annotations that standardized.
public class Car {
    private static final String TAG = "Car";
    private Engine engine;
    private Wheels wheels;
    //This is called constructor injection . You can only use Inject annotation on a single constructor in the class.
    // Now dagger knows that this is the way to instantiate the car object. This is constructor injection .
    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive() {
        Log.d(TAG, "driving ..");
    }
}
