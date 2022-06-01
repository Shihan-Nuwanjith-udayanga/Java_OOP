
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

















































































