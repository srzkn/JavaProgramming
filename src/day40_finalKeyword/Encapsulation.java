package day40_finalKeyword;

import day38_Inheritance.ShapeTask.Circle;
import day38_Inheritance.ShapeTask.Square;

public class Encapsulation {

    private Circle circle;

    public Circle getCircle(){
        return circle;
    }

    public void setCircle(Circle circle){
        if (circle.getRadius()<5) return;
        this.circle=circle;
    }

    private Square square;

    public Square getSquare(){
        return square;
    }

    public void setSquare(Square square){
        this.square=square;

    }
}
