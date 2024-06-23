package homework_day10;

import java.util.Objects;

public class Chair {
    private int height;
    private int width;

    public Chair(int height) {
        this.height = height;
    }
    public Chair(Integer width, boolean isWidth) {
        if (isWidth) {
            this.width = width;
        }
    }

    @Override
    public String toString() {
        return "Chair{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chair chair = (Chair) o;
        return height == chair.height && width == chair.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
