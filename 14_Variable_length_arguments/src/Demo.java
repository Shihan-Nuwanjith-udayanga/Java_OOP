
// ============================= Variable length arguments (Var-args) Since JDK1.5 =============================

/*
class Demo{
    public static void myMethod(int x){
        System.out.println("myMethod(int)");
    }
    public static void myMethod(int x, int y){
        System.out.println("myMethod(int,int)");
    }
    public static void myMethod(int x, int y, int z){
        System.out.println("myMethod(int,int,int)");
    }
    public static void main(String args[]){
        Demo.myMethod(100);
        Demo.myMethod(100,200);
        Demo.myMethod(100,200,300);
        //Demo.myMethod(100,200,300,400);
    }
}
*/

/*
class Demo{
    public static void myMethod(int...x){
        System.out.println("myMethod(int)");
    }
    */
/*public static void myMethod(int x, int y){
        System.out.println("myMethod(int,int)");
    }
    public static void myMethod(int x, int y, int z){
        System.out.println("myMethod(int,int,int)");
    }*//*

    public static void main(String args[]){
        Demo.myMethod(100);
        Demo.myMethod(100,200);
        Demo.myMethod(100,200,300);
        Demo.myMethod(100,200,300,400);
    }
}
*/

/*
class Demo{
    public static void myMethod(int...xr){ //int[] xr;
        System.out.println("length : "+xr.length);
    }
    public static void main(String args[]){
        Demo.myMethod(100); //Demo.myMethod(new int[]{100});
        Demo.myMethod(100,200);//Demo.myMethod(new int[]{100,200});
        Demo.myMethod(100,200,300);
        Demo.myMethod(100,200,300,400);
    }
}
*/


/*
class Demo{
    public static void myMethod(int...xr){ //int[] xr;
        for(int i=0; i<xr.length; i++){
            System.out.print(xr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String args[]){
        Demo.myMethod(100,200,300,400); //Demo.myMethod(new int[]{100,200,300,400});
        Demo.myMethod(new int[]{100,200,300,400}); //Legal
    }
}
*/

/*
class Demo{
    public static void myMethod(int...xr){ //int[] xr;
        for(int i=0; i<xr.length; i++){
            System.out.print(xr[i]+" ");
        }
        System.out.println("length : "+xr.length);
    }
    public static void main(String args[]){
        Demo.myMethod(); //Demo.myMethod(new int[]{});
    }
}
*/

/*
class Demo{
    public static void myMethod(int...xr){}
    public static void myMethod(int[] xr){} //Illegal
    public static void main(String args[]){

    }
}
*/

//Exercise
/*
class Demo{
    public static void myMethod1(int a, int...xr){}
    public static void myMethod2(int[]...xr,int a){} //Illegal
    public static void main(String args[]){
        Demo.myMethod1(100,200,200,200,200);
        Demo.myMethod2(100,200,200,200,200);
    }
}
*/

/*
class Demo{
    public static void myMethod(int...xr){}
    public static void myMethod(int[] xr){} //Illegal
    public static void main(String args[]){

    }
}
*/



