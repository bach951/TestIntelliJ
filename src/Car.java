public class Car {
    private String name;
    private int yearRelease;
    private String brand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Car(String name, int yearRelease, String brand) {
        this.name = name;
        this.yearRelease = yearRelease;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yearRelease=" + yearRelease +
                ", brand='" + brand + '\'' +
                '}';
    }
}
