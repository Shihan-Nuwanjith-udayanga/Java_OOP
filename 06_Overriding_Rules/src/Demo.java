
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

// -------------------------------------------------------------------------------------------

//Exercise
//--------

//Q 01
/*
class Customer{
    private int code;
    private String name;
    public Customer(int code, String name){this.code=code;this.name=name;}
    public String toString(){
        return code+"-"+name;
    }
}
class Item{
    int itemCode;
    String description;
    Item(int itemCode, String description){
        this.itemCode=itemCodel;
        this.description=description;
    }
}
class CustomerStack{
    private Node top;
    public void push(Customer customer){
        Node node=new Node(customer);
        node.next=top;
        top=node;
    }
    public Customer pop(){
        if(top!=null){
            Customer cus=top.customer;
            top=top.next;
            return cus;
        }
        return null;
    }
    class Node{
        private Customer customer;
        private Node next;
        Node(Customer customer){this.customer=customer;}
    }
    public String toString(){
        String list="[";
        Node temp=top;
        while(temp!=null){
            list+=temp.customer+", ";
            temp=temp.next;
        }
        list+= top==null ? "empty]" : "\b\b]";
        return list;
    }
}
class Demo{
    public static void main(String args[]){
        CustomerStack stack=new CustomerStack();
        stack.push(new Customer(1001,"Danapala"));
        stack.push(new Customer(1002,"Gunapala"));
        stack.push(new Customer(1003,"Somapala"));
        stack.push(new Customer(1004,"Siripala"));
        System.out.println(stack);

        CustomerStack stack2=new CustomerStack();
        stack2.push( new Item(1,"A"));
        stack2.push( new Item(2,"B"));
        stack2.push( new Item(3,"C"));
    }
}
*/


//Q02 From Q01(Using Class "Object")
//--------------------------------
/*
class Customer{
    private int code;
    private String name;
    public Customer(int code, String name){this.code=code;this.name=name;}
    public String toString(){
        return code+"-"+name;
    }
}
class Item{
    int itemCode;
    String description;
    Item(int itemCode, String description){
        this.itemCode=itemCode;
        this.description=description;
    }
    public String toString(){
        return itemCode+"-"+description;
    }
}
class Stack{
    private Node top;
    public void push(Object obj){
        Node node=new Node(obj);
        node.next=top;
        top=node;
    }
    public Object pop(){
        if(top!=null){
            Object obj=top.obj;
            top=top.next;
            return obj;
        }
        return null;
    }
    class Node{
        private Object obj;
        private Node next;
        Node(Object obj){this.obj=obj;}
    }
    public String toString(){
        String list="[";
        Node temp=top;
        while(temp!=null){
            list+=temp.obj+", ";
            temp=temp.next;
        }
        list+= top==null ? "empty]" : "\b\b]";
        return list;
    }
}
class Demo{
    public static void main(String args[]){
        Stack customerStack=new Stack();
        customerStack.push(new Customer(1001,"Danapala"));
        customerStack.push(new Customer(1002,"Gunapala"));
        customerStack.push(new Customer(1003,"Somapala"));
        customerStack.push(new Customer(1004,"Siripala"));
        System.out.println(customerStack);

        Stack itemStack=new Stack();
        itemStack.push( new Item(1,"A"));
        itemStack.push( new Item(2,"B"));
        itemStack.push( new Item(3,"C"));
        System.out.println(itemStack);
    }
}
*/

//Q03 From Q02
//------------
/*
class Customer{
    private int code;
    private String name;
    public Customer(int code, String name){this.code=code;this.name=name;}
    public String toString(){
        return code+"-"+name;
    }
}
class Item{
    int itemCode;
    String description;
    Item(int itemCode, String description){
        this.itemCode=itemCode;
        this.description=description;
    }
    public String toString(){
        return itemCode+"-"+description;
    }
}
class Stack{
    private Node top;
    public void push(Object obj){
        Node node=new Node(obj);
        node.next=top;
        top=node;
    }
    public Object pop(){
        if(top!=null){
            Object obj=top.obj;
            top=top.next;
            return obj;
        }
        return null;
    }
    class Node{
        private Object obj;
        private Node next;
        Node(Object obj){this.obj=obj;}
    }
    public String toString(){
        String list="[";
        Node temp=top;
        while(temp!=null){
            list+=temp.obj+", ";
            temp=temp.next;
        }
        list+= top==null ? "empty]" : "\b\b]";
        return list;
    }
}
class Demo{
    public static void main(String args[]){
        Stack customerStack=new Stack();
        customerStack.push(new Customer(1001,"Danapala"));
        customerStack.push(new Customer(1002,"Gunapala"));
        customerStack.push(new Customer(1003,"Somapala"));
        customerStack.push(new Customer(1004,"Siripala"));
        customerStack.push(new Item(1,"D")); //Legal ->push(Object ob)
        System.out.println(customerStack);

        Customer topCustomer=(Customer)customerStack.pop(); //Object pop()==>Runtime error

        Stack itemStack=new Stack();
        itemStack.push( new Item(1,"A"));
        itemStack.push( new Item(2,"B"));
        itemStack.push( new Item(3,"C"));
        itemStack.push(new Customer(1005,"Amarapala")); //Legal
        System.out.println(itemStack);
    }
}
*/

