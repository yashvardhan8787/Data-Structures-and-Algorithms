
class Question3{
    int num =100;

    public void sayHello(){
        System.out.println("hello");
    }
    Question3 get(){
       return  this;
    }

}// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class queue{
    int size;
    int count ;
    int front ,rear;
    int[] data;


    queue(int size){
        this.size=size;
        count =0;
        front = 0;
        rear =-1;
        data= new int[size];
    }
    void enqueue(int val){
        if(count > size-1){
            System.out.println("Queue is full");
        }else{
            rear= (rear + 1) % size;
            data[rear]= val;
            count++;
        }
    }


    void dequeue(){
        if(count < 0){
            System.out.println("Queue is full");
        }else{
            data[front]= 0;
            front= (front + 1) % size;
            count--;
        }
    }

    void display(){
        System.out.println(
                "front :"+front+" rear"+rear
        );
        for(int i = front; i != (rear+1)%size ; i = (i+1)%size ){
            System.out.println(data[i]);
        }
    }
}







public class OOPSPracticeQuestion3 {
    public static void main(String[] args) {
        queue q=new queue(4);
        q.enqueue(5);
        q.enqueue(4);
        q.enqueue(3);
        q.enqueue(2);
        q.enqueue(1);
        q.dequeue();    q.dequeue();    q.dequeue();  q.enqueue(6); q.enqueue(7);
        q.display();
    }
}
