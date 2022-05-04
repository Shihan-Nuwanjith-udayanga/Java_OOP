package _02_Class_Stack;

// ================================== Class "Stack" ===========================================

//Step I
//------
/*
class Demo{
    public static void main(String args[]){
        Stack s1=new Stack(); //Line 1
        s1.push(10);	//Line 2
        s1.push(20);	//Line 3
        s1.push(30);	//Line 4
        s1.push(40);	//Line 5
        s1.printStack(); //[40,30,20,10]	//Line 6

        s1.pop();	//Line 7
        s1.printStack(); //[30,20,10]	//Line 8

        s1.push(99);
        s1.printStack(); //[99,30,20,10]

    }
}
*/

//Step II
//-------
/*
class Node{
    int data;
    Node next;
    Node(int data){this.data=data;}
}
class Stack{
    Node top;
    public void push(int data){

    }
    public void pop(){

    }
    public void printStack(){

    }
}
class Demo{
    public static void main(String args[]){
        Stack s1=new Stack(); //Line 1
        s1.push(10);	//Line 2
        s1.push(20);	//Line 3
        s1.push(30);	//Line 4
        s1.push(40);	//Line 5
        s1.printStack(); //[40,30,20,10]	//Line 6

        s1.pop();	//Line 7
        s1.printStack(); //[30,20,10]	//Line 8

        s1.push(99);
        s1.printStack(); //[99,30,20,10]

    }
}
*/

//Step III
//--------
/*
class Node{
    int data;
    Node next;
    Node(int data){this.data=data;}
}
class Stack{
    Node top;
    public void push(int data){
        Node node=new Node(data);
        top=node;
    }
    public void pop(){

    }
    public void printStack(){
        Node temp=top;
        System.out.print("[");
        while(temp!=null){
            System.out.print(temp.data+", ");
            temp=temp.next;
        }
        System.out.println("\b\b]");
    }
}
class Demo{
    public static void main(String args[]){
        Stack s1=new Stack(); //Line 1
        s1.push(10);	//Line 2
        s1.push(20);	//Line 3
        s1.push(30);	//Line 4
        s1.push(40);	//Line 5
        s1.printStack(); //[40,30,20,10]	//Line 6

		*/
/*s1.pop();	//Line 7
		s1.printStack(); //[30,20,10]	//Line 8

		s1.push(99);
		s1.printStack(); //[99,30,20,10]
		*//*

    }
}
*/

//Step IV
//-------
/*
class Node{
    int data;
    Node next;
    Node(int data){this.data=data;}
}
class Stack{
    Node top;
    public void push(int data){
        Node node=new Node(data); //Create a node Object
        node.next=top;
        top=node;
    }
    public void pop(){

    }
    public void printStack(){
        Node temp=top;
        System.out.print("[");
        while(temp!=null){
            System.out.print(temp.data+", ");
            temp=temp.next;
        }
        System.out.println("\b\b]");
    }
}
class Demo{
    public static void main(String args[]){
        Stack s1=new Stack(); //Line 1
        s1.push(10);	//Line 2
        s1.push(20);	//Line 3
        s1.push(30);	//Line 4
        s1.push(40);	//Line 5
        s1.printStack(); //[40,30,20,10]	//Line 6

		*/
/*s1.pop();	//Line 7
		s1.printStack(); //[30,20,10]	//Line 8

		s1.push(99);
		s1.printStack(); //[99,30,20,10]
		*//*

    }
}
*/

//Step V
//------
/*
class Node{
    int data;
    Node next;
    Node(int data){this.data=data;}
}
class Stack{
    Node top;
    public void push(int data){
        Node node=new Node(data); //Create a node Object
        node.next=top;
        top=node;
    }
    public void pop(){
        if(top!=null){
            top=top.next;
        }
    }
    public void printStack(){
        Node temp=top;
        System.out.print("[");
        while(temp!=null){
            System.out.print(temp.data+", ");
            temp=temp.next;
        }
        System.out.println("\b\b]");
    }
}
class Demo{
    public static void main(String args[]){
        Stack s1=new Stack(); //Line 1
        s1.push(10);	//Line 2
        s1.push(20);	//Line 3
        s1.push(30);	//Line 4
        s1.push(40);	//Line 5
        s1.printStack(); //[40,30,20,10]	//Line 6

        s1.pop();	//Line 7
        s1.printStack(); //[30,20,10]	//Line 8

        s1.push(99);
        s1.printStack(); //[99,30,20,10]

    }
}
*/

//Step VI
//-------
/*
class Node{
    int data;
    Node next;
    Node(int data){this.data=data;}
}
class Stack{
    Node top;
    public void push(int data){
        Node node=new Node(data); //Create a node Object
        node.next=top;
        top=node;
    }
    public void pop(){
        if(top!=null){
            top=top.next;
        }
    }
    public void printStack(){
        Node temp=top;
        System.out.print("[");
        while(temp!=null){
            System.out.print(temp.data+", ");
            temp=temp.next;
        }
        System.out.println("\b\b]");
    }
}
class Demo{
    public static void main(String args[]){
        Stack s1=new Stack(); //Line 1
        s1.push(10);	//Line 2
        s1.push(20);	//Line 3
        s1.push(30);	//Line 4
        s1.push(40);	//Line 5
        s1.printStack(); //[40,30,20,10]	//Line 6
        System.out.println("Size of the stack : "+s1.size()); //4

        s1.pop();	//Line 7
        s1.printStack(); //[30,20,10]	//Line 8
        System.out.println("Size of the stack : "+s1.size()); //3

        s1.clear();
        System.out.println("Size of the stack : "+s1.size()); //0
    }
}
*/

//Step VII From Step VI
//---------------------
/*
class Node{
    int data;
    Node next;
    Node(int data){this.data=data;}
}
class Stack{
    Node top;
    public void push(int data){
        Node node=new Node(data); //Create a node Object
        node.next=top;
        top=node;
    }
    public void pop(){
        if(top!=null){
            top=top.next;
        }
    }
    public int size(){
        int count=0;
        Node temp=top;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public void clear(){
        top=null;
    }
    public void printStack(){
        Node temp=top;
        System.out.print("[");
        while(temp!=null){
            System.out.print(temp.data+", ");
            temp=temp.next;
        }
        System.out.println("\b\b]");
    }
}
class Demo{
    public static void main(String args[]){
        Stack s1=new Stack(); //Line 1
        s1.push(10);	//Line 2
        s1.push(20);	//Line 3
        s1.push(30);	//Line 4
        s1.push(40);	//Line 5
        s1.printStack(); //[40,30,20,10]	//Line 6
        System.out.println("Size of the stack : "+s1.size()); //4

        s1.pop();	//Line 7
        s1.printStack(); //[30,20,10]	//Line 8
        System.out.println("Size of the stack : "+s1.size()); //3

        s1.clear();
        System.out.println("Size of the stack : "+s1.size()); //0
    }
}
*/
