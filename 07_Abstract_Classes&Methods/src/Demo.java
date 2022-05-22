
///////////////////////// Abstract Classes, Abstract Methods /////////////////////////////////////////

//Exercise
//--------
/*
class Vehicle{
    public void park(int location){
        System.out.println("Vehicle Parking... "+location);
    }
}
class Car extends Vehicle{
    public void park(int location){
        System.out.println("Car Parking... "+location);
    }
}
class Van extends Vehicle{
    public void park(int location){
        System.out.println("Van Parking... "+location);
    }
}
class Bus extends Vehicle{
    public void park(int location){
        System.out.println("Bus Parking... "+location);
    }
}

class Demo{
    public static void main(String args[]){
        Vehicle v1;
        v1=new Car();
        v1.park(1001); //Car Parking...1001

        v1=new Van();
        v1.park(2002); //Van Parking...2002

        v1=new Bus();
        v1.park(3003); //Bus Parking...3003
    }
}
*/

/////////////////////////////////////////////////////////////////////////////

//Q01 (Abstract Methods)
//----------------------
/*
class Vehicle{
    abstract public void park(int location);
}
class Car extends Vehicle{
    public void park(int location){
        System.out.println("Car Parking... "+location);
    }
}
class Van extends Vehicle{
    public void park(int location){
        System.out.println("Van Parking... "+location);
    }
}
class Bus extends Vehicle{
    public void park(int location){
        System.out.println("Bus Parking... "+location);
    }
}

class Demo{
    public static void main(String args[]){
        Vehicle v1;
        v1=new Car();
        v1.park(1001); //Car Parking...1001

        v1=new Van();
        v1.park(2002); //Van Parking...2002

        v1=new Bus();
        v1.park(3003); //Bus Parking...3003
    }
}
*/

//Q02 (Abstract Classes)
//----------------------
/*
abstract class Vehicle{
    abstract public void park(int location);
}
class Car extends Vehicle{
    public void park(int location){
        System.out.println("Car Parking... "+location);
    }
}
class Van extends Vehicle{
    public void park(int location){
        System.out.println("Van Parking... "+location);
    }
}
class Bus extends Vehicle{
    public void park(int location){
        System.out.println("Bus Parking... "+location);
    }
}

class Demo{
    public static void main(String args[]){
        Vehicle v1;
        v1=new Car();
        v1.park(1001); //Car Parking...1001

        v1=new Van();
        v1.park(2002); //Van Parking...2002

        v1=new Bus();
        v1.park(3003); //Bus Parking...3003
    }
}
*/

// --------------------------------------------------------------------------------------------
/////////////////////////////////////// Cases /////////////////////////////////////////////////
// --------------------------------------------------------------------------------------------

//Case I
//------
/*
class Vehicle{
    void park();
}
*/

//Case II
//-------
/*
class Vehicle{
    abstract void park();
}
*/

//Case III
//--------
/*
abstract class Vehicle{
    abstract void park(){

    }
}
*/

//Case IV
//-------
/*
abstract class Vehicle{
    abstract void park();
    void start(){
        //
    }
}
*/

//Case V
//------
/*
abstract class Vehicle{
    //abstract void park();
    void start(){
        //
    }
    void stop(){

    }
}
*/

//Case VI
//-------
/*
abstract class Vehicle{
    abstract void park();
    abstract void start();
    void stop(){
        //
    }
}

class Car extends Vehicle{

}
class Bus extends Vehicle{
    void start(){}
}
class Van extends Vehicle{
    void park(){	}
    void start(){}
}
abstract class MB extends Vehicle{

}
*/

//Case VII
//--------
/*
abstract class Vehicle{
    abstract void park();
}

class Demo{
    public static void main(String args[]){
        Vehicle v1; //Legal
        v1=new Vehicle(); //Illegal
    }
}
*/

//Case VIII
//---------
/*
abstract class Vehicle{
    abstract void park();
}
class Car extends Vehicle{
    void park(){
        System.out.println("Car parking..");
    }
}
class Demo{
    public static void main(String args[]){
        Vehicle v1;
        v1=new Car(); //Legal

    }
}
*/

//Case IX
//-------
/*
abstract class Vehicle{
    abstract void park();
}
class Car extends Vehicle{
    void park(){
        System.out.println("Car parking..");
    }
}
class Demo{
    public static void main(String args[]){
        Vehicle v1;
        v1=new Car();
        v1.park(); //Dynamic Method Dispatch
    }
}
*/

//Case X
//------
/*
abstract class Vehicle{
    int speed;
    abstract int year; //Illegal
    abstract void park();
}
*/

//Case XI
//-------
/*
abstract class Vehicle{
    int speed;
    Vehicle(){
        //
    }
    abstract Vehicle(int speed); //Illegal

    abstract void park();
}
*/

//Case XII
//--------
/*
abstract class Vehicle{
    static abstract void park();
    private abstract void start();
    final abstract void stop();
}
*/


//Case XIII
//---------
/*
final abstract class Vehicle{
    abstract void park();
}
*/

//Case XIV
//--------
/*
class Top{
    void park(){
        //Implementation
    }
}
abstract class Vehicle extends Top{
    abstract void park();
}
class Car extends Vehicle{
    void park(){
        //Implementation
    }
}
*/
