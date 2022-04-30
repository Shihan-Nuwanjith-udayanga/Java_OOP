package _04_Static_Initialization;

// ====================== Static Initialization (Static Variable and Static Methods) =====================

//Static Variables
//----------------
/*
class Test{
    int a;
    static int b;
}
class Demo{
    public static void main(String args[]){
        Test t1=new Test();
        t1.a=1;
        t1.b=2;

        Test t2=new Test();
        t2.a=10;
        t2.b=20;

        Test t3=new Test();
        t3.a=100;
        t3.b=200;

        System.out.println("t1 : "+t1.a+" "+t1.b);
        System.out.println("t2 : "+t2.a+" "+t2.b);
        System.out.println("t3 : "+t3.a+" "+t3.b);
    }
}
*/

//Exercise
/*
class Test{
    int a=100;
    static int b=200;
}
class Demo{
    public static void main(String args[]){
        //System.out.println("a : "+Test.a); //Illegal ?
        System.out.println("b : "+Test.b);

        Test t1=new Test();
        System.out.println("a : "+t1.a); //Legal
        System.out.println("b : "+t1.b); //Legal
    }
}
*/

//Exercise
/*
class Test{
    int a=100;
    static int b=200;
    Test(int i, int j){
        a=i;
        b=j;
    }
}
class Demo{
    public static void main(String args[]){
        Test t1=new Test(1,2);
        Test t2=new Test(10,20);


        Test.b=-1;
        System.out.println("a of t1 : "+t1.a);
        System.out.println("b of t1 : "+t1.b);

        System.out.println("a of t2 : "+t2.a);
        System.out.println("b of t2 : "+t2.b);
    }
}
*/

//Static Methods
//--------------
/*
class Test{
    public void instanceMethod(){
        System.out.println("Instance method..");
    }
    public static void staticMethod(){
        System.out.println("static method..");
    }
}
class Demo{
    public static void main(String args[]){
        Test.staticMethod(); //Legal
        Test.instanceMethod(); //Illegal

        Test t1=new Test();
        t1.instanceMethod(); //Legal
    }
}
*/


//Exercise
/*
class Demo{
    public void myMethod(){
        System.out.println("myMethod()");
    }
    public static void main(String args[]){
        myMethod();
    }
}
*/

//----------------------------------------------

/*
class Demo{
    public void myMethod(){
        System.out.println("myMethod()");
    }
    public static void main(String args[]){
        //myMethod(); //Illegal
        Demo d1=new Demo();
        d1.myMethod(); //Legal
    }
}
*/

//----------------------------------------------


/*
class Demo{
    public static void myMethod(){
        System.out.println("myMethod()");
    }
    public static void main(String args[]){
        myMethod(); //Legal
        Demo d1=new Demo();
        d1.myMethod(); //Legal

        Demo.myMethod(); //Legal
    }
}
*/
