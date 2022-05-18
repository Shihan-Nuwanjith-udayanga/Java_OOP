
//////////////////////////////////// Overriding Rules //////////////////////////////////////////////

// Rule No. 1 (Static Methods) Case I
//-----------------------------------

/*
class Vehicle{
    static public void park(int location){
        System.out.println("Vehicle Parking...");
    }
}
class Car extends Vehicle{
    public void park(int location){
        System.out.println("Car Parking...");
    }
}
*/

// Rule No. 1 (Static Methods) Case II
//------------------------------------

/*
class Vehicle{
    public void park(int location){
        System.out.println("Vehicle Parking...");
    }
}
class Car extends Vehicle{
    static public void park(int location){
        System.out.println("Car Parking...");
    }
}
*/

// Rule No. 1 (Static Methods) Case III
// ------------------------------------

/*
class Vehicle{
    static public void park(int location){
        System.out.println("Vehicle Parking...");
    }
}
class Car extends Vehicle{
    static public void park(int location){
        System.out.println("Car Parking...");
    }
}
class Demo{
    public static void main(String args[]){
        Vehicle v1=new Car();
        v1.park(100);
    }
}
*/


//Rule No. 2 (Private Methods)
//----------------------------

/*
class Vehicle{
    private void park(int location){
        System.out.println("Vehicle Parking...");
    }
    public void callPark(int a){
        park(a);
    }
}
class Car extends Vehicle{
    public void park(int location){
        System.out.println("Car Parking...");
    }
}
class Demo{
    public static void main(String args[]){
        Vehicle v1=new Car();
        v1.callPark(1001);
    }
}
*/


// Rule No. 3 (Final Methods)
// --------------------------

/*
class Vehicle{
    final public void park(int location){
        System.out.println("Vehicle Parking...");
    }
}
class Car extends Vehicle{
    public void park(int location){
        System.out.println("Car Parking...");
    }
}
*/

//Final Classes
//-------------

/*
final class Vehicle{
    public void park(int location){
        System.out.println("Vehicle Parking...");
    }
}
class Car extends Vehicle{
    public void park(int location){
        System.out.println("Car Parking...");
    }
}
*/

//Rule No. 4
//-----------

/*
class Vehicle{
    public void park(int location){
        System.out.println("Vehicle Parking...");
    }
}
class Car extends Vehicle{
    protected void park(int location){ //Illegal
        System.out.println("Car Parking...");
    }
}
*/

//Exercise

/*class Vehicle{
    protected void park(int location){
        System.out.println("Vehicle Parking...");
    }
}
class Car extends Vehicle{
    *//*Insert code here*//*void park(int location){
        System.out.println("Car Parking...");
    }
}*/

//A. public 	-->Legal
//B. protected	-->Legal
//C. default	-->Illegal
//D. private	-->Illegal

// --------------------------------------------------------------------------------------

//Rule No. 5 (Return types)
//-------------------------

/*
class Vehicle{
    public boolean  park(int location){
        System.out.println("Vehicle Parking...");
        return true;

    }
}
class Car extends Vehicle{
    public  double park(int location){
        System.out.println("Car Parking...");
        return 12.23;
    }
}
*/

/*
class Super{}
class Sub extends Super{}
class Vehicle{
    public Super  park(int location){
        System.out.println("Vehicle Parking...");
        Super ob=new Super();
        return ob;
    }
}
class Car extends Vehicle{
    public Sub park(int location){
        System.out.println("Car Parking...");
        return new Sub();
    }
}
*/
