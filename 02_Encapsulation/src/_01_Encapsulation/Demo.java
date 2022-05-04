package _01_Encapsulation;

// =========================================== Encapsulation =================================================

//Step 01
/*
class Date{
    int year;
    int month;
    int day;

    public void setDate(int y, int m, int d){
        year=y;
        month=m;
        day=d;
    }
    public void printDate(){
        System.out.println(year+"-"+month+"-"+day);
    }
}
class Demo{
    public static void main(String args[]){
        Date d1=new Date();
        d1.year=2019;
        d1.month=2;
        d1.day=30;
        d1.printDate();

        d1.year=2019;
        d1.month=13;
        d1.day=32;
        d1.printDate();
    }
}
*/

//Step 02
/*
class Date{
    private int year;
    private int month;
    private int day;

    public void setDate(int y, int m, int d){
        year=y;
        month=m;
        day=d;
    }
    public void printDate(){
        System.out.println(year+"-"+month+"-"+day);
    }
}
class Demo{
    public static void main(String args[]){
        Date d1=new Date();
        d1.year=2019;
        d1.month=2;
        d1.day=30;
        d1.printDate();

        d1.year=2019;
        d1.month=13;
        d1.day=32;
        d1.printDate();
    }
}
*/

//Step 03
/*
class Date{
    private int year=1970;
    private int month=1;
    private int day=1;

    public void setMonth(int month){
        if(month<=12 && month>=1){
            this.month=month;
        }
    }
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public void setYear(int year){
        if(year>=1){
            this.year=year;
        }
    }
    public void setDay(int day){
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: if(day<=31 && day>=1){this.day=day;};
                break;
            case 2 : if(day<=29 && day>=1){this.day=day;}break;
        }
    }
    public void setDate(int y, int m, int d){
        year=y;
        month=m;
        day=d;
    }
    public void printDate(){
        System.out.println(year+"-"+month+"-"+day);
    }
}
class Demo{
    public static void main(String args[]){
        Date d1=new Date();
		*/
/*d1.year=2019;
		d1.month=2;
		d1.day=30;*//*

        d1.setYear(2019);
        d1.setMonth(12);
        d1.setDay(30);
        d1.printDate();

        d1.setYear(0);
        d1.printDate();

        d1.setMonth(13);
        d1.printDate();

        d1.setDay(32);
        d1.printDate();

        d1.setDay(20);
        d1.setMonth(2);
        d1.printDate();

        d1.setDay(30);
        d1.printDate();
    }
}
*/

// ========================================================================================================

// Exercise
//---------
// Step 01
/*
class Date{
    private int year=1970;
    private int month=1;
    private int day=1;

    public void setMonth(int month){
        if(month<=12 && month>=1){
            this.month=month;
        }
    }
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public void set(int value){

    }
    public void setYear(int year){
        if(year>=1){
            this.year=year;
        }
    }
    public void setDay(int day){
        if(day<=31 && day>=1){this.day=day;}
    }
    public void setDate(int y, int m, int d){
        year=y;
        month=m;
        day=d;
    }
    public void printDate(){
        System.out.println(year+"-"+month+"-"+day);
    }
}
class Demo{
    public static void main(String args[]){
        Date d1=new Date();
        d1.set(1999);
        d1.printDate();	//1999-1-1

        d1.set(12);
        d1.printDate(); //1999-12-1

        d1.set(31);		//1999-12-31
        d1.printDate();
    }
}
*/

//Step 02
/*
class Date{
    private int year=1970;
    private int month=1;
    private int day=1;

    public static final int YEAR=0;
    public static final int MONTH=1;
    public static final int DAY=2;

    public void setMonth(int month){
        if(month<=12 && month>=1){
            this.month=month;
        }
    }
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public void set(int field,int value){
        switch(field){
            case 0 : this.year=value;break;
            case 1 : this.month=value;break;
            case 2 : this.day=value;break;
            default: //
        }
    }
    public void setYear(int year){
        if(year>=1){
            this.year=year;
        }
    }
    public void setDay(int day){
        if(day<=31 && day>=1){this.day=day;}
    }
    public void setDate(int y, int m, int d){
        year=y;
        month=m;
        day=d;
    }
    public void printDate(){
        System.out.println(year+"-"+month+"-"+day);
    }
}
class Demo{
    public static void main(String args[]){
        Date d1=new Date();
        d1.set(Date.YEAR,1999);
        d1.printDate();	//1999-1-1

        d1.set(Date.MONTH,12);//d1.set(1,12);
        d1.printDate(); //1999-12-1

        d1.set(Date.DAY,31); //d1.set(2,31);		//1999-12-31
        d1.printDate();
    }
}
*/

// ========================================================================================================

//Exercise 1
//----------
/*
class Customer{

}
class Demo{
    public static void main(String args[]){
        Customer c1;
        c1=new Customer();
    }
}
*/

//Exercise 2
//----------
/*
class Customer{
    private String name;
    private double salary;
    public Customer(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    public void printCustomer(){
        System.out.println(name+" - "+salary);
    }
}
class Demo{
    public static void main(String args[]){
        Customer c1=new Customer("Danapala",45000);
        Customer c2=new Customer("Gunapala",34000);
        c1.printCustomer();
        c2.printCustomer();
        c1=c2;
        c1.printCustomer();
        c2.printCustomer();
    }
}
*/

//Exercise 3
//----------
/*
class Customer{
    String name;
    double salary;
    Order order;

    public void printCustomer(){
        System.out.println(name+" - "+salary);
    }
    public void printOrder(){
        System.out.println(order.orderId+" - "+order.date);
    }
}
class Order{
    String orderId;
    String date;
    Order(String orderId, String date){this.orderId=orderId;this.date=date;}
}
class Demo{
    public static void main(String args[]){
        Customer c1=new Customer();
        System.out.println(c1.name+" "+c1.salary+" "+c1.order);

        c1.name="Danapala";
        c1.salary=45000;
        c1.order=new Order("P001","1990-12-31");

        c1.printCustomer();
        c1.printOrder();

    }
}
*/

//Exercise 4
//----------
/*
class Customer{
    private String name;
    private double salary;
    private Order order;

    public void printCustomer(){
        System.out.println(name+" - "+salary);
    }
    public void printOrder(){
        System.out.println(order.orderId+" - "+order.date);
    }
}
class Order{
    private String orderId;
    private String date;
    Order(String orderId, String date){this.orderId=orderId;this.date=date;}
}
class Demo{
    public static void main(String args[]){
        Customer c1=new Customer();
        System.out.println(c1.name+" "+c1.salary+" "+c1.order);

        c1.name="Danapala";
        c1.salary=45000;
        c1.order=new Order("P001","1990-12-31");

        c1.printCustomer();
        c1.printOrder();

    }
}
*/

//Exercise 5 (From Exercise 4)
//----------------------------
/*
class Customer{
    private String name;
    private double salary;
    private Order order;

    public void printCustomer(){
        System.out.println(name+" - "+salary);
    }
    public void printOrder(){
        System.out.println(order.getOrderDetail());
    }
}
class Order{
    private String orderId;
    private String date;
    Order(String orderId, String date){this.orderId=orderId;this.date=date;}
    public String getOrderDetail(){
        return orderId+"-"+date;
    }
}
class Demo{
    public static void main(String args[]){
        Order d1=new Order("P001","1999-12-31");
        Customer c1=new Customer("Danapala",450000,d1); //?
        c1.printCustomer();
        c1.printOrder();

    }
}
*/

//Exercise 6 (From Exercise 5)
//----------------------------
/*
class Customer{
    private String name;
    private double salary;
    private Order order;
    public Customer(String name, double salary, Order order){
        this.name=name;
        this.salary=salary;
        this.order=order;
    }
    public void printCustomer(){
        System.out.println(name+" - "+salary);
    }
    public void printOrder(){
        System.out.println(order.getOrderDetail());
    }
}
class Order{
    private String orderId;
    private String date;
    Order(String orderId, String date){this.orderId=orderId;this.date=date;}
    public String getOrderDetail(){
        return orderId+"-"+date;
    }
}
class Demo{
    public static void main(String args[]){
        Order d1=new Order("P001","1999-12-31");
        Customer c1=new Customer("Danapala",450000,d1); //?
        c1.printCustomer();
        c1.printOrder();

    }
}

*/

//Exercise 7
//----------
/*
class Customer{
    private String name;
    private double salary;
    Customer next;

    public Customer(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    public void printCustomer(){
        System.out.println(name+" - "+salary);
    }
}
class Demo{
    public static void main(String args[]){
        Customer c1=new Customer("Danapala",45000);
        Customer c2=new Customer("Gunapala",35000);
        c1.next=c2;
        c1.printCustomer();
        c1.next.printCustomer();
    }
}
*/

//Exercise 8
//----------
/*
class Customer{
    private String name;
    private double salary;
    Customer next;

    public Customer(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    public void printCustomer(){
        System.out.println(name+" - "+salary);
    }
}
class Demo{
    public static void main(String args[]){
        Customer c1=new Customer("Danapala",45000);
        c1.next=new Customer("Gunapala",35000);
        c1.next.next=new Customer("Somapala",55000);
        c1.next.next.next=new Customer("Siripala",25000);
        c1.printCustomer();
        c1.next.printCustomer();
        c1.next.next.printCustomer();
        c1.next.next.next.printCustomer();
        //c1.next.next.next.next.printCustomer(); //NullPointerException
    }
}
*/


//-----------------------------------------------------------------------------------------------------------

//Exercise 9
//----------
/*
class Customer{
    private String name;
    private double salary;
    Customer next;

    public Customer(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    public void printCustomer(){
        System.out.println(name+" - "+salary);
    }
}
class Demo{
    public static void main(String args[]){
        Customer c1=new Customer("Danapala",45000);
        c1.next=new Customer("Gunapala",35000);
        c1.next.next=new Customer("Somapala",55000);
        c1.next.next.next=new Customer("Siripala",25000);
        //Insert codes to print Customer Details [Danapala-45000, Gunapala-350000, Somapala-55000, Siripala-25000]

        //Insert code to increment Customer salary by 10%

        //Insert codes to print Customer Details [Danapala-49500, Gunapala-38500, Somapala-60500, Siripala-27500]
    }
}
*/


//Exercise 10 (From Exercise 9)
//----------------------------
/*
class Customer{
    private String name;
    private double salary;
    Customer next;

    public Customer(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    public void printCustomer(){
        System.out.println(name+" - "+salary);
    }
    public String getCustomerDetail(){
        return name+"-"+salary;
    }
}
class Demo{
    public static void main(String args[]){
        Customer c1=new Customer("Danapala",45000);
        c1.next=new Customer("Gunapala",35000);
        c1.next.next=new Customer("Somapala",55000);
        c1.next.next.next=new Customer("Siripala",25000);
        //Insert codes to print Customer Details [Danapala-45000, Gunapala-350000, Somapala-55000, Siripala-25000]
        Customer temp=c1;
        System.out.print("[");
        while(temp!=null){
            System.out.print(temp.getCustomerDetail()+", ");
            temp=temp.next;
        }
        System.out.println("\b\b]");

        //Insert code to increment Customer salary by 10%


        //Insert codes to print Customer Details [Danapala-49500, Gunapala-38500, Somapala-60500, Siripala-27500]
    }
}
*/

//Exercise 11 (From Exercise 10)
//------------------------------
/*
class Customer{
    private String name;
    private double salary;
    Customer next;

    public Customer(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    public void printCustomer(){
        System.out.println(name+" - "+salary);
    }
    public String getCustomerDetail(){
        return name+"-"+salary;
    }
    public void incrementSalary(double rate){
        salary*=(rate+100)/100;
    }
}
class Demo{
    public static void main(String args[]){
        Customer c1=new Customer("Danapala",45000);
        c1.next=new Customer("Gunapala",35000);
        c1.next.next=new Customer("Somapala",55000);
        c1.next.next.next=new Customer("Siripala",25000);
        //Insert codes to print Customer Details [Danapala-45000, Gunapala-350000, Somapala-55000, Siripala-25000]
        Customer temp=c1;
        System.out.print("[");
        while(temp!=null){
            System.out.print(temp.getCustomerDetail()+", ");
            temp=temp.next;
        }
        System.out.println("\b\b]");

        //Insert code to increment Customer salary by 10%
        temp=c1;
        while(temp!=null){
            temp.incrementSalary(10);
            temp=temp.next;
        }

        //Insert codes to print Customer Details [Danapala-49500, Gunapala-38500, Somapala-60500, Siripala-27500]
        temp=c1;
        System.out.print("[");
        while(temp!=null){
            System.out.print(temp.getCustomerDetail()+", ");
            temp=temp.next;
        }
        System.out.println("\b\b]");
    }
}
*/

//Exercise 12 (From Exercise 11)
//------------------------------
/*
class Customer{
    private String name;
    private double salary;
    Customer next;

    public Customer(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    public void printCustomer(){
        System.out.println(name+" - "+salary);
    }
    public String getCustomerDetail(){
        return name+"-"+salary;
    }
    public void incrementSalary(double rate){
        salary*=(rate+100)/100;
    }
}
class Demo{
    public static void main(String args[]){
        Customer c1=new Customer("Danapala",45000);
        c1.next=new Customer("Gunapala",35000);
        c1.next.next=new Customer("Somapala",55000);
        c1.next.next.next=new Customer("Siripala",25000);
        //Insert codes to print Customer Details [Danapala-45000, Gunapala-350000, Somapala-55000, Siripala-25000]

        System.out.print("[");
        while(c1!=null){
            System.out.print(c1.getCustomerDetail()+", ");
            c1=c1.next;
        }
        System.out.println("\b\b]");

        //---------------------------------------------------------
        System.out.print("[");
        while(c1!=null){
            System.out.print(c1.getCustomerDetail()+", ");
            c1=c1.next;
        }
        System.out.println("\b\b]");
    }
}
*/

