
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

