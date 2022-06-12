
// ========================== Enumerations (enums) Since JDK1.5 ============================================

//Q01
/*
enum Colour{
    RED, GREEN, BLACK, BLUE; //enum Objects
}
class Demo{
    public static void main(String args[]){
        Colour c1; //enum eference type Colour
        //c1=new Colour();
        c1=Colour.RED;
        System.out.println(c1); //c1.toString()
    }
}
*/

//Q02
/*
enum Colour{
    RED, GREEN, BLACK, BLUE; //enum Objects
}
class Demo{
    public static void main(String args[]){
        Object[] data=Colour.values();
        for(Object ob : data){
            System.out.println(ob); //ob.toString()
        }

        Colour[] colours=Colour.values(); //Legal
    }
}
*/


//Q03
/*
enum Colour{
    RED, GREEN, BLACK, BLUE; //enum Objects
}
class Demo{
    public static void main(String args[]){
        Colour c1=Colour.RED;
        switch(c1){
            case BLACK :
            case RED : //Legal
        }
    }
}
//byte, short, int, char, String, enums
*/


//Q04
/*
enum Colour{
    RED(), GREEN(), BLACK(), BLUE; //BLUE-->BLUE()
    Colour(){
        System.out.println("Colour()");
    }
}
class Demo{
    public static void main(String args[]){
        Colour c1=Colour.RED;
    }
}
*/


//Q05
/*
enum Colour{
    RED(1001), GREEN(1002), BLACK(), BLUE(1003);
    private int code;
    Colour(){
        System.out.println("Colour()");
    }
    Colour(int code){
        System.out.println("Colour(int)");
        this.code=code;
    }
    public void setCode(int code){this.code=code;}
    public int getCode(){return code;}
}
class Demo{
    public static void main(String args[]){
        Colour c1=Colour.RED;
        System.out.println("code RED : "+c1.getCode());
        c1.setCode(2222);
        System.out.println("code RED : "+c1.getCode());
    }
}
*/











