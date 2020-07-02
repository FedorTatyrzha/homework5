package HomeWork5;

public class Truck extends GroundTransport {
    int carrying;

     Truck(int power, int maxSpeed, int weight, String brand, int numberOfWheels, int fuelConsumption, int carrying) {
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.carrying = carrying;

    }
    String getInformation() {
        return "Лошадиных сил : " + power + ". Максимальная скорость km/h : " + maxSpeed + ". Вес(Kg) : " + weight +
                ". Брэнд : " + brand + ". Кол-во колес : " + numberOfWheels + ". Расход топлива(L/100km) : "
                + fuelConsumption + ". Грузоподъемность(T) : " + carrying + ". Мощность в киловатах : " + powerKW();
    }

    void maxCarrying(int cargoWeight) {
        if (cargoWeight < carrying) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нуже грузовик больше");
        }
    }
}

