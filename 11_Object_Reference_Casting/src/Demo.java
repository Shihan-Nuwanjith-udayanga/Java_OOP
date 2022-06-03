
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


//Case I
//------
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
        A a1=new A();
        a1.mA();
        B b1=(B)a1; //Runtime Error -->ClassCastException
        b1.mB();
    }
}
*/

//Case II ("instanceof")
//----------------------
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
        A a1=new A();
        if(a1 instanceof B){
            B b1=(B)a1;
            b1.mB();
        }
        System.out.println("a1 instanceof of B : "+(a1 instanceof B));
        a1=new B();
        if(a1 instanceof B){
            B b1=(B)a1;
            b1.mB();
        }
        System.out.println("a1 instanceof of B : "+(a1 instanceof B));
    }
}
*/

//Exercise
//--------
/*
class A{}
class B extends A{}
class C extends B{}
class D extends B{}
class Demo{
    public static void main(String args[]){
        A a1=new A();
        A a2=new B();
        A a3=new C();
        A a4=new D();
        B b1=new B();
        B b2=new C();
        B b3=new D();
        C c1=new C();
        D d1=new D();

        System.out.println("a1 instanceof of A : "+(a1 instanceof A));
        System.out.println("a1 instanceof of B : "+(a1 instanceof B));
        System.out.println("a1 instanceof of C : "+(a1 instanceof C));
        System.out.println("a1 instanceof of D : "+(a1 instanceof D));

        System.out.println("a2 instanceof of A : "+(a2 instanceof A));
        System.out.println("a2 instanceof of B : "+(a2 instanceof B));
        System.out.println("a2 instanceof of C : "+(a2 instanceof C));
        System.out.println("a2 instanceof of D : "+(a2 instanceof D));

        System.out.println("a3 instanceof of A : "+(a3 instanceof A));
        System.out.println("a3 instanceof of B : "+(a3 instanceof B));
        System.out.println("a3 instanceof of C : "+(a3 instanceof C));
        System.out.println("a3 instanceof of D : "+(a3 instanceof D));

        System.out.println("a4 instanceof of A : "+(a4 instanceof A));
        System.out.println("a4 instanceof of B : "+(a4 instanceof B));
        System.out.println("a4 instanceof of C : "+(a4 instanceof C));
        System.out.println("a4 instanceof of D : "+(a4 instanceof D));

        System.out.println("b1 instanceof of A : "+(b1 instanceof A));
        System.out.println("b1 instanceof of B : "+(b1 instanceof B));
        System.out.println("b1 instanceof of C : "+(b1 instanceof C));
        System.out.println("b1 instanceof of D : "+(b1 instanceof D));

        System.out.println("b2 instanceof of A : "+(b2 instanceof A));
        System.out.println("b2 instanceof of B : "+(b2 instanceof B));
        System.out.println("b2 instanceof of C : "+(b2 instanceof C));
        System.out.println("b2 instanceof of D : "+(b2 instanceof D));

        System.out.println("b3 instanceof of A : "+(b3 instanceof A));
        System.out.println("b3 instanceof of B : "+(b3 instanceof B));
        System.out.println("b3 instanceof of C : "+(b3 instanceof C));
        System.out.println("b3 instanceof of D : "+(b3 instanceof D));

        System.out.println("c1 instanceof of A : "+(c1 instanceof A));
        System.out.println("c1 instanceof of B : "+(c1 instanceof B));
        System.out.println("c1 instanceof of C : "+(c1 instanceof C));
        System.out.println("c1 instanceof of D : "+(c1 instanceof D));

        System.out.println("d1 instanceof of A : "+(d1 instanceof A));
        System.out.println("d1 instanceof of B : "+(d1 instanceof B));
        System.out.println("d1 instanceof of C : "+(d1 instanceof C));
        System.out.println("d1 instanceof of D : "+(d1 instanceof D));

    }
}
*/

//Case III
//--------
/*
class A{}
class B extends A{}
class C{}
class Demo{
    public static void main(String args[]){
        A a1=new A();
        B b1=new B();
        C c1=new C();

        a1=(A)b1; //a1=b1; //Legal
        b1=(B)a1;

        c1=(C)a1;
        a1=(A)c1;
        b1=(B)c1;
        c1=(C)b1;
    }
}
*/

//Case IV
//-------
/*
class A{}
interface I{}
class B{}
class Demo{
    public static void main(String args[]){
        A a1=null;
        B b1=null;
        I iob=null;

        //a1=iob;//Illegal
        a1=(A)iob; //Legal
        //iob=a1; //Illegal
        iob=(I)a1; //Legal

        a1=(A)b1;//Illegal
        b1=(B)a1;//Illegal
    }
}
*/


//Case V
//------
/*
final class A{}
interface I{}
class B{}
class Demo{
    public static void main(String args[]){
        A a1=null;
        I iob=null;

        a1=(A)iob; //Illegal
        iob=(I)a1; //Illegal
    }
}
*/

