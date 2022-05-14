
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
