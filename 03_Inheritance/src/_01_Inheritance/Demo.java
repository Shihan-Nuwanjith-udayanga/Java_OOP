package _01_Inheritance;

// ============================== Java Inheritance ==========================================


/*class Calculator{

}
class Demo{
    public static void main(String args[]){
        Calculator c1=new Calculator();
        c1.setSize(300,300);
        c1.setDefaultCloseOperation(3);
        c1.setVisible(true);
    }
}*/

/*import javax.swing.*;
class Calculator extends JFrame{

}
class Demo{
    public static void main(String args[]){
        Calculator c1=new Calculator();
        c1.setSize(300,300);
        c1.setDefaultCloseOperation(3);
        c1.setVisible(true);
    }
}*/

// ===================================================================================================

// Case I
// ------
/*
class Calculator extends JFrame{

}
*/
//Calculator -->Sub class
//JFrame -->Super class



// Case II
// -------
/*
class Super{
    int superData;
    static{
        System.out.println("Loading class Super");
    }
}
class Sub extends Super{
    int subData;
    static{
        System.out.println("Loading class Sub");
    }
}
class Demo{
    public static void main(String args[]){
        new Sub();
    }
}
*/


// Case III
// --------
/*
class A{
    int a;
    public void printA(){
        System.out.println("A : "+a);
    }
}
class B extends A{
    int b;
    public void printB(){
        System.out.println("B : "+b);
    }
    public void printAB(){
        System.out.println("A : "+a);	//Legal ?
        System.out.println("B : "+b);
    }
    public void callPrint(){
        printA(); //Legal ?
        printB();
    }
}
*/

// ---------------------------------------------------------

// Exercise
/*
import javax.swing.*;
class Calculator extends JFrame{
    Calculator(){
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
class Demo{
    public static void main(String args[]){
        new Calculator();
    }
}
*/

// Case IV
// -------
/*
class A{
    int a;
    public void printA(){
        System.out.println("A : "+a);
    }
}
class B extends A{
    int b;
    public void printB(){
        System.out.println("B : "+b);
    }
    public void printAB(){
        System.out.println("A : "+a);	//Legal ?
        System.out.println("B : "+b);
    }
    public void callPrint(){
        printA(); //Legal ?
        printB();
    }
}

class Demo{
    public static void main(String args[]){
        B b1=null;
        b1.a=100;	//Legal	 ?
        b1.b=200;
        b1.printA();  //Legal ?
        b1.printB();
    }
}
*/

// Case V
// ------
/*
class A{
    int a;
    public void printA(){
        System.out.println("A : "+a);
    }
}
class B extends A{
    int b;
    public void printB(){
        System.out.println("B : "+b);
    }
    public void printAB(){
        System.out.println("A : "+a);	//Legal ?
        System.out.println("B : "+b);
    }
    public void callPrint(){
        printA(); //Legal ?
        printB();
    }
}

class Demo{
    public static void main(String args[]){
        B b1=new B();
        b1.a=100;
        b1.b=200;
        b1.printA();
        b1.printB();
    }
}
*/


// Case VI Invoking super Class constructors
// -----------------------------------------
/*
class A{
    int a;
    A(){
        System.out.println("A() ");
    }
    A(int i){
        System.out.println("A(int) ");
    }
    A(int i, int j){
        System.out.println("A(int,int) ");
    }
    public void printA(){
        System.out.println("A : "+a);
    }
}
class B extends A{
    int b;
    B(){
        System.out.println("B() ");
    }
    B(int i){
        System.out.println("B(int) ");
    }
    B(int i, int j){
        System.out.println("B(int,int) ");
    }
    public void printB(){
        System.out.println("B : "+b);
    }
}

class Demo{
    public static void main(String args[]){
        B b1=new B();
        System.out.println("--------------");
        B b2=new B(100);
        System.out.println("--------------");
        B b3=new B(100,200);
    }
}
*/

// Case VII From Case VI (Compiler inserts "super()")
// --------------------------------------------------
/*
class A{
    int a;
    A(){
        System.out.println("A() ");
    }
    A(int i){
        System.out.println("A(int) ");
    }
    A(int i, int j){
        System.out.println("A(int,int) ");
    }
    public void printA(){
        System.out.println("A : "+a);
    }
}
class B extends A{
    int b;
    B(){
        super(); //compiler inserts
        System.out.println("B() ");
    }
    B(int i){
        super(); //compiler inserts
        System.out.println("B(int) ");
    }
    B(int i, int j){
        super(); //compiler inserts
        System.out.println("B(int,int) ");
    }
    public void printB(){
        System.out.println("B : "+b);
    }
}

class Demo{
    public static void main(String args[]){
        B b1=new B();
        System.out.println("--------------");
        B b2=new B(100);
        System.out.println("--------------");
        B b3=new B(100,200);
    }
}
*/

//Using "super"
//------------
/*
class A{
    int a;
    A(){
        System.out.println("A() ");
    }
    A(int i){
        System.out.println("A(int) ");
    }
    A(int i, int j){
        System.out.println("A(int,int) ");
    }
    public void printA(){
        System.out.println("A : "+a);
    }
}
class B extends A{
    int b;
    B(){
        super();
        System.out.println("B() ");
    }
    B(int i){
        super(i);
        System.out.println("B(int) ");
    }
    B(int i, int j){
        super(i,j);
        System.out.println("B(int,int) ");
    }
    public void printB(){
        System.out.println("B : "+b);
    }
}

class Demo{
    public static void main(String args[]){
        B b1=new B();
        System.out.println("--------------");
        B b2=new B(100);
        System.out.println("--------------");
        B b3=new B(100,200);
    }
}
*/

