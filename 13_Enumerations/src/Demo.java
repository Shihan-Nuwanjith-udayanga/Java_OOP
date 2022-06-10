
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
