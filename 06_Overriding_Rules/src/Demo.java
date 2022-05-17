
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
