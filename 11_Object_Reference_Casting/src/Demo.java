
// ===================================== Object Reference Casting =============================================

/*
class A{
    public void mA(){
        System.out.println("mA");
    }
}
class B extends A{
    public void mB(){
        System.out.println("mB");
    }
}
class Demo{
    public static void main(String args[]){
        A a1=new B();
        a1.mA();
        a1.mB(); //Illegal
    }
}
*/


/*
class A{
    public void mA(){
        System.out.println("mA");
    }
}
class B extends A{
    public void mB(){
        System.out.println("mB");
    }
}
class Demo{
    public static void main(String args[]){
        A a1=new B();
        a1.mA();
        //a1.mB(); //Illegal
        B b1=a1; //Illegal
        b1.mB(); //Legal
    }
}
*/


/*
class A{
    public void mA(){
        System.out.println("mA");
    }
}
class B extends A{
    public void mB(){
        System.out.println("mB");
    }
}
class Demo{
    public static void main(String args[]){
        A a1=new B();
        a1.mA();
        //a1.mB(); //Illegal
        //B b1=a1; //Illegal
        B b1=(B)a1; //Object Reference Casting
        b1.mB();
    }
}
*/

// -------------------------------------------------------------

/*public boolean equals(Object obj){
        //return this.code==obj.code; //? obj.code-->Illegal
        //Customer c1=obj;
        Customer c1=(Customer)obj; //Object reference casting
        return this.code==c1.code;
}
 */

// -------------------------------------------------------------