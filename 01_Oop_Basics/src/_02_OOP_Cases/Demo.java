package _02_OOP_Cases;

// ================================= OOP Cases ================================================

//Case I
//------
/*
class Box{
    int length;	//Attributes declaration
    int width;	//Attributes declaration
    int height;	//Attributes declaration
}

class Demo{
    public static void main(String args[]){
        int[] xr;
        xr=new int[3];
        System.out.println(xr);
        xr[0]=100;
        System.out.println(xr[0]);

        Box b1; //Create a reference variable type "Box"
        b1=new Box(); //Create an Object type "Box"

        System.out.println(b1);
        b1.length=12; //access attributes
        System.out.println(b1.length);
    }
}
*/


//Case II (Adding methods to an Object)
//--------------------------------------
/*
class Box{
    int length;	//Attributes declaration
    int width;	//Attributes declaration
    int height;	//Attributes declaration

    public void printVolume(){
        int volume; //Local Variable
        volume=length*width*height;
        System.out.println("Volume of the box : "+volume);
    }
}

class Demo{
    public static void main(String args[]){
        Box b1=new Box();
        b1.length=12;
        b1.width=5;
        b1.height=4;
        b1.printVolume();
    }
}
*/

//Case III (Adding a Paramterized method)
//---------------------------------------
/*
class Box{
    int length;	//Attributes declaration
    int width;	//Attributes declaration
    int height;	//Attributes declaration

    public void printVolume(){
        int volume; //Local Variable
        volume=length*width*height;
        System.out.println("Volume of the box : "+volume);
    }
    public void setSize(int l, int w, int h){ //l, w and h are parameters (local variables)
        length=l;
        width=w;
        height=h;
    }
}

class Demo{
    public static void main(String args[]){
        Box b1=new Box();
        b1.setSize(12,5,3);
        b1.printVolume();
    }
}
*/

// ---------------------------------------------
//Exercise
/*
class Box{
    int length;	//Attributes declaration
    int width;	//Attributes declaration
    int height;	//Attributes declaration

    public void printVolume(){
        int volume; //Local Variable
        volume=length*width*height;
        System.out.println("Volume of the box : "+volume);
    }
    public void setSize(int length, int width, int height){ //l, w and h are parameters (local variables)
        length=length;
        width=width;
        height=height;
    }
}

class Demo{
    public static void main(String args[]){
        Box b1=new Box();
        b1.setSize(12,5,3);
        b1.printVolume();
        System.out.println("Length : "+b1.length); //0
        System.out.println("Width  : "+b1.width);//0
        System.out.println("Height : "+b1.height);//0
    }
}
*/

// -----------------------------------------------------------------------------

// Case IV Keyword "this"
// ----------------------
/*
class Box{
    int length;
    int width;
    int height;

    public void printVolume(){
        int volume;
        volume=length*width*height;
        System.out.println("Volume of the box : "+volume);
    }
    public void setSize(int length, int width, int height){ //l, w and h are parameters (local variables)
        this.length=length;
        this.width=width;
        this.height=height;
    }
}

class Demo{
    public static void main(String args[]){
        Box b1=new Box();
        b1.setSize(12,5,3);
        b1.printVolume();
        System.out.println("Length : "+b1.length); //12
        System.out.println("Width  : "+b1.width);//5
        System.out.println("Height : "+b1.height);//3
    }
}
*/


// ----------------------------------------------------------------------------
//Exercise
/*
class Test{
    int a;
    public void m(){
        System.out.println(this);
    }
}
class Demo{
    public static void main(String args[]){
        Test t1=new Test();
        Test t2=new Test();

        System.out.println(t1);
        t1.m();

        System.out.println(t2);
        t2.m();
    }
}
*/

// ----------------------------------------------------------------------------

//Case V (Default Values)
//-----------------------
/*
class Box{
    int length;
    int width;
    int height;
}

class Demo{
    public static void main(String args[]){
        Box b1=new Box();
        System.out.println("Length : "+b1.length); //0
        System.out.println("Width  : "+b1.width);//0
        System.out.println("Height : "+b1.height);//0
    }
}
*/

// ----------------------------------------------------------------------------
//Exercise
/*
class Test{
    int x;
    long y;
    float f;
    double d;
    boolean b;
    char ch;
    Box box;
    int[] xr;
}

class Demo{
    public static void main(String args[]){
        Test t1=new Test();
        System.out.println("int   : "+t1.x);
        System.out.println("long  : "+t1.y);
        System.out.println("float : "+t1.f);
        System.out.println("double: "+t1.d);
        System.out.println("bollean : "+t1.b);
        System.out.println("char    : "+t1.ch);
        System.out.println("Box     : "+t1.box);
        System.out.println("int[]   : "+t1.xr);
    }
}
*/

// ----------------------------------------------------------------------------

// Case VI (Null Referencing)
// --------------------------
/*
class Box{
    int length;
    int width;
    int height;

    public void printVolume(){
        int volume;
        volume=length*width*height;
        System.out.println("Volume of the box : "+volume);
    }
    public void setSize(int length, int width, int height){ //l, w and h are parameters (local variables)
        this.length=length;
        this.width=width;
        this.height=height;
    }
}

class Demo{
    public static void main(String args[]){
        Box b1=null;
        b1.length=12;
        b1.width=5;
        b1.height=3;

        b1.printVolume();

        b1.setSize(120,50,30);
        b1.printVolume();
    }
}
*/

// ---------------------------------------------------------------------------
//Ezxercise
/*
class Test{
    int a;
    double b;

    void mA(){}
}
class Demo{
    public static void main(String args[]){
        int x;
        Test t1=null;
        t1.x=100; //Illegal
        t1.a=200;
        t1.b=32.4;
        t1.mA();
        t1.mB(); //Illegal
    }
}
*/

// ---------------------------------------------------------------------------

//Case VII (Reference assignment)
//-------------------------------
/*
class Box{
    int length;
    int width;
    int height;

    public void printVolume(){
        int volume;
        volume=length*width*height;
        System.out.println("Volume of the box : "+volume);
    }
    public void setSize(int length, int width, int height){ //l, w and h are parameters (local variables)
        this.length=length;
        this.width=width;
        this.height=height;
    }
}
class Demo{
    public static void main(String args[]){
        Box b1=new Box();
        b1.setSize(12,5,3);
        Box b2=new Box();
        b2.setSize(120,50,30);

        System.out.println("Length of b1 : "+b1.length);
        System.out.println("Width  of b1 : "+b1.width);
        System.out.println("Height of b1 : "+b1.height);
        b1.printVolume();

        System.out.println("Length of b1 : "+b1.length);
        System.out.println("Width  of b1 : "+b1.width);
        System.out.println("Height of b1 : "+b1.height);
        b2.printVolume();
        System.out.println(b1==b2);

        b1=b2;
        System.out.println("Length of b1 : "+b1.length);
        System.out.println("Width  of b1 : "+b1.width);
        System.out.println("Height of b1 : "+b1.height);
        b1.printVolume();

        System.out.println("Length of b1 : "+b1.length);
        System.out.println("Width  of b1 : "+b1.width);
        System.out.println("Height of b1 : "+b1.height);
        b2.printVolume();
        System.out.println(b1==b2);

    }
}
*/


//Case VIII (Reference Compatibility)
//------------------------------------
/*
class A{}
class B{}
class C{}

class Demo{
    public static void main(String args[]){
        A a1=new A();
        B b1=new B();
        C c1=new C();

        A a2=new B(); //Illegal

        B b2=new C(); //Illegal

        a1=b1; //Illegal
        a1=c1; //Illegal


    }
}
*/

// Case IX (Passing an Object to a Method)
// ---------------------------------------
/*
class Box{
    int length;
    int width;
    int height;

    public void printVolume(){
        int volume;
        volume=length*width*height;
        System.out.println("Volume of the box : "+volume);
    }
    public void copyValuesFrom(Box b){
        this.length=b.length;
        this.width=b.width;
        this.height=b.height;
    }
    public void setSize(int length, int width, int height){ //l, w and h are parameters (local variables)
        this.length=length;
        this.width=width;
        this.height=height;
    }
}
class Demo{
    public static void main(String args[]){
        Box b1=new Box();
        b1.setSize(12,5,3);
        b1.printVolume();

        Box b2=new Box();
        b2.printVolume(); //Volume is : 0

        b2.copyValuesFrom(b1);
        b2.printVolume(); //Volume is : 180
    }
}
*/

//(Using Method Overloading)
//---------------------------
/*
class Box{
    int length;
    int width;
    int height;

    public void printVolume(){
        int volume;
        volume=length*width*height;
        System.out.println("Volume of the box : "+volume);
    }
    public void setSize(Box b){
		*/
/*this.length=b.length;
		this.width=b.width;
		this.height=b.height;*//*

        setSize(b.length, b.width,b.height);
    }
    public void setSize(int length, int width, int height){ //l, w and h are parameters (local variables)
        this.length=length;
        this.width=width;
        this.height=height;
    }
}
class Demo{
    public static void main(String args[]){
        Box b1=new Box();
        b1.setSize(12,5,3);
        b1.printVolume();

        Box b2=new Box();
        b2.printVolume(); //Volume is : 0

        b2.setSize(b1); //
        b2.printVolume(); //Volume is : 180
    }
}
*/

// Case X (Returning an Object)
// ----------------------------
/*
class Box{
    int length;
    int width;
    int height;

    public void printVolume(){
        int volume;
        volume=length*width*height;
        System.out.println("Volume of the box : "+volume);
    }
    public void setSize(Box b){
		*/
/*this.length=b.length;
		this.width=b.width;
		this.height=b.height;*//*

        setSize(b.length, b.width,b.height);
    }
    public void setSize(int length, int width, int height){ //l, w and h are parameters (local variables)
        this.length=length;
        this.width=width;
        this.height=height;
    }
    public Box getCopy(){
        Box b1=new Box();
        //b1.setSize(this);
        b1.setSize(this.length,this.width,this.height);
        return b1;
    }
}
class Demo{
    public static void main(String args[]){
        Box b1=new Box();
        b1.setSize(12,5,3);
        b1.printVolume();

        Box b2;
        b2=b1.getCopy();

        b2.printVolume(); //180
        System.out.println(b1==b2); //false
    }
}
*/
