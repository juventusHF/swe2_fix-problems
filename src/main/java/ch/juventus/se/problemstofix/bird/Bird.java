package ch.juventus.se.problemstofix.bird;

/**
 * @author: Linda Krüger
 * @since: 21.09.17
 */
public abstract class Bird {

    private int age;
    private double weight;
    private boolean isHeathy;
    private int id;

    public Bird(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isHeathy() {
        return isHeathy;
    }

    public void setHeathy(boolean heathy) {
        isHeathy = heathy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bird bird = (Bird) o;

        if (age != bird.age) return false;
        if (Double.compare(bird.weight, weight) != 0) return false;
        if (isHeathy != bird.isHeathy) return false;
        return id == bird.id;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = age;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isHeathy ? 1 : 0);
        result = 31 * result + id;
        return result;
    }
}
