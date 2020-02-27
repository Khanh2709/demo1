package demo;

public class Car implements Vehicle {
    @Override
	public void move() {
        System.out.print("Move by Car");
    }
}