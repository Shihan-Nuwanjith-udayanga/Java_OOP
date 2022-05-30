
// ==================================== Inner Classes, Event Handling ===========================================

//Q01
/*
import javax.swing.*;
import java.awt.*;
class MyFrame extends JFrame{
    JButton exitButton;
    MyFrame(){
        setTitle("MyFrame");
        setSize(300,300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        exitButton=new JButton("Exit");
        exitButton.setFont(new Font("",1,25));
        add(exitButton);
    }
}
class Demo{
    public static void main(String args[]){
        new MyFrame().setVisible(true);
    }
}
*/

//Q02
/*
import javax.swing.*;
import java.awt.*;
class MyFrame extends JFrame{
    JButton exitButton;
    MyFrame(){
        setTitle("MyFrame");
        setSize(300,300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        exitButton=new JButton("Exit");
        exitButton.setFont(new Font("",1,25));
        A a1=new A();
        exitButton.addActionListener(a1); //Illegal
        add(exitButton);
    }
}
class A{
    public void m(){
        System.exit(0);
    }
}
class Demo{
    public static void main(String args[]){
        new MyFrame().setVisible(true);
    }
}
*/

//Q03 From Q02 (ActionListener vs ActionEvent)
//--------------------------------------------
/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame{
    JButton exitButton;
    MyFrame(){
        setTitle("MyFrame");
        setSize(300,300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        exitButton=new JButton("Exit");
        exitButton.setFont(new Font("",1,25));
        exitButton.addActionListener(new A());
        add(exitButton);
    }
}
class A implements ActionListener{
    public void actionPerformed(ActionEvent evt){
        System.exit(0);
    }
}
class Demo{
    public static void main(String args[]){
        new MyFrame().setVisible(true);
    }
}
*/


//Q04 (MouseListener vs MouseEvent)
//---------------------------------
/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame{
    JButton exitButton;
    MyFrame(){
        setTitle("MyFrame");
        setSize(300,300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        exitButton=new JButton("Exit");
        exitButton.setFont(new Font("",1,25));
        //exitButton.addActionListener(new A());
        exitButton.addMouseListener(new TestMouseListener());
        add(exitButton);
    }
}
class TestMouseListener implements MouseListener{
    public void mouseEntered(MouseEvent ect){
        System.out.println("Mouse entered..");
    }
    public void mouseExited(MouseEvent ect){
        System.out.println("Mouse exited..");
    }
    public void mousePressed(MouseEvent ect){
        System.out.println("Mouse pressed..");
    }
    public void mouseReleased(MouseEvent ect){
        System.out.println("Mouse released..");
    }
    public void mouseClicked(MouseEvent ect){
        System.out.println("Mouse clicked.");
    }
}
class Demo{
    public static void main(String args[]){
        new MyFrame().setVisible(true);
    }
}
*/


//Q05 KeyListener vs KeyEvent
//---------------------------
/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame{
    JButton setButton;
    JTextField textFiled;
    MyFrame(){
        setTitle("MyFrame");
        setSize(300,300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textFiled=new JTextField(10);
        textFiled.setFont(new Font("",1,25));
        textFiled.addKeyListener(new TestKeyListener());
        add(textFiled);

        setButton=new JButton("Set Title");
        setButton.setFont(new Font("",1,25));
        add(setButton);
    }
}
class TestKeyListener implements KeyListener{
    public void keyPressed(KeyEvent evt){
        System.out.println("keyPressed");
    }
    public void keyReleased(KeyEvent evt){
        System.out.println("keyReleased");
    }
    public void keyTyped(KeyEvent evt){
        System.out.println("keyTyped");
    }
}
class Demo{
    public static void main(String args[]){
        new MyFrame().setVisible(true);
    }
}
*/


//Exercise
//--------
/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame{
    JButton setButton;
    JTextField textFiled;
    MyFrame(){
        setTitle("MyFrame");
        setSize(300,300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textFiled=new JTextField(10);
        textFiled.setFont(new Font("",1,25));
        add(textFiled);

        setButton=new JButton("Set Title");
        setButton.setFont(new Font("",1,25));
        setButton.addActionListener(new SetButtonActionListener());
        add(setButton);
    }
}
class SetButtonActionListener implements ActionListener{
    public void actionPerformed(ActionEvent ect){
        String text=textFiled.getText(); //Illegal
        setTitle(text);	 //Illegal
    }
}
class Demo{
    public static void main(String args[]){
        new MyFrame().setVisible(true);
    }
}
*/


// ------------------------------------------------------------------------------------------------

//Q01
//Option I
//--------
/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame{
    JButton setButton;
    JTextField textFiled;
    MyFrame(){
        setTitle("MyFrame");
        setSize(300,300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textFiled=new JTextField(10);
        textFiled.setFont(new Font("",1,25));
        add(textFiled);

        setButton=new JButton("Set Title");
        setButton.setFont(new Font("",1,25));
        setButton.addActionListener(new SetButtonActionListener());
        add(setButton);
    }
}
class SetButtonActionListener implements ActionListener{
    MyFrame myFrame;
    public void actionPerformed(ActionEvent ect){
        String text=myFrame.textFiled.getText();
        myFrame.setTitle(text);
    }
}
class Demo{
    public static void main(String args[]){
        new MyFrame().setVisible(true);
    }
}
*/

//Q02 From Q01
/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame{
    JButton setButton;
    JTextField textFiled;
    MyFrame(){
        setTitle("MyFrame");
        setSize(300,300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textFiled=new JTextField(10);
        textFiled.setFont(new Font("",1,25));
        add(textFiled);

        setButton=new JButton("Set Title");
        setButton.setFont(new Font("",1,25));
        setButton.addActionListener(new SetButtonActionListener(this));
        add(setButton);
    }
}
class SetButtonActionListener implements ActionListener{
    MyFrame myFrame;
    SetButtonActionListener(MyFrame myFrame){this.myFrame=myFrame;}
    public void actionPerformed(ActionEvent ect){
        String text=myFrame.textFiled.getText();
        myFrame.setTitle(text);
    }
}
class Demo{
    public static void main(String args[]){
        new MyFrame().setVisible(true);
    }
}
*/


//Option II
//---------
/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame implements ActionListener{
    JButton setButton;
    JTextField textFiled;
    MyFrame(){
        setTitle("MyFrame");
        setSize(300,300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textFiled=new JTextField(10);
        textFiled.setFont(new Font("",1,25));
        add(textFiled);

        setButton=new JButton("Set Title");
        setButton.setFont(new Font("",1,25));
        setButton.addActionListener(this);
        add(setButton);
    }
    public void actionPerformed(ActionEvent ect){
        String text=textFiled.getText();
        setTitle(text);
    }
}

class Demo{
    public static void main(String args[]){
        new MyFrame().setVisible(true);
    }
}
*/


//Option III (Regular Inner Classes)
//----------------------------------
/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame{
    JButton setButton;
    JTextField textFiled;
    MyFrame(){
        setTitle("MyFrame");
        setSize(300,300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textFiled=new JTextField(10);
        textFiled.setFont(new Font("",1,25));
        add(textFiled);

        setButton=new JButton("Set Title");
        setButton.setFont(new Font("",1,25));
        setButton.addActionListener(new SetButtonActionListener());
        add(setButton);
    }
    //-----------Member/Regular Inner Class--------------------
    class SetButtonActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ect){
            String text=textFiled.getText();
            setTitle(text);
        }
    }
    //---------------------------------------------------------
}
class Demo{
    public static void main(String args[]){
        new MyFrame().setVisible(true);
    }
}
*/



//Option IV - Using Local Inner Classes
//--------------------------------------
/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame{
    JButton setButton;
    JTextField textFiled;
    MyFrame(){
        setTitle("MyFrame");
        setSize(300,300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textFiled=new JTextField(10);
        textFiled.setFont(new Font("",1,25));
        add(textFiled);

        setButton=new JButton("Set Title");
        setButton.setFont(new Font("",1,25));
        //-----------Local Inner Class----------------------------
        class SetButtonActionListener implements ActionListener{
            public void actionPerformed(ActionEvent ect){
                String text=textFiled.getText();
                setTitle(text);
            }
        }
        //---------------------------------------------------------
        setButton.addActionListener(new SetButtonActionListener());
        add(setButton);
    }
}
class Demo{
    public static void main(String args[]){
        new MyFrame().setVisible(true);
    }
}
*/


// -------------------------------------------------------------------------------------------

/*
class A{
    int a;
    void mA(){
        int local;
        class C{ //Local Inner

        }
    }
    class B{ //Member Inner
        int b;
        void mB(){
            //
        }
    }
    static class D{ //Static Inner

    }
}
*/


// -------------------------------------------------------------------------------------------

//Option V (Anonymous Inner Classes)
//----------------------------------
/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame{
    JButton setButton;
    JTextField textFiled;
    MyFrame(){
        setTitle("MyFrame");
        setSize(300,300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textFiled=new JTextField(10);
        textFiled.setFont(new Font("",1,25));
        add(textFiled);

        setButton=new JButton("Set Title");
        setButton.setFont(new Font("",1,25));
        //-----------Anonynmous Inner Class----------------------------
		*/
/*class SetButtonActionListener implements ActionListener{
			public void actionPerformed(ActionEvent ect){
				String text=textFiled.getText();
				setTitle(text);
			}
		}*//*

        //ActionListener ob=new ActionListener();
        ActionListener ob=new ActionListener(){
            public void actionPerformed(ActionEvent ect){
                String text=textFiled.getText();
                setTitle(text);
            }
        };
        //---------------------------------------------------------
        setButton.addActionListener(ob);
        add(setButton);
    }
}
class Demo{
    public static void main(String args[]){
        new MyFrame().setVisible(true);
    }
}
*/


// -------------------------------------------------------------------------------------------

/*
class Vehicle{
    public void park(){
        System.out.println("Vehicle Parking..");
    }
}

class Demo{
    public static void main(String args[]){
        Vehicle v1=new Vehicle();
        v1.park();

        Vehicle v2=new Vehicle(){};

    }
}
*/


/*
class Vehicle{
    public void park(){
        System.out.println("Vehicle Parking..");
    }
}

class Demo{
    public static void main(String args[]){
        Vehicle v1=new Vehicle();
        v1.park();

        Vehicle v2=new Vehicle(){
            int a;
            {
                System.out.println("Instance block....");
            }
            public void park(){
                System.out.println("Car Parking..");
            }
            public void anotherMethod(){
                System.out.println("anotherMethod");
            }
        };
        v2.park();

    }
}
*/


//Exercise
//--------
/*
class Vehicle{
    public void park(){
        System.out.println("Vehicle Parking..");
    }
}

class Demo{
    public static void main(String args[]){
        Vehicle v2=new Vehicle(){
            int a;
            {
                System.out.println("Instance block....");
            }
            public void park(){
                System.out.println("Car Parking..");
            }
            public void anotherMethod(){
                System.out.println("anotherMethod");
            }
        } // ===>;
        v2.park();

    }
}
*/

//Exercise
//--------
/*
abstract class Vehicle{
    abstract public void park();
}

class Demo{
    public static void main(String args[]){
        Vehicle v1=new Vehicle();
        Vehicle v2=new Vehicle(){};
        Vehicle v3=new Vehicle(){
            public void park(){
                System.out.println("Car Parking..");
            }
        };
        v3.park();

    }
}
*/


//Exercise
//--------
/*
interface  Vehicle{
    public void park();
}

class Demo{
    public static void main(String args[]){
        Vehicle v1=new Vehicle(); //Illegal
        Vehicle v2=new Vehicle(){}; //Illegal
        Vehicle v3=new Vehicle(){
            public void park(){
                System.out.println("Car Parking..");
            }
        };
        v3.park();

    }
}
*/








