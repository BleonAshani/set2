package Bleon;

public class Animal {

    private String type;
    private double weight;
    private int age;
    private String [] continent;

    public Animal(){this("no Type",0,0,null);}

    public Animal(String type, double weight, int age, String [] continent) {
        setType(type);
        setWeight(weight);
        setAge(age);
        setContinent(continent);
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String[] getContinent() {
        return continent;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setContinent(String [] continent) {
        this.continent = continent;
    }

    public String toString(){

        String txt ="";
        for (int i = 0; i < continent.length; i++) {

            txt = continent[i] + "\n";
        }
        return String.format("Type %15s\n  Weight %15s\n  age %15.2d\n  Continent %15s\n", getType(), getWeight(), getAge(), getContinent());


    }
}
