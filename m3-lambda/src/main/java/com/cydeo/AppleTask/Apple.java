package com.cydeo.AppleTask;

/*import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor*/


public class Apple {

    private int weight;
    private Color color;

    public Apple(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
