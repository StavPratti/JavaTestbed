package gr.aueb.cf.ch16.clone;

public class Trainee { //implements Cloneable {
    private String name;
    private City city;

    public Trainee() {

    }

    public Trainee(String name, City city) {
        this.name = name;
        this.city = city;
    }

    // Copy Constructor
    // Instead of cloneable interface
    public Trainee(Trainee trainee) {
        this.name = trainee.name;
        this.city = new City(trainee.getCity()); // deep copy
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }

    // Deep copy, fresh copy
    @Override
    protected Trainee clone() throws CloneNotSupportedException {
        Trainee trainee = (Trainee) super.clone();
        trainee.setCity(new City(city.getDescription()));
        return trainee;
    }
}