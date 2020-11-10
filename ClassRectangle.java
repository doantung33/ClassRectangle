import java.awt.*;
import java.util.Scanner;

public class ClassRectangle {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the width");
        double width = scanner.nextDouble();
        System.out.println("Enter the hieght");
        double height =scanner.nextDouble();
        ClassRectangle rectangle=new ClassRectangle(width,height);
        System.out.println("Rectangle \n"+rectangle.display());
        System.out.println("Perimeter Rectangle : "+ rectangle.getPerimeter());
        System.out.println("Acreage Rectangle :" + rectangle.getAcreage());
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    double width,height;
    public ClassRectangle(double width,double height){
        this.width=width;
        this.height=height;
    }

    public double getAcreage(){
        return this.width*this.height;
    }public double getPerimeter(){
        return (this.width+this.height)*2;
    }public String display(){
        return "ClassRectangle{"+" width =" +width+ ", height = " +height+"}";
    }
}
