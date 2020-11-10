import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Tính phương trình bậc hai : ax2 + bx + c=0");


        System.out.println("Nhập a");
        double a= scanner.nextDouble();
        System.out.println("Nhập b");
        double b= scanner.nextDouble();
        System.out.println("Nhập c");
        double c= scanner.nextDouble();
        Quadratic quadratic = new Quadratic(a,b,c);
        double delta = quadratic.getDiscriminant();
        double x1 = quadratic.getRoot1();
        double x2 = quadratic.getRoot2();
        if(delta>0){
            System.out.println("X1 =" +x1 +" , X2="+x2);
        }else if (delta<0){
            System.out.println("Phương trình vô nghiệm");
        }else {
            System.out.println("phương trình có một nghiêm kép "+ x1);
        }


    }


    public double getA() {
        return a;
    }

    public void setA(double a) {

        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {

        this.b = b;
    }

    public double getC() {

        return c;
    }

    public void setC(double c) {

        this.c = c;
    }
    private double a,b,c;
    public Quadratic(double a ,double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public  double getDiscriminant(){
        double delta=  (b*b)-(4*a*c);
        return delta;

    }

    public  double getRoot1(){
        double x1= (-b+Math.sqrt(b*b - 4*a*c))/2*a;
        return x1;
    }
    public double  getRoot2(){
        double x2= (-b-Math.sqrt(b*b- 4*a*c))/2*a;
        return x2;
    }
    public String display(){
        return "Quadratic{"+" a =" +a+ ", b = " +b+", c=" +"}";
    }
}
