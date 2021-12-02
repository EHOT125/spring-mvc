package web.models;

public class Car {
    private String model;
    private String fireRate;
    private Integer crew;

    public Car() {
    }

    public Car(String model, String fireRate, Integer crew) {
        this.model = model;
        this.fireRate = fireRate;
        this.crew = crew;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFireRate() {
        return fireRate;
    }

    public void setFireRate(String fireRate) {
        this.fireRate = fireRate;
    }

    public Integer getCrew() {
        return crew;
    }

    public void setCrew(Integer crew) {
        this.crew = crew;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", fireRate='" + fireRate + '\'' +
                ", crew=" + crew +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        if (fireRate != null ? !fireRate.equals(car.fireRate) : car.fireRate != null) return false;
        return crew != null ? crew.equals(car.crew) : car.crew == null;
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + (fireRate != null ? fireRate.hashCode() : 0);
        result = 31 * result + (crew != null ? crew.hashCode() : 0);
        return result;
    }
}
