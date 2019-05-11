package ch.juventus.se.problemstofix.bird;

public abstract class Bird {

    private int age;
    private double weight;
    private boolean isHealthy;
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

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
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
        if (isHealthy != bird.isHealthy) return false;
        return id == bird.id;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = age;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isHealthy ? 1 : 0);
        result = 31 * result + id;
        return result;
    }
}
