package ch.juventus.se.problemstofix.bird;

/**
 * @author: Linda Krüger
 * @since: 21.09.17
 */
public class Pigeon extends Bird {

    private String name;

    public Pigeon(int age, double weight, boolean isHealthy) {
        super(age);
        this.setWeight(weight);
        this.setHeathy(isHealthy);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Pigeon pigeon = (Pigeon) o;

        return name != null ? name.equals(pigeon.name) : pigeon.name == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
