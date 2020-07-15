package gitandroid.com.dagger2example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

import car.Car;
import car.DieselEngine;
import dagger.CarComponent;
import dagger.DaggerCarComponent;
import dagger.DieselEngineModule;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car ;   // For FIELD INJECTION we can not make variable private or final.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent component = DaggerCarComponent.builder()    //.create() if the constructors has no arguments.
                .horsePower(150)
                .engineCapacity(1400)
                .build();
        component.inject(this); //FIELD INJECTION :take this activity and inject the variables start with Inject. In this case Car class.
        //car = component.getCar();
        car.drive();
    }
}
