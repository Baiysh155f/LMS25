import ClassesCar.Car;
import ClassesCar.CarInfo;

import java.time.LocalDate;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Car, CarInfo> hashMap = new HashMap<>();
        hashMap.put(new Car(1111,777),new CarInfo(LocalDate.of(2000,5,20),"Mercedes benz",10000,"blue"));
        hashMap.put(new Car(2222,888),new CarInfo(LocalDate.of(2013,5,20),"Audi",10000,"red"));
        hashMap.put(new Car(3333,999),new CarInfo(LocalDate.of(2015,5,20),"Toyota",10000,"gray"));
        hashMap.put(new Car(4444,101),new CarInfo(LocalDate.of(2022,5,20),"BMW",10000,"black"));
        System.out.println(hashMap.entrySet());
    }
}