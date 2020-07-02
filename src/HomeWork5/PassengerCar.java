package HomeWork5;


public class PassengerCar extends GroundTransport {
    String bodyType;
    int totalPassengers;

    public PassengerCar(int power, int maxSpeed, int weight, String brand, int numberOfWheels, int fuelConsumption, String
            bodyType, int totalPassengers) {
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.totalPassengers = totalPassengers;
    }

    private double fuelConsuptionDistance(double distance) {
        double fuelConsuptionDistance = fuelConsumption * (distance / 100);
        return fuelConsuptionDistance;

    }

    String getInformation() {
        return "Лошадиных сил : " + power + ". Максимальная скорость km/h : " + maxSpeed + ". Вес(Kg) : " + weight +
                ". Брэнд : " + brand + ". Кол-во колес : " + numberOfWheels + ". Расход топлива(L/100km) : "
                + fuelConsumption + ". Грузопдъемность : " + bodyType + " Кол-во пассажиров : " + totalPassengers +
                ". Мощность в киловатах : " + powerKW();
    }

    void kiloPerFuel(double time) {
        double distance = time * maxSpeed;
        System.out.println("За время " + time + "h Автомобиль " + brand + " движется с максимальной скоростью " + maxSpeed +
                " и проедет " + distance + "km и израсходует " +
                + fuelConsuptionDistance(distance) + "литров топлива.");
    }
}