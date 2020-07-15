package gitandroid.com.dagger2example;

import javax.inject.Inject;

public class Wheels {
    // We don't own this class so we can not annotate it with @Inject
    private Rims rims;
    private Tires tires;
    public Wheels(Rims rims , Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
