package ClassesCar;

import java.time.LocalDate;

public class CarInfo {
    private LocalDate years;
    private String model;
    private int summa;
    private String color;

    public CarInfo(LocalDate years, String model, int summa, String color) {
        this.years = years;
        this.model = model;
        this.summa = summa;
        this.color = color;
    }

    public LocalDate getYears() {
        return years;
    }

    public void setYears(LocalDate years) {
        this.years = years;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSumma() {
        return summa;
    }

    public void setSumma(int summa) {
        this.summa = summa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "years=" + years +
                ", model='" + model + '\'' +
                ", summa=" + summa +
                ", color='" + color + '\'' +
                '}';
    }
}
