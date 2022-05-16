
// ======================== Class "Object"	=====================================

/*
class Customer{ //compiler inserts "extends Object"

}
class Demo{
    public static void main(String args[]){
        Customer c1=new Customer();
        c1.toString(); //Legal
        c1.hashCode();
        c1.equals(c1);
        c1.getClass();
        c1.myMethod(); //Illegal
    }
}
*/

/*
class Customer{ //compiler inserts "extends java.lang.Object"
    Customer(){
        super(); //Legal
    }
}
*/


/*
import javax.swing.*;
class Customer{ }

class Demo{
    public static void main(String args[]){
        Object ob;
        ob=new Customer();
        ob=new String();
        ob=new JFrame();
        ob=new JButton();
        ob=new int[10];

    }
}
*/

// -----------------------------------------------------------------------------------------

// ========================== Method "public Class getClass()" =============================

/*
import javax.swing.*;
class Customer{

}

class Demo{
    public static void main(String args[]){
        Customer c1=new Customer();
        Class template=c1.getClass();
        String name=template.getName();
        System.out.println(name);
    }
}

*/

// -----------------------------------------------------------------------------------------

// ========================== Method "public int hashCode()" =============================

/*
import javax.swing.*;
class Customer{
    int code;
    String name;
    Customer(int code, String name){
        this.code=code;
        this.name=name;
    }
}

class Demo{
    public static void main(String args[]){
        Customer c1=new Customer(1001,"Danapala");
        Customer c2=new Customer(1002,"Gunapala");

        System.out.println("c1 : "+c1.hashCode());
        System.out.println("c2 : "+c2.hashCode());
    }
}
*/


/*
import javax.swing.*;
class Customer{
    int code;
    String name;
    Customer(int code, String name){
        this.code=code;
        this.name=name;
    }
}

class Demo{
    public static void main(String args[]){
        Customer c1=new Customer(1001,"Danapala");
        Customer c2=new Customer(1002,"Gunapala");
        System.out.println(c1);
        String hex=Integer.toHexString(c1.hashCode());
        System.out.println(hex);
    }
}
*/


// -----------------------------------------------------------------------------------------

// ========================== Method "public String toString()" ============================

/*
import javax.swing.*;
class Customer{
    int code;
    String name;
    Customer(int code, String name){
        this.code=code;
        this.name=name;
    }
}

class Demo{
    public static void main(String args[]){
        Customer c1=new Customer(1001,"Danapala");
        Customer c2=new Customer(1002,"Gunapala");
        System.out.println(c1); //call c1.toString()
        System.out.println(c1.toString());

    }
}
*/

/*
import javax.swing.*;
class Customer{
    int code;
    String name;
    Customer(int code, String name){
        this.code=code;
        this.name=name;
    }
}
*/
/* From class "Object"
public String toString(){
	return getClass().getName()+'@'+Integer.toHexString(hashCode());
}
*//*


class Demo{
    public static void main(String args[]){
        Customer c1=new Customer(1001,"Danapala");
        Customer c2=new Customer(1002,"Gunapala");
        System.out.println(c1); //call c1.toString()
        System.out.println(c1.toString());

    }
}
*/

/*
import javax.swing.*;
class Customer{
    int code;
    String name;
    Customer(int code, String name){
        this.code=code;
        this.name=name;
    }
    public String toString(){
        return code+"-"+name;
    }
}
*/
/* From class "Object"
public String toString(){
	return getClass().getName()+'@'+Integer.toHexString(hashCode());
}
*//*


class Demo{
    public static void main(String args[]){
        Customer c1=new Customer(1001,"Danapala");
        Customer c2=new Customer(1002,"Gunapala");
        System.out.println(c1); //1001-Danapala
        System.out.println(c1.toString());

    }
}
*/

/*
import javax.swing.*;
class Customer{
    int code;
    String name;
    Customer(int code, String name){
        this.code=code;
        this.name=name;
    }
    public String toString(){
        return code+"-"+name;
    }
}
class Demo{
    public static void main(String args[]){
        int x=100;
        String name="Niroth";
        Customer c1=new Customer(1001,"Danapala");

        System.out.println(x); //100
        System.out.println(name); //Niroth
        System.out.println(c1);//1001-Danapala

    }
}
*/

// -----------------------------------------------------------------------------------------------------

//Exercise 01

/*
class Customer{
    private int code;
    private String name;
    public Customer(int code, String name){this.code=code;this.name=name;}
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
}
class Demo{
    public static void main(String args[]){
        CustomerStack stack=new CustomerStack();
        stack.push(new Customer(1001,"Danapala"));
        stack.push(new Customer(1002,"Gunapala"));
        stack.push(new Customer(1003,"Somapala"));
        stack.push(new Customer(1004,"Siripala"));
        System.out.println(stack); //[1004-Siripala, 1003-Gunapala, 1002-Gunapala, 1001-Danapala]

        Customer topCustomer=stack.pop();
        System.out.println("Top Customer : "+topCustomer); //1004-Siripala

        System.out.println(stack); //[1004-Siripala, 1003-Gunapala, 1002-Gunapala, 1001-Danapala]
    }
}
*/

//Exercise 02 From 01
/*
class Customer{
    private int code;
    private String name;
    public Customer(int code, String name){this.code=code;this.name=name;}
    public String toString(){
        return code+"-"+name;
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
        System.out.println(stack); //[1004-Siripala, 1003-Gunapala, 1002-Gunapala, 1001-Danapala]

        Customer topCustomer=stack.pop();
        System.out.println("Top Customer : "+topCustomer); //1004-Siripala

        System.out.println(stack); //[1004-Siripala, 1003-Gunapala, 1002-Gunapala, 1001-Danapala]
    }
}
*/

// -----------------------------------------------------------------------------------------------------

//exercise 03
/*
import javax.swing.*;
import java.awt.*;
class Customer{
    int code;
    String name;
    Customer(int code,String name){
        this.code=code;
        this.name=name;
    }
}
class NewJFrame extends javax.swing.JFrame {
    JComboBox customerBox;
    NewJFrame() {
        customerBox = new JComboBox();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(300,300);
        setLayout(new FlowLayout());

        customerBox.addItem(new Customer(1001,"Danapala"));
        customerBox.addItem(new Customer(1003,"Gunapala"));
        customerBox.addItem(new Customer(1002,"Somapala"));
        customerBox.addItem(new Customer(1004,"Amarapala"));

        add(customerBox);
    }
}
class Demo{
    public static void main(String args[]){
        new NewJFrame().setVisible(true);
    }
}
*/

//Exercise 04 From 03
/*
import javax.swing.*;
import java.awt.*;
class Customer{
    int code;
    String name;
    Customer(int code,String name){
        this.code=code;
        this.name=name;
    }
    public String toString(){
        return code+"-"+name;
    }
}
class NewJFrame extends javax.swing.JFrame {
    JComboBox customerBox;
    NewJFrame() {
        customerBox = new JComboBox();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(300,300);
        setLayout(new FlowLayout());

        customerBox.addItem(new Customer(1001,"Danapala"));
        customerBox.addItem(new Customer(1003,"Gunapala"));
        customerBox.addItem(new Customer(1002,"Somapala"));
        customerBox.addItem(new Customer(1004,"Amarapala"));
        add(customerBox);
    }
}
class Demo{
    public static void main(String args[]){
        new NewJFrame().setVisible(true);
    }
}
*/


// -----------------------------------------------------------------------------------------------------

//Exercise
/*
import java.util.*;
class Customer{
    int code;
    String name;
    Customer(int code,String name){
        this.code=code;
        this.name=name;
    }
}
class Demo{
    public static void main(String args[]){
        ArrayList ar=new ArrayList();
        ar.add(new Customer(1001,"Danapala"));
        ar.add(new Customer(1002,"Gunapala"));
        ar.add(new Customer(1003,"Somapala"));
        ar.add(new Customer(1004,"Amarapala"));
        System.out.println(ar); //ar.toString() of ArrayList--->[1001-Danapala, 1002-Gunapala, 1003-Somapala, 1004-Amarapala]

    }
}
*/

/*
import javax.swing.*;
import java.util.*;
class Customer{
    int code;
    String name;
    Customer(int code,String name){
        this.code=code;
        this.name=name;
    }
    public String toString(){
        return code+"-"+name;
    }
}

class Demo{
    public static void main(String args[]){
        ArrayList ar=new ArrayList();
        ar.add(new Customer(1001,"Danapala"));
        ar.add(new Customer(1002,"Gunapala"));
        ar.add(new Customer(1003,"Somapala"));
        ar.add(new Customer(1004,"Amarapala"));
        System.out.println(ar); //ar.toString() of ArrayList--->[1001-Danapala, 1002-Gunapala, 1003-Somapala, 1004-Amarapala]
    }
}
*/

// -----------------------------------------------------------------------------------------

// ========================== Method "public boolean equals(Object)" =======================

/*
import javax.swing.*;
import java.util.*;
class Customer{
    int code;
    String name;
    Customer(int code,String name){
        this.code=code;
        this.name=name;
    }
    public String toString(){
        return code+"-"+name;
    }
}

class Demo{
    public static void main(String args[]){
        ArrayList stringList=new ArrayList();
        stringList.add(new String("A"));
        stringList.add("B");
        stringList.add(new String("C"));
        stringList.add(new String("D"));
        stringList.add(new String("E"));
        System.out.println(stringList);//[A,B,C,D,E]

        stringList.remove(1);
        System.out.println(stringList);//[A,C,D,E]

        stringList.remove(new String("C"));
        System.out.println(stringList);//[A,D,E]

        ArrayList customerList=new ArrayList();
        customerList.add(new Customer(1001,"Danapala"));
        customerList.add(new Customer(1002,"Gunapala"));
        customerList.add(new Customer(1003,"Somapala"));
        customerList.add(new Customer(1004,"Amarapala"));
        customerList.add(new Customer(1005,"Siripala"));
        System.out.println(customerList);//[1001-Danapala, 1002-Gunapala, 1003-Somapala, 1004-Amarapala, 1005-Siripala]

        customerList.remove(1);
        System.out.println(customerList);//[1001-Danapala, 1003-Somapala, 1004-Amarapala, 1005-Siripala]

        customerList.remove(new Customer(1003,"Somapala"));
        System.out.println(customerList);//[1001-Danapala, 1003-Somapala, 1004-Amarapala, 1005-Siripala]

    }
}
*/


/*
import javax.swing.*;
import java.util.*;
class Customer{
    int code;
    String name;
    Customer(int code,String name){
        this.code=code;
        this.name=name;
    }
    public String toString(){
        return code+"-"+name;
    }
}

class Demo{
    public static void main(String args[]){
        Customer c1=new Customer(1001,"Danapala");
        Customer c2=new Customer(1001,"Danapala");
        Customer c3=new Customer(1002,"Gunapala");
        Customer c4=c1;

        System.out.println("c1==c2 : "+(c1==c2)); //false
        System.out.println("c1==c3 : "+(c1==c3)); //false
        System.out.println("c1==c4 : "+(c1==c4)); //true

    }
}
*/


/*
import javax.swing.*;
import java.util.*;
class Customer{
    int code;
    String name;
    Customer(int code,String name){
        this.code=code;
        this.name=name;
    }
    public String toString(){
        return code+"-"+name;
    }
	*/
/* from Class "Object"
	public boolean equals(Object obj)
		return this==obj;
	}
	*//*

}

class Demo{
    public static void main(String args[]){
        Customer c1=new Customer(1001,"Danapala");
        Customer c2=new Customer(1001,"Danapala");
        Customer c3=new Customer(1002,"Gunapala");
        Customer c4=c1;

        System.out.println("c1==c2 : "+c1.equals(c2)); //false
        System.out.println("c1==c3 : "+c1.equals(c3)); //false
        System.out.println("c1==c4 : "+c1.equals(c4)); //true

    }
}
*/


// -----------------------------------------------------------------------------------------

// ================= Overriding method "public boolean equals(Object)" ======================

//Q01
/*
import javax.swing.*;
import java.util.*;
class Customer{
    int code;
    String name;
    Customer(int code,String name){
        this.code=code;
        this.name=name;
    }
    public String toString(){
        return code+"-"+name;
    }
	*/
/*
	public boolean equals(Object obj){
		return true;
	}
	*//*

}

class Demo{
    public static void main(String args[]){
        Customer c1=new Customer(1001,"Danapala");
        Customer c2=new Customer(1001,"Danapala");
        Customer c3=new Customer(1002,"Gunapala");
        Customer c4=c1;

        System.out.println("c1==c2 : "+c1.equals(c2)); //false
        System.out.println("c1==c3 : "+c1.equals(c3)); //false
        System.out.println("c1==c4 : "+c1.equals(c4)); //true

    }
}
*/

//Q02
/*
import javax.swing.*;
import java.util.*;
class Customer{
    int code;
    String name;
    Customer(int code,String name){
        this.code=code;
        this.name=name;
    }
    public String toString(){
        return code+"-"+name;
    }

    public boolean equals(Object obj){
        //return this.code==obj.code; //? obj.code-->Illegal
        //Customer c1=obj;
        Customer c1=(Customer)obj; //Object reference casting
        return this.code==c1.code;
    }
}

class Demo{
    public static void main(String args[]){
        Customer c1=new Customer(1001,"Danapala");
        Customer c2=new Customer(1001,"Danapala");
        Customer c3=new Customer(1002,"Gunapala");
        Customer c4=c1;

        System.out.println("c1==c2 : "+c1.equals(c2)); //false
        System.out.println("c1==c3 : "+c1.equals(c3)); //false
        System.out.println("c1==c4 : "+c1.equals(c4)); //true

    }
}
*/

//Q03
/*
import javax.swing.*;
import java.util.*;
class Customer{
    int code;
    String name;
    Customer(int code,String name){
        this.code=code;
        this.name=name;
    }
    public String toString(){
        return code+"-"+name;
    }
    public boolean equals(Object obj){
        return obj instanceof Customer ? ((Customer)obj).code==this.code : false;
    }
}

class Demo{
    public static void main(String args[]){
        ArrayList stringList=new ArrayList();
        stringList.add(new String("A"));
        stringList.add("B");
        stringList.add(new String("C"));
        stringList.add(new String("D"));
        stringList.add(new String("E"));
        System.out.println(stringList);//[A,B,C,D,E]

        stringList.remove(1);
        System.out.println(stringList);//[A,C,D,E]

        stringList.remove(new String("C"));
        System.out.println(stringList);//[A,D,E]

        ArrayList customerList=new ArrayList();
        customerList.add(new Customer(1001,"Danapala"));
        customerList.add(new Customer(1002,"Gunapala"));
        customerList.add(new Customer(1003,"Somapala"));
        customerList.add(new Customer(1004,"Amarapala"));
        customerList.add(new Customer(1005,"Siripala"));
        System.out.println(customerList);//[1001-Danapala, 1002-Gunapala, 1003-Somapala, 1004-Amarapala, 1005-Siripala]

        customerList.remove(1);
        System.out.println(customerList);//[1001-Danapala, 1003-Somapala, 1004-Amarapala, 1005-Siripala]

        customerList.remove(new Customer(1003,"Somapala"));
        System.out.println(customerList);//[1001-Danapala, 1003-Somapala, 1004-Amarapala, 1005-Siripala]

    }
}
*/


// -----------------------------------------------------------------------------------------

// ================================= Exercise "instanceof" =================================

/*
class A{}
class B extends A{}
class C extends A{}
class Demo{
    public static void main(String args[]){
        A a1=new A();
        A a2=new B();
        A a3=new C();
        B b1=new B();
        C c1=new C();

        System.out.println("a1 instanceof A : "+(a1 instanceof A));
        System.out.println("a1 instanceof B : "+(a1 instanceof B));
        System.out.println("a1 instanceof C : "+(a1 instanceof C));

        System.out.println("a2 instanceof A : "+(a2 instanceof A));
        System.out.println("a2 instanceof B : "+(a2 instanceof B));
        System.out.println("a2 instanceof C : "+(a2 instanceof C));

        System.out.println("a3 instanceof A : "+(a3 instanceof A));
        System.out.println("a3 instanceof B : "+(a3 instanceof B));
        System.out.println("a3 instanceof C : "+(a3 instanceof C));

        System.out.println("b1 instanceof A : "+(b1 instanceof A));
        System.out.println("b1 instanceof B : "+(b1 instanceof B));
        //System.out.println("b1 instanceof C : "+(b1 instanceof C));

        System.out.println("c1 instanceof A : "+(c1 instanceof A));
        //System.out.println("c1 instanceof B : "+(c1 instanceof B));
        System.out.println("c1 instanceof C : "+(c1 instanceof C));
    }
}
*/


