package ru.klimov.java.course.pattern.builders;

import ru.klimov.java.course.pattern.builders.cars.CarType;
import ru.klimov.java.course.pattern.builders.components.Engine;
import ru.klimov.java.course.pattern.builders.components.GPSNavigator;
import ru.klimov.java.course.pattern.builders.components.Transmission;
import ru.klimov.java.course.pattern.builders.components.TripComputer;

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
