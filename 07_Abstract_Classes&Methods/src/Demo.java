
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



