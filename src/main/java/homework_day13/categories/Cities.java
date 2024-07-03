package homework_day13.categories;

import java.util.Objects;

public class Cities {
    private String name;
    private int populations;

    public Cities(String name, int populations) {
        this.name = name;
        this.populations = populations;
    }

    public String toString() {
        return name + populations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cities cities = (Cities) o;
        return populations == cities.populations && Objects.equals(name, cities.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, populations);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulations() {
        return populations;
    }

    public void setPopulations(int populations) {
        this.populations = populations;
    }
}