
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


