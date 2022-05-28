
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



