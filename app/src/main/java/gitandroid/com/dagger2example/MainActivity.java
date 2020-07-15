package gitandroid.com.dagger2example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject Car car ;   // For FIELD INJECTION we can not make variable private or final.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent component = DaggerCarComponent.create();
        component.inject(this); //FIELD INJECTION :take this activity and inject the variables start with Inject. In this case Car class.
        //car = component.getCar();
        car.drive();
    }
}
