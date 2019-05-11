package ch.juventus.se.problemstofix.bird;

/**
 * @author: Linda Krüger
 * @since: 21.09.17
 */
public class Duck extends Bird{

    private boolean isHungry;

    public Duck(int age, double weight, boolean isHealthy) {
        super(age);
        this.setWeight(weight);
        this.setHeathy(isHealthy);
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Duck duck = (Duck) o;

        return isHungry == duck.isHungry;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (isHungry ? 1 : 0);
        return result;
    }
}
