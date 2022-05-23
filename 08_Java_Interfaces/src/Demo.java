
// ===================================== Java Interfaces ==============================================

/*abstract class Vehicle{
	abstract public void park();
	abstract public void start();
	abstract public void stop();
}*/
/*

interface Vehicle{
    public void park(); //implicitly public, abstract
    public void start();
    public void stop();
}
*/

// -------------------------------------------------------------------------------------------------

//Case I
//------
/*
interface Vehicle{

}
//class Car extends Vehicle{} //Illegal
class Car implements Vehicle{} //Legal
*/


//Case II
//-------
/*
interface Vehicle{
    public void park();
    public void start();
}
class Car implements Vehicle{} //Illegal
class Van implements Vehicle{ //Illegal
    public void park(){

    }
}
class Bus implements Vehicle{ //legal
    public void park(){

    }
    public void start(){

    }
}
*/


//Case III
//--------
/*
interface Vehicle{
    void park(); //implicitly public
    public void start();
    protected void stop(); //Illegal

}
*/
