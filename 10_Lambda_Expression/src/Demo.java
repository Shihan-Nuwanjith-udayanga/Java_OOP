
// ====================================== Lambda Expression =================================================

/*
interface  Vehicle{
    public void park();
}

class Demo{
    public static void main(String args[]){
		*/
/*Vehicle v1=new Vehicle(){
			public void park(){
				System.out.println("Car Parking..");
			}
		};
		v1.park();
		*//*

        Vehicle v1=	()->{
            System.out.println("Car Parking..");
        };
        v1.park();
    }
}
*/


//Case I
//------
/*
interface  Vehicle{
    public void park();
}

class Demo{
    public static void main(String args[]){
        Vehicle v1=	()->System.out.println("Car Parking..");
        v1.park();
    }
}
*/


//Case II
//-------
/*
interface  Vehicle{
    public void park();
}

class Demo{
    public static void main(String args[]){
        Vehicle v1=	()->{
            System.out.println("Car Parking..1");
            System.out.println("Car Parking..2");
        };
        v1.park();
    }
}
*/


//Case III
//--------
/*
interface  Vehicle{
    public void park(int location);
}

class Demo{
    public static void main(String args[]){
        Vehicle v1=	(int location)->{
            System.out.println("Car Parking..: "+location);
        };
        v1.park(1001);

        Vehicle v2=	(location)->{
            System.out.println("Car Parking..: "+location);
        };
        v1.park(1002);

    }
}
*/


//Case IV
//-------
/*
interface  Vehicle{
    public int  park(int location);
}

class Demo{
    public static void main(String args[]){
        Vehicle v1=(location)->100;
        int y=v1.park(1001);

        Vehicle v2=	(location)->{
            System.out.println("Car Parking..: "+location);
            return location;

        };
        int z=v1.park(1002);

    }
}
*/


//Case V
//------
/*
interface  Vehicle{
    public void  park(int location);
    public void  start();
}

class Demo{
    public static void main(String args[]){
        Vehicle v2=	(location)->{
            System.out.println("Car Parking..: "+location);
            return location;

        };
    }
}
*/


//Case VI
//-------
/*
interface  Vehicle{
    public void  park(int location);
    default public void  start(){
        System.out.println("Default implementation..");
    }
}

class Demo{
    public static void main(String args[]){
        Vehicle v2=	(location)->{
            System.out.println("Car Parking..: "+location);
        };
        v2.park(1001);
        v2.start();
    }
}
*/


//Case VII
//--------
/*
abstract class  Vehicle{
    abstract public void  park(int location);
}

class Demo{
    public static void main(String args[]){
        Vehicle v2=	(location)->{ //Illegal
            System.out.println("Car Parking..: "+location);
        };
    }
}
*/


// --------------------------------------------------------------------------------------------
//Q01
//Exercise
//--------
/*
interface  Arithmetic{
    public int  operate(int num1, int num2);
}
class Addition implements Arithmetic{
    public int  operate(int num1, int num2){
        return num1+num2;
    }
}
class Substraction implements Arithmetic{
    public int  operate(int num1, int num2){
        return num1-num2;
    }
}
class Multiplication implements Arithmetic{
    public int  operate(int num1, int num2){
        return num1*num2;
    }
}
class Division implements Arithmetic{
    public int  operate(int num1, int num2){
        return num1/num2;
    }
}
class Demo{
    public static void main(String args[]){
        Arithmetic add=new Addition();
        Arithmetic sub=new Substraction();
        Arithmetic mul=new Multiplication();
        Arithmetic div=new Division();

        int x=100,y=50;
        System.out.println(x+" + "+y+" = "+add.operate(x,y));
        System.out.println(x+" - "+y+" = "+sub.operate(x,y));
        System.out.println(x+" * "+y+" = "+mul.operate(x,y));
        System.out.println(x+" / "+y+" = "+div.operate(x,y));
    }
}
*/

//Q02 From Q01 (Local Inner)
//--------------------------
/*
interface  Arithmetic{
    public int  operate(int num1, int num2);
}
class Demo{
    public static void main(String args[]){
        class Addition implements Arithmetic{
            public int  operate(int num1, int num2){
                return num1+num2;
            }
        }
        class Substraction implements Arithmetic{
            public int  operate(int num1, int num2){
                return num1-num2;
            }
        }
        class Multiplication implements Arithmetic{
            public int  operate(int num1, int num2){
                return num1*num2;
            }
        }
        class Division implements Arithmetic{
            public int  operate(int num1, int num2){
                return num1/num2;
            }
        }
        Arithmetic add=new Addition();
        Arithmetic sub=new Substraction();
        Arithmetic mul=new Multiplication();
        Arithmetic div=new Division();

        int x=100,y=50;
        System.out.println(x+" + "+y+" = "+add.operate(x,y));
        System.out.println(x+" - "+y+" = "+sub.operate(x,y));
        System.out.println(x+" * "+y+" = "+mul.operate(x,y));
        System.out.println(x+" / "+y+" = "+div.operate(x,y));
    }
}
*/


//Q03 From Q02 (Anonymous Inner)
//------------------------------
/*
interface  Arithmetic{
    public int  operate(int num1, int num2);
}
class Demo{
    public static void main(String args[]){
        Arithmetic add=new Arithmetic(){
            public int  operate(int num1, int num2){
                return num1+num2;
            }
        };
        Arithmetic sub=new Arithmetic(){
            public int  operate(int num1, int num2){
                return num1-num2;
            }
        };
        Arithmetic mul=new Arithmetic(){
            public int  operate(int num1, int num2){
                return num1*num2;
            }
        };
        Arithmetic div=new Arithmetic(){
            public int  operate(int num1, int num2){
                return num1/num2;
            }
        };

        int x=100,y=50;
        System.out.println(x+" + "+y+" = "+add.operate(x,y));
        System.out.println(x+" - "+y+" = "+sub.operate(x,y));
        System.out.println(x+" * "+y+" = "+mul.operate(x,y));
        System.out.println(x+" / "+y+" = "+div.operate(x,y));
    }
}
*/


//Q04 (Lambda Expression)
//-----------------------
/*
interface  Arithmetic{
    public int  operate(int num1, int num2);
}
class Demo{
    public static void main(String args[]){
        Arithmetic add=(num1,num2)->num1+num2;
        Arithmetic sub=(num1,num2)->num1-num2;
        Arithmetic mul=(num1,num2)->num1*num2;
        Arithmetic div=(num1,num2)->num1/num2;

        int x=100,y=50;
        System.out.println(x+" + "+y+" = "+add.operate(x,y));
        System.out.println(x+" - "+y+" = "+sub.operate(x,y));
        System.out.println(x+" * "+y+" = "+mul.operate(x,y));
        System.out.println(x+" / "+y+" = "+div.operate(x,y));
    }
}
*/









































































