package _03_Object_Initialization;

// ==================================== Object Initialization ===========================================

/*
class Box{
    int length;
    int width;
    int height;
    */
/* Compiler inserts the default constructor
    Box(){
        length=0;
        width=0;
        height=0;
    }
    *//*

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
        Box b1=new Box(); //new "Box()"
        b1.setSize(12,5,3);
        b1.printVolume();
    }
}
*/

//Case I
//------
/*
class Box{
    int length;
    int width;
    int height;
    Box(){
        length=1;
        width=1;
        height=1;
        System.out.println("Box()");
    }
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
        b1.printVolume();

        Box b2=new Box();
        b2.printVolume();
    }
}
*/

//Case II (Parameterized Constructor)
//-----------------------------------
/*
class Box{
    int length;
    int width;
    int height;
    Box(int length, int width, int height){
        this.length=length;
        this.width=width;
        this.height=height;
        System.out.println("Box(int,int,int)");
    }
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
        //Box b1=new Box();
        Box b1=new Box(12,5,3);
        b1.printVolume();

        Box b2=new Box(120,50,30);
        b2.printVolume();
    }
}
*/

//Case III (Constructor Overloading)
//----------------------------------
/*
class Box{
    int length;
    int width;
    int height;
    Box(int length, int width, int height){
        this.length=length;
        this.width=width;
        this.height=height;
        System.out.println("Box(int,int,int)");
    }
    Box(int length){
        this.length=length;
        this.width=length;
        this.height=length;
        System.out.println("Box(int)");
    }
    Box(){
        this.length=10;
        this.width=10;
        this.height=10;
        System.out.println("Box()");
    }
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
        b1.printVolume();

        Box b2=new Box(5);
        b2.printVolume();

        Box b3=new Box(12,5,3);
        b3.printVolume();
    }
}
*/

// Case IV Calling "this(xxx)"
// --------------------------
/*
class Box{
    int length;
    int width;
    int height;
    Box(int length, int width, int height){
        this.length=length;
        this.width=width;
        this.height=height;
        System.out.println("Box(int,int,int)");
    }
    Box(int length){
		*/
/*this.length=length;
		this.width=length;
		this.height=length;*//*

        this(length,length,length);//Box(length,length,length);
        System.out.println("Box(int)");
    }
    Box(){
		*/
/*this.length=10;
		this.width=10;
		this.height=10;*//*

        this(10);
        System.out.println("Box()");
    }
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
        b1.printVolume();
    }
}
*/

//Case V (Declaration Values)
//---------------------------
/*
class Box{
    int length=1;
    int width=1;
    int height=1;

    */
/*Compiler Inserts
     Box(){
        length=1;
        width=1;
        height=1;
    }
    *//*

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
        b1.printVolume();
    }
}
*/

// -----------------------------------------------------------------------------------------

// Exercise
/*
class Test{
    int a=100;
    int b;
}
class Demo{
    public static void main(String args[]){
        Test t1=new Test();
        System.out.println("a : "+t1.a);
        System.out.println("b : "+t1.b);
    }
}
*/

// Exercise
/*
class Test{
    int a=100;
    int b;
    Test(){
        a=50;
        b=20;
    }
    Test(int i){

    }
    Test(int i, int j){
        a=i;
        b=j;
    }
}
class Demo{
    public static void main(String args[]){
        Test t1=new Test();
        System.out.println("a : "+t1.a);
        System.out.println("b : "+t1.b);

        Test t2=new Test(1000);
        System.out.println("a : "+t2.a);
        System.out.println("b : "+t2.b);

        Test t3=new Test(1,2);
        System.out.println("a : "+t3.a);
        System.out.println("b : "+t3.b);
    }
}
*/

// ---------------------------------------------------------------------------------------------

//Case VI (Instance Blocks)
//-------------------------
/*
class Test{
    int a=100;
    int b;
    b=200; //Illegal
	System.out.println("a statement...");//Illegal
}
class Demo{
    public static void main(String args[]){
        int a=100;
        int b;
        b=200; //Legal
        System.out.println("a statement...");//Legal
    }
}
*/


// Using an instance block..
//---------------------------
/*
class Test{
    int a=100;
    int b;
    {
        b=200;
        System.out.println("Instance Block..");
    }
}
class Demo{
    public static void main(String args[]){
        Test t1=new Test();
        System.out.println("a : "+t1.a);
        System.out.println("b : "+t1.b); //200
    }
}
*/

// -------------------------------------------------------------------------------------------------

//Exercise
/*
class Test{
    int a=100;
    int b=20;
    {
        b=200;
        c=300;
    }
    int c=400;
}
class Demo{
    public static void main(String args[]){
        Test t1=new Test();
        System.out.println("a : "+t1.a); //100
        System.out.println("b : "+t1.b); //200
        System.out.println("c : "+t1.c); //400
    }
}
*/


// Exercise
// --------
/*
class Test{
    int a=100;

    {
        b=200;
    }
    Test(){
        c=1000;
    }
    int b=500;
    Test(int i){

    }
    Test(int i, int j){
        a=i;
        b=j;
    }
    int c=400;
}
class Demo{
    public static void main(String args[]){
        Test t1=new Test();
        System.out.println("a of t1  : "+t1.a);
        System.out.println("b of t1  : "+t1.b);
        System.out.println("c of t1  : "+t1.c);

        Test t2=new Test(1);
        System.out.println("a of t2  : "+t2.a);
        System.out.println("b of t2  : "+t2.b);
        System.out.println("c of t2  : "+t2.c);

        Test t3=new Test(10,20);
        System.out.println("a of t3  : "+t3.a);
        System.out.println("b of t3  : "+t3.b);
        System.out.println("c of t3  : "+t3.c);
    }
}
*/

