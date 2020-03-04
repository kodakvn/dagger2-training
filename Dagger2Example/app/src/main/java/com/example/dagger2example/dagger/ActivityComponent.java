package com.example.dagger2example.dagger;

import com.example.dagger2example.MainActivity;
import com.example.dagger2example.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@ActivityScope
@Component (dependencies = AppComponent.class, modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        Builder appComponent(AppComponent component);

        ActivityComponent build();
    }
}
