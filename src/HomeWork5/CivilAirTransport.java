package HomeWork5;

public class CivilAirTransport extends AirTransport {
    int totalPassengers;
    boolean bissnes;

    CivilAirTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int minimumRunway,
                      int totalPassengers, boolean bissnes) {
        super(power, maxSpeed, weight, brand, wingspan, minimumRunway);
        this.totalPassengers = totalPassengers;
        this.bissnes = bissnes;
    }

    String getInformation() {
        return "Лошадиных сил : " + power + ". Максимальная скорость km/h : " + maxSpeed + ". Вес(Kg) : " + weight +
                ". Брэнд : " + brand + ". Размах крыла(M) : " + wingspan + ".  Минимальная длина полосы для взлёта (M) : "
                + minimumRunway + ". Количество пассажиров : " + totalPassengers + ". Бизнесс класс : " +
                bissnes + ". Можеость в киловатах : " + powerKW();
    }

    void maxPassengers(int passengers) {
        if (passengers < totalPassengers) {
            System.out.println("Самолет загружен");
        } else {
            System.out.println("Вам нужен самолет больше");
        }
    }
}


