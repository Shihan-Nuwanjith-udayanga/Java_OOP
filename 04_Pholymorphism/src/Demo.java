
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

//Exercise with polymorphism
//--------------------------

/*
import java.util.*;
class Vehicle{
    public void park(int location){
        System.out.println("Vehicle parking");
    }
}
class Car extends Vehicle{
    private String vehicleId;
    Car(String vehicleId){
        this.vehicleId=vehicleId;
    }
    public void park(int location){
        System.out.println("Car Parking.. "+vehicleId+" : "+location);
    }
}
class Van extends Vehicle{
    private String vehicleId;
    Van(String vehicleId){
        this.vehicleId=vehicleId;
    }
    public void park(int location){
        System.out.println("Van Parking.. "+vehicleId+" : "+location);
    }
}
class Bus extends Vehicle{
    private String vehicleId;
    Bus(String vehicleId){
        this.vehicleId=vehicleId;
    }
    public void park(int location){
        System.out.println("Bus Parking.. "+vehicleId+" : "+location);
    }
}

class Demo{
    public static void main(String args[]){
        Vehicle[] vehicles={new Car("C001"),new Car("C002"),new Van("V001"),new Bus("B001"),new Van("V002"),new Bus("B002"),new Car("C004")};

        Random r=new Random();
        for(Vehicle v : vehicles){
            v.park(r.nextInt(10000)); //
        }
    }
}

*/

// -------------------------------------------------------------------------------------------

//Exercise 1
//----------
/*
class Customer{
    private int code;
    private String name;
    public Customer(int code, String name){this.code=code;this.name=name;}
}

class Demo{
    public static void main(String args[]){
        CustomerStack stack=new CustomerStack();
        stack.push(new Customer(1001,"Danapala"));
        stack.push(new Customer(1002,"Gunapala"));
        stack.push(new Customer(1003,"Somapala"));
        stack.push(new Customer(1004,"Siripala"));
        stack.printCustomerStack();//[1004-Siripala, 1003-Gunapala, 1002-Gunapala, 1001-Danapala]

        stack.pop();
        stack.printCustomerStack();//[1004-Siripala, 1003-Gunapala, 1002-Gunapala, 1001-Danapala]
    }
}
*/


// -------------------------------------------------------------------------------------------

//Exercise 2
//----------

/*
class Demo{
    public static void main(String args[]){
        VehicleQueue queue=new VehicleQueue();
        queue.enQueue(new Car("C001"));
        queue.enQueue(new Bus("B001"));
        queue.enQueue(new Bus("B002"));
        queue.enQueue(new Car("C002"));
        queue.enQueue(new Car("C003"));
        queue.enQueue(new Van("V001"));
        queue.enQueue(new Car("V002"));
        queue.enQueue(new Bus("B003"));
        queue.printVehicleQueue();//[C001, B001, B002, C002, C003, V001, V002, B003]

        queue.callPark(1111); //1111 --> starting number for parking location
		*/
/*	Car Parking C001-1111
			Bus Parking B001-1112
			Bus Parking B002-1113
			Car Parking C002-1114
			Car Parking C003-1115
			Van Parking V001-1116
			Van Parking V001-1117
			Bus Parking B003-1118
		*//*

        queue.deQueue();
        queue.printVehicleQueue();//[B001, B002, C002, C003, V001, V002, B003]
    }
}
*/

/*
import java.util.*;
class Alarm{
    public void operateAlarm(int waterLevel){
        System.out.println(waterLevel>=50 ? "Alarm ON": "Alarm OFF");
    }
}
class Display{
    public void displayWaterLevel(int waterLevel){
        System.out.println("Water Level : "+waterLevel);
    }
}
class SMSSender{
    public void sendSMS(int waterLevel){
        System.out.println("Sending SMS ..."+waterLevel);
    }
}
class ControlRoom{
    private Alarm alrm;
    private Display display;
    private SMSSender smsSensder;
    private int waterLevel;

    public void addDisplay(Display display){
        this.display=display;
    }
    public void addSMSSender(SMSSender smsSensder){
        this.smsSensder=smsSensder;
    }
    public void addAlarm(Alarm alrm){
        this.alrm=alrm;
    }
    public void notifyWaterLevelObservers(){
        alrm.operateAlarm(waterLevel);
        display.displayWaterLevel(waterLevel);
        smsSensder.sendSMS(waterLevel);
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
        controlRoom.addAlarm(new Alarm());
        controlRoom.addDisplay(new Display());
        controlRoom.addSMSSender(new SMSSender());

        Random r=new Random();
        while(true){
            int waterLevel=r.nextInt(101);
            try{Thread.sleep(500);}catch(Exception exe){}
            controlRoom.setWaterLevel(waterLevel);
        }
    }
}
*/


//Exercise Adding a "Splitter"
//----------------------------
/*
import java.util.*;
class Alarm{
    public void operateAlarm(int waterLevel){
        System.out.println(waterLevel>=50 ? "Alarm ON": "Alarm OFF");
    }
}
class Splitter{
    public void split(int waterLevel){
        System.out.println(waterLevel>=75 ? "Splitter ON":"Splitter OFF");
    }
}
class Display{
    public void displayWaterLevel(int waterLevel){
        System.out.println("Water Level : "+waterLevel);
    }
}
class SMSSender{
    public void sendSMS(int waterLevel){
        System.out.println("Sending SMS ..."+waterLevel);
    }
}
class ControlRoom{
    private Alarm alrm;
    private Display display;
    private SMSSender smsSensder;
    private Splitter splitter;
    private int waterLevel;

    public void addSplitter(Splitter splitter){
        this.splitter=splitter;

    }
    public void addDisplay(Display display){
        this.display=display;
    }
    public void addSMSSender(SMSSender smsSensder){
        this.smsSensder=smsSensder;
    }
    public void addAlarm(Alarm alrm){
        this.alrm=alrm;
    }
    public void notifyWaterLevelObservers(){
        alrm.operateAlarm(waterLevel);
        display.displayWaterLevel(waterLevel);
        smsSensder.sendSMS(waterLevel);
        splitter.split(waterLevel);
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
        controlRoom.addAlarm(new Alarm());
        controlRoom.addDisplay(new Display());
        controlRoom.addSMSSender(new SMSSender());
        controlRoom.addSplitter(new Splitter());

        Random r=new Random();
        while(true){
            int waterLevel=r.nextInt(101);
            try{Thread.sleep(500);}catch(Exception exe){}
            controlRoom.setWaterLevel(waterLevel);
        }
    }
}
*/

//Using Runtime Polymorphism
//--------------------------

/*
import java.util.*;
class WaterLevelObserver{
    public void update(int waterLevel){
        //
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
    private WaterLevelObserver[] observers=new WaterLevelObserver[10];
    private int waterLevel;
    private int nextPos=0;

    public void addWaterLevelObserver(WaterLevelObserver observer){
        observers[nextPos++]=observer;
    }
    public void notifyWaterLevelObservers(){
        for(int i=0; i<nextPos;i++){
            observers[i].update(waterLevel);
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


        Random r=new Random();
        while(true){
            int waterLevel=r.nextInt(101);
            try{Thread.sleep(500);}catch(Exception exe){}
            controlRoom.setWaterLevel(waterLevel);
        }
    }
}
*/

//Adding a "Splitter"
//-------------------
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
    private WaterLevelObserver[] observers=new WaterLevelObserver[10];
    private int waterLevel;
    private int nextPos=0;

    public void addWaterLevelObserver(WaterLevelObserver observer){
        observers[nextPos++]=observer;
    }
    public void notifyWaterLevelObservers(){
        for(int i=0; i<nextPos;i++){
            observers[i].update(waterLevel);
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

// -----------------------------------------------------------------------------

/*
import java.util.*;
class WaterLevelObserver{
    public void update(int waterLevel){
        //
    }
}
class WaterLevelObserverStack{
    private Node top;
    public void push(WaterLevelObserver waterLevelObserver){
        Node node=new Node(waterLevelObserver);
        node.next=top;
        top=node;
    }
    public void callUpdate(int waterLevel){
        Node temp=top;
        while(temp!=null){
            temp.observer.update(waterLevel);
            temp=temp.next;
        }
    }
    class Node{
        private WaterLevelObserver observer;
        private Node next;
        Node(WaterLevelObserver observer){this.observer=observer;}
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
    private WaterLevelObserverStack observerStack=new WaterLevelObserverStack();
    private int waterLevel;

    public void addWaterLevelObserver(WaterLevelObserver observer){
        observerStack.push(observer);
    }
    public void notifyWaterLevelObservers(){
        observerStack.callUpdate(waterLevel);
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

// -----------------------------------------------------------------------------

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


