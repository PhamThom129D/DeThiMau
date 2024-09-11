package DeThi1;

import java.io.Serializable;

public abstract class Shape implements Serializable {
    private String shapeName;
    private String color;

    public abstract double calArea();

    public Shape() {}

    public Shape(String shapeName, String color) {
        this.shapeName = shapeName;
        this.color = color;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "shapeName='" + shapeName + '\'' +
                ",\t color='" + color + '\'';
    }
}
