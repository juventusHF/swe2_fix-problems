package ch.juventus.se.problemstofix.bird;

/**
 * @author: Linda Krüger
 * @since: 21.09.17
 */
public class Turkey extends Bird {

    private String color;

    public Turkey(int age, double weight, boolean isHealthy) {
        super(age);
        this.setWeight(weight);
        this.setHeathy(isHealthy);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Turkey turkey = (Turkey) o;

        return color != null ? color.equals(turkey.color) : turkey.color == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
