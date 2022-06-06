
// ================================ Garbage Collections ===================================================

/*
class MyClass{
    long[] xr=new long[100000];
}
class Demo{
    public static void main(String args[]){
        System.out.println("start");
        for (int i = 0; i < 10000; i++){
            System.out.println("i : "+i);
            new MyClass();
        }
        //
        System.out.println("end");
    }
}
*/


/*
class MyClass{
    long[] xr=new long[100000];
}
class Demo{
    public static void main(String args[]){
        System.out.println("start");
        MyClass[] cr=new MyClass[10000];
        for (int i = 0; i < 10000; i++){
            System.out.println("i : "+i);
            cr[i]=new MyClass();
        }
        //
        System.out.println("end");
    }
}
*/


//Case I
//------
/*
class MyClass{
    long[] xr=new long[100000];
    public void finalize(){
        System.out.println("deleted...");
    }
}
class Demo{
    public static void main(String args[]){
        System.out.println("start");
        MyClass[] cr=new MyClass[10000];
        for (int i = 0; i < 10000; i++){
            System.out.println("i : "+i);
            new MyClass();
        }
        System.out.println("end");
    }
}
*/


//Case II
//-------
/*
class MyClass{
    long[] xr=new long[100000];
    public void finalize(){
        System.out.println("deleted...");
    }
}
class Demo{
    public static void main(String args[]){
        System.out.println("start");
        new MyClass();
        new MyClass();
        new MyClass();
        try{Thread.sleep(1000);}catch(Exception ex){}
        System.out.println("end");
    }
}
*/


//Case III
//--------
/*
class MyClass{
    long[] xr=new long[100000];
    public void finalize(){
        System.out.println("deleted...");
    }
}
class Demo{
    public static void main(String args[]){
        System.out.println("start");
        new MyClass();
        new MyClass();
        new MyClass();
        System.gc(); //request-->Runtime.getRuntime().gc();
        try{Thread.sleep(1000);}catch(Exception ex){}
        System.out.println("end");
    }
}
*/









