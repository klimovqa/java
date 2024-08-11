package ru.klimov.java.course.pattern.creational.builders;

import ru.klimov.java.course.pattern.creational.builders.cars.CarType;
import ru.klimov.java.course.pattern.creational.builders.components.Engine;
import ru.klimov.java.course.pattern.creational.builders.components.GPSNavigator;
import ru.klimov.java.course.pattern.creational.builders.components.Transmission;
import ru.klimov.java.course.pattern.creational.builders.components.TripComputer;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
