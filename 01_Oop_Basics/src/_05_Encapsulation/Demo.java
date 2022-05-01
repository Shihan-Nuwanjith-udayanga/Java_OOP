package _05_Encapsulation;

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


