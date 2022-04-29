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
