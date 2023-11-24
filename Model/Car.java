package Model;

import java.util.Objects;

public class Car {
    private String license;
    private String model;
    private int age;
    public Car(String license, String model, int age) {
        this.license = license;
        this.model = model;
        this.age = age;
    }
    public Car(){
        this("","",-1);
    }

    public String getLicense() {
        return license;
    }

    public String getModel() {
        return model;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(license, car.license);
    }

    @Override
    public int hashCode() {
        return Objects.hash(license);
    }

    @Override
    public String toString() {
        return "Car{" +
                "license='" + license + '\'' +
                ", model='" + model + '\'' +
                ", age=" + age +
                '}';
    }
}