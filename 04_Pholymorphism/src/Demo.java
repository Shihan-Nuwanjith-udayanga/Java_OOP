
/////////////////////////////////// Polymorphism  //////////////////////////////////

//Compiletime polymorphism
//------------------------
/*
class Demo{
    public static void main(String args[]){
        int x=-12;
        long y=-23;
        float f=-23.23f;
        double d=2323.23232;

        x=Math.abs(x); //single interface-->Math.abs(args)
        y=Math.abs(y);
        f=Math.abs(f);
        d=Math.abs(d);
    }
}
*/

// -------------------------------------------------------------------------------------

//Runtime Polymorphism
//--------------------
/*
class Vehicle{
    public void park(int location){
        System.out.println("Vehicle Parking... "+location);
    }
}
class Car extends Vehicle{}
class Van extends Vehicle{}
class Bus extends Vehicle{}

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

// -------------------------------------------------------------------------------------------
