package HomeWork5;

public class WarAirTransport extends AirTransport {
    boolean bailoutSystem;
    int totalRockets;

    WarAirTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int minimumRunway,
                    boolean bailoutSystem, int totalRockets) {
        super(power, maxSpeed, weight, brand, wingspan, minimumRunway);
        this.totalRockets = totalRockets;
        this.bailoutSystem = bailoutSystem;
    }

    String getInformation() {
        return "Лошадиных сил : " + power + ". Максимальная скорость km/h : " + maxSpeed + "/ Вес(Kg) : " + weight +
                ". Брэнд : " + brand
                + ". Размах крыла(M) : " + wingspan + " Минимальная длина полосы для взлёта(M) : " + minimumRunway +
                ". Количество ракет : " + totalRockets + ". Система спасения : " +
                bailoutSystem + ". Мощность в киловатах : " + powerKW();
    }

    void shot() {
        int shots = totalRockets;
        for (int i = 0; i <= shots; i++) {
            if (totalRockets > 0) {
                System.out.println("Запуск ракеты");
                totalRockets--;
            } else {
                System.out.println("Нет боеприпасов");
            }
        }
    }

    void bailout() {
        if (bailoutSystem) {
            System.out.println("Катапультирование пршло успешно");
        } else {
            System.out.println("Нет системы спасения");
        }
    }
}
