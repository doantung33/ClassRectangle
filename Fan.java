import java.util.Scanner;
public class Fan {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Fan fan1= new Fan();

        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fan fan2=new Fan();

        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println("Stastus ON");
        System.out.println(fan1.toString());

        System.out.println("Stastus OFF");
        System.out.println(fan2.toString());
    }
    public int SLOW= 1,MEDIUM=2,FAST=3;
    private int speed =SLOW;
    private boolean on= false;
    private double radius= 5;
    private String color ="blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
//    public Fan fan(){
//        return fan();
//    }
    public String toString (){
        if (on==true){
            return "fan is on :\n " +"speed : "+ speed+ "\n color : "+color+ "\n radius : "+radius;
        }else {
            return "fan is off :\n "+ "color : "+color +"\n radius : "+ radius;
        }
    }

}

