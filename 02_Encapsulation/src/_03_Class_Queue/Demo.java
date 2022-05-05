package _03_Class_Queue;

// ======================================= Class "Queue" ===========================================

//Step I
//------
/*
class Demo{
    public static void main(String args[]){
        Queue q1=new Queue();
        q1.enQueue(100);
        q1.enQueue(200);
        q1.enQueue(300);
        q1.enQueue(400);
        q1.printQueue(); //[100, 200, 300, 400]

        q1.deQueue();
        q1.printQueue(); //[200, 300, 400]
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
class Queue{
    Node front;
    public void enQueue(int data){

    }
    public void deQueue(){

    }
    public void printQueue(){

    }
}
class Demo{
    public static void main(String args[]){
        Queue q1=new Queue();
        q1.enQueue(100);
        q1.enQueue(200);
        q1.enQueue(300);
        q1.enQueue(400);
        q1.printQueue(); //[100, 200, 300, 400]

        q1.deQueue();
        q1.printQueue(); //[200, 300, 400]
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
class Queue{
    Node front;
    public void enQueue(int data){
        Node node=new Node(data);
        if(front==null){
            front=node;
        }else{
            Node temp=front;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
    }
    public void deQueue(){

    }
    public void printQueue(){
        Node temp=front;
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
        Queue q1=new Queue();
        q1.enQueue(100);
        q1.enQueue(200);
        q1.enQueue(300);
        q1.enQueue(400);
        q1.printQueue(); //[100, 200, 300, 400]

        q1.deQueue();
        q1.printQueue(); //[200, 300, 400]
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
class Queue{
    Node front;
    public void enQueue(int data){
        Node node=new Node(data);
        if(front==null){
            front=node;
        }else{
            Node temp=front;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
    }
    public void deQueue(){
        if(front!=null){
            front=front.next;
        }
    }
    public void printQueue(){
        Node temp=front;
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
        Queue q1=new Queue();
        q1.enQueue(100);
        q1.enQueue(200);
        q1.enQueue(300);
        q1.enQueue(400);
        q1.printQueue(); //[100, 200, 300, 400]
        q1.deQueue();
        q1.printQueue(); //[200, 300, 400]
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
class Queue{
    Node front;
    public void enQueue(int data){
        Node node=new Node(data);
        if(front==null){
            front=node;
        }else{
            Node temp=front;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
    }
    public void deQueue(){
        if(front!=null){
            front=front.next;
        }
    }
    public void printQueue(){
        Node temp=front;
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
        Queue q1=new Queue();
        q1.enQueue(100);
        q1.enQueue(200);
        q1.enQueue(300);
        q1.enQueue(400);
        q1.printQueue(); //[100, 200, 300, 400]
        System.out.println("Size of the Stack : "+q1.size());

        q1.deQueue();
        q1.printQueue(); //[200, 300, 400]
        System.out.println("Size of the Stack : "+q1.size());

        q1.clear();
        System.out.println("Size of the Stack : "+q1.size());
    }
}
*/

//Step VI From Step V
//-------------------
/*
class Node{
    int data;
    Node next;
    Node(int data){this.data=data;}
}
class Queue{
    Node front;
    public void enQueue(int data){
        Node node=new Node(data);
        if(front==null){
            front=node;
        }else{
            Node temp=front;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
    }
    public void deQueue(){
        if(front!=null){
            front=front.next;
        }
    }
    public void printQueue(){
        Node temp=front;
        System.out.print("[");
        while(temp!=null){
            System.out.print(temp.data+", ");
            temp=temp.next;
        }
        System.out.println("\b\b]");
    }
    public int size(){
        int count=0;
        Node temp=front;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public void clear(){
        front=null;

    }
}
class Demo{
    public static void main(String args[]){
        Queue q1=new Queue();
        q1.enQueue(100);
        q1.enQueue(200);
        q1.enQueue(300);
        q1.enQueue(400);
        q1.printQueue(); //[100, 200, 300, 400]
        System.out.println("Size of the Stack : "+q1.size());

        q1.deQueue();
        q1.printQueue(); //[200, 300, 400]
        System.out.println("Size of the Stack : "+q1.size());

        q1.clear();
        System.out.println("Size of the Stack : "+q1.size());
    }
}
*/
