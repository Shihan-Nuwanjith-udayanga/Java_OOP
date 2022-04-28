package _01_OOP_Basics;

// =================================== OOP Basics =====================================================

// Q1
// --
/*
class Demo {
    public static void main(String args[]) {
        int length;
        int width;
        int height;

        length = 12;
        width = 5;
        height = 3;

        int volume;
        volume = length * width * height;
        System.out.println("Volume of the box : " + volume);

        int area;
        area = 2 * length * width + 2 * length * height + 2 * width * height;
        System.out.println("Area   of the box : " + area);
    }
}
*/

//Q2 From Q1
//----------
//class Demo{
//    public static void main(String args[]){
//		/*int length;
//		int width;
//		int height;*/
//        Box b1=new Box(); //int[] xr=new int[3]
//
//		/*length=12;
//		width=5;
//		height=3;*/
//        b1.setSize(12,5,3);
//
//		/*int volume;
//		volume=length*width*height;
//		System.out.println("Volume of the box : "+volume);*/
//        b1.printVolume();
//
//		/*int area;
//		area=2*length*width+2*length*height+2*width*height;
//		System.out.println("Area   of the box : "+area);*/
//        b1.printArea();
//    }
//}

//Q3 From Q2 ( Using OOP)
//-----------------------
/*
//----------------------------------------Box.java-----------------------------
class Box{
    int length;
    int width;
    int height;

    public void setSize(int l, int w, int h){
        length=l;
        width=w;
        height=h;
    }

    public void printVolume(){
        int volume;
        volume=length*width*height;
        System.out.println("Volume of the box : "+volume);
    }
    public void printArea(){
        int area;
        area=2*length*width+2*length*height+2*width*height;
        System.out.println("Area   of the box : "+area);
    }
}

//----------------------------------------Demo.java----------------------------
class Demo{
    public static void main(String args[]){
        Box b1=new Box(); //int[] xr=new int[3]
        b1.setSize(12,5,3);
        b1.printVolume();
        b1.printArea();
    }
}
*/

// =========================================================================================================

//Q4
//--
/*
class Demo{
    public static void main(String args[]){
        int year;
        int month;
        int day;
        //Date d1=new Date();

        year=2019;
        month=4;
        day=19
        //d1.setDate(2018,4,18);

        System.out.println(year+"-"+month+"-"+day);
        //d1.printDate();
    }
}
*/

//Q5 From Q4
//----------
/*
class Date{
    int year;
    int month;
    int day;

    public void setDate(int y, int m, int d){
        year=y;
        month=m;
        day=d;
    }
    public void printDate(){
        System.out.println(year+"-"+month+"-"+day);
    }
}
class Demo{
    public static void main(String args[]){
		*/
/*int year;
		int month;
		int day;*//*

        Date d1=new Date();

		*/
/*year=2019;
		month=4;
		day=19*//*

        d1.setDate(2018,4,18);

        //System.out.println(year+"-"+month+"-"+day);
        d1.printDate();
    }
}
*/

// ===========================================================================================================

//Q6
//--
/*
class Demo{
    public static void main(String args[]){
        Cylinder c1=new Cylinder();
        c1.setSize(12.5, 5.0);
        c1.printVolume();
        c1.printArea();

        c1.setLength(120.0);
        c1.setRadius(50.0);
        double newVolume=c1.getVolume();
        double newArea=c1.getArea();
        System.out.println("New Volume of the cylinder : "+newVolume);
        System.out.println("New Area   of the cylinder : "+newArea);
    }
}
*/

//Q7 From Q6
//----------
/*
class Cylinder{
    double length;
    double radius;

    public void setSize(double l, double r){
        length=l;
        radius=r;
    }
    public void printVolume(){
        double volume;
        volume=getVolume();
        System.out.println("Volume of the cylinder : "+volume);
    }
    public void printArea(){
        double area;
        area=getArea();
        System.out.println("Area   of the cylinder : "+area);
    }
    public void setLength(double l){
        length=l;
    }
    public void setRadius(double r){
        radius=r;
    }
    public double getVolume(){
        double volume;
        volume=Math.PI * radius*radius*length;
        return volume;
    }
    public double getArea(){
        double area;
        area=2*Math.PI *radius*radius+ 2*Math.PI*radius*length;
        return area;
    }
}
class Demo{
    public static void main(String args[]){
        Cylinder c1=new Cylinder();
        c1.setSize(12.5, 5.0);
        c1.printVolume();
        c1.printArea();

        c1.setLength(120.0);
        c1.setRadius(50.0);
        double newVolume=c1.getVolume();
        double newArea=c1.getArea();
        System.out.println("New Volume of the cylinder : "+newVolume);
        System.out.println("New Area   of the cylinder : "+newArea);
    }
}
*/


//=========================================================================================================

// Create a Window using java swing
// --------------------------------
/*
import javax.swing.*;
class Demo{
    public static void main(String args[]){
        JFrame f1=new JFrame();
        f1.setSize(300,300);
        f1.setTitle("Calculator");
        f1.setDefaultCloseOperation(3);
        f1.setVisible(true);
    }
}
*/

//------------------------------------------------------------

/*
import javax.swing.*;
class Demo{
    public static void main(String args[]){
        JFrame f1=new JFrame();
        f1.setSize(300,300);
        f1.setTitle("Update Customer Form");
        f1.setDefaultCloseOperation(3);
        f1.setVisible(true);

        JFrame f2=new JFrame();
        f2.setSize(400,400);
        f2.setTitle("Add Customer Form");
        f2.setDefaultCloseOperation(3);
        f2.setVisible(true);
    }
}
*/
