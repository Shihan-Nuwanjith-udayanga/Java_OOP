
// ===================================== Java Interfaces ==============================================

/*abstract class Vehicle{
	abstract public void park();
	abstract public void start();
	abstract public void stop();
}*/
/*

interface Vehicle{
    public void park(); //implicitly public, abstract
    public void start();
    public void stop();
}
*/

// -------------------------------------------------------------------------------------------------

//Case I
//------
/*
interface Vehicle{

}
//class Car extends Vehicle{} //Illegal
class Car implements Vehicle{} //Legal
*/


//Case II
//-------
/*
interface Vehicle{
    public void park();
    public void start();
}
class Car implements Vehicle{} //Illegal
class Van implements Vehicle{ //Illegal
    public void park(){

    }
}
class Bus implements Vehicle{ //legal
    public void park(){

    }
    public void start(){

    }
}
*/


//Case III
//--------
/*
interface Vehicle{
    void park(); //implicitly public
    public void start();
    protected void stop(); //Illegal

}
*/

// ----------------------------------------------------------------------------------------------

//Example
/*
interface Vehicle{
    void park(); //
}
class Car implements Vehicle{
    void park(){ //Illegal

    }
}
*/

// ----------------------------------------------------------------------------------------------

//Case IV
//-------
/*
interface Vehicle{
    void park(){ //Illegal

    }
}
*/


//Case V
//------
/*
interface Vehicle{
    void park();
}
class Car implements Vehicle{
    public void park(){
        System.out.println("Car Parking...");
    }
}

class Demo{
    public static void main(String args[]){
        Vehicle v1; //Legal
        v1=new Vehicle(); //Illegal
    }
}
*/



//Case VI
//-------
/*
interface Vehicle{
    void park();
}
class Car implements Vehicle{
    public void park(){
        System.out.println("Car Parking...");
    }
}

class Demo{
    public static void main(String args[]){
        Vehicle v1;
        v1=new Car(); //Legal
        v1.park(); //Legal -->dynamic method dispatch
    }
}
*/


//Case VII
//--------
/*
interface Vehicle{
    static void park(); //Illegal --->implicitly abstract
    final void start();
    private void stop();
}
*/


//Case VIII
//---------
/*
interface Vehicle{
    //int speed; //Illegal
    int year=1999;	//implicitly final, static and public
}


class Demo{
    public static void main(String args[]){
        System.out.println(Vehicle.year); //static
        Vehicle.year=2000; //Illegal ==>final
    }
}
*/


//Case IX
//-------
/*
interface Vehicle{
    int year=1999;	//implicitly final, static and public
    Vehicle(){ //Illegal

    }
}
*/


//Case X
//------
/*
class A{}
class B{}
class C extends A,B{} //Illegal

class Lion{}

interface Fox{}

class Father extends Lion implements Fox{} //Legal
*/



//Case XI
//-------
/*class Lion{}
interface Fox{}
interface Dog{}

class Father extends Lion implements Fox, Dog{}
*/


//Case XII
//--------
/*
interface Fox{}
interface Dog{}

interface Lion extends Fox, Dog{} //Legal
*/


//Case XIII
//---------
/*
class Shape{

}

interface Vehicle extends Shape{} //Illegal

interface Vehicle implements Shape{} //Illegal
*/


//Case XIV
//--------
/*
interface Vehicle{
    default void start(){ //Since JDK1.8
        System.out.println("default implementaion...");
    }
}
class Car implements  Vehicle{

}
class Demo{
    public static void main(String args[]){
        Vehicle v1=new Car();
        v1.start();

    }
}
*/

//Case XV
//-------
/*
interface Vehicle{
    static void start(){ //Since JDK1.8
        System.out.println("static implementaion...");
    }
}
interface Demo{
    public static void main(String args[]){
        Vehicle.start();
    }
}
*/

// --------------------------------------------------------------------------------------------------------

//Exercise
//--------
/*
interface Vehicle{
    void m1(); 	//Line 1
    void m2(){}	//Line 2
    abstract void m3(); 	//Line 3
    abstract void m4(){} 	//Line 4
    default void m5(){} 	//Line 5
    abstract default void m6(){}	//Line 6
    static void m7(){}		//Line 8
    static void m8();	//Line 9
    abstract static void m9(){} //Line 10
}
*/


//Exercise
//--------
/*
interface Vehicle{
    void m1();
    default void m2(){}
}
class A{
    void m2(){}
}
class B extends A implements Vehicle{
    public void m1(){
        //
    }

}
*/


//Exercise
//--------
/*
interface Vehicle{
    default void m2(){
        System.out.println("default m2 of Vehicle");
    }
}
class A{
    public void m2(){
        System.out.println("m2 of A");
    }
}
class B extends A implements Vehicle{ //Legal
    //
}
class Demo{
    public static void main(String args[]){
        B b1=new B();
        b1.m2(); //?

        A a1=b1;
        a1.m2();

        Vehicle v1=b1;
        v1.m2();
    }
}
*/

// --------------------------------- Class "Object" -----------------------------------------

//Exercise
//--------
/*
class Customer */
/*extends Object*//*
{
}
class Demo{
    public static void main(String ijse[]){
        Customer d= new Customer();
        String value=d.toString();
        System.out.println(value);
    }
}
*/


//Exercise
//--------
/*
class Customer{
    Customer(){
        System.out.println("Customer()");
    }
    Customer(int i){
        System.out.println("Customer(int i)");
    }
}
class Item extends Customer{
    Item(){
        System.out.println("Item()");
    }
    Item(int i){
        System.out.println("Item(int i)");
    }
}
class Demo{
    public static void main(String ijse[]){
        new Item();
    }
}
*/


//Exercise
//--------
/*
class Customer{
    Customer(){
        System.out.println("Customer()");
    }
    Customer(int i){
        System.out.println("Customer(int i)");
    }
}
class Item extends Customer{
    Item(){
        System.out.println("Item()");
    }
    Item(int i){
        System.out.println("Item(int i)");
    }
}
class Demo{
    public static void main(String ijse[]){
        new Item(10);
    }
}
*/


//Exercise
//--------
/*
class Customer{
    Customer(){
        System.out.println("Customer()");
    }
    Customer(int i){
        System.out.println("Customer(int i)");
    }
}
class Item extends Customer{
    Item(){
        super(10);
        System.out.println("Item()");
    }
    Item(int i){
        System.out.println("Item(int i)");
    }
}
class Demo{
    public static void main(String ijse[]){
        new Item();
    }
}
*/



//Exercise
//--------
/*
import javax.swing.*;
class Box{
}
class A{}
class B extends A{}
class Item{

}
class Demo{
    public static void main(String ijse[]){
        A[] a1={new A(),new A(),new B()};
        A[] a2={new A(),new Item(),new Box()};
        Object[] ob={new A(),new Item(),new Box(),new JFrame()};
    }
}
*/


// -------------------------------------------------------------------------------------------

//Case XIV Method "Public String toString()"
//------------------------------------------
/*
class Customer{
    int code;
    Customer(int code){
        this.code=code;
    }
}
class Demo{
    public static void main(String ijse[]){
        Customer customer= new Customer(001);
        String value=customer.toString();
        System.out.println(value);
        System.out.println(customer);
    }
}
*/


/*
class Customer{
    int code;
    Customer(int code){
        this.code=code;
    }

    public String toString(){
        return "Customer -"+code;
    }
}
class Demo{
    public static void main(String ijse[]){
        int x=100;
        String name=new String("IJSE");
        System.out.println(x);
        System.out.println(name);

        Customer customer= new Customer(1111);
        System.out.println(customer);
    }
}
*/


//String Representation of an Object
//----------------------------------
/*
class Customer{
    int code;
    Customer(int code){
        this.code=code;
    }

    public String toString(){
        return "Customer -"+code;
    }
}
class Demo{
    public static void main(String ijse[]){
        Customer customer1= new Customer(1111);
        Customer customer2= new Customer(2222);
        Customer customer3= new Customer(3333);
        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);
    }
}
*/


// Exercise
/*
class Customer{
    int code;
    Customer(int code){
        this.code=code;
    }

    public String toString(){
        return "Customer -"+code;
    }
}
class Demo{
    public static void main(String ijse[]){
        int x=100,y=100,z=200;
        System.out.println(x==y);
        System.out.println(x==z);
        Customer customer1= new Customer(1001);
        Customer customer2= new Customer(1001);
        Customer customer3= new Customer(2002);
        System.out.println(customer1==customer2);
        System.out.println(customer1==customer3);
    }
}
*/


// Exercise
/*
class Customer{
    int code;
    Customer(int code){
        this.code=code;
    }
    public String toString(){
        return "Customer -"+code;
    }
    */
/*public boolean equals(Object obj){
        return (this == obj);
    }*//*

    public boolean equals(Object obj){
        Customer c1=(Customer)obj;
        return this.code==c1.code;
    }
}
class Demo{
    public static void main(String ijse[]){
        Customer customer1= new Customer(1001);
        Customer customer2= new Customer(1001);
        Customer customer3= new Customer(2002);
        System.out.println(customer1.equals(customer2));
        System.out.println(customer1.equals(customer3));
    }
}
*/


// --------------------------------------------------------------------------------------------------------

//Exercise
//--------
/*
import java.util.*;
class WaterLevelObserver{
    public void update(int waterLevel){
        //
    }
}
class Splitter extends WaterLevelObserver{
    public void update(int waterLevel){
        System.out.println(waterLevel>=75 ? "Splitter ON": "Splitter OFF");
    }
}
class Alarm extends WaterLevelObserver{
    public void update(int waterLevel){
        System.out.println(waterLevel>=50 ? "Alarm ON": "Alarm OFF");
    }
}
class Display  extends WaterLevelObserver{
    public void update(int waterLevel){
        System.out.println("Water Level : "+waterLevel);
    }
}
class SMSSender  extends WaterLevelObserver{
    public void update(int waterLevel){
        System.out.println("Sending SMS ..."+waterLevel);
    }
}
class ControlRoom{
    private ArrayList <WaterLevelObserver>observerList=new ArrayList<>(); //java.util.ArrayList
    private int waterLevel;

    public void addWaterLevelObserver(WaterLevelObserver observer){
        observerList.add(observer);
    }
    public void notifyWaterLevelObservers(){
        for(WaterLevelObserver observer : observerList){
            observer.update(waterLevel);
        }
    }
    public void setWaterLevel(int waterLevel){
        if(this.waterLevel!=waterLevel){
            this.waterLevel=waterLevel;
            notifyWaterLevelObservers();
        }
    }
}
class Demo{
    public static void main(String args[]){
        ControlRoom controlRoom =new ControlRoom();
        controlRoom.addWaterLevelObserver(new Alarm());
        controlRoom.addWaterLevelObserver(new Display());
        controlRoom.addWaterLevelObserver(new SMSSender());
        controlRoom.addWaterLevelObserver(new Splitter());

        Random r=new Random();
        while(true){
            int waterLevel=r.nextInt(101);
            try{Thread.sleep(500);}catch(Exception exe){}
            controlRoom.setWaterLevel(waterLevel);
        }
    }
}
*/
