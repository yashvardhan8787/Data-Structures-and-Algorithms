
class circularQueue {
    int size ;
    int front ;
    int count ;
    int rear;
    int[] data;
    circularQueue(int size){
        this.size = size;
        front = 0;
        rear = -1;
        count = 0;
        data= new int[size];
    }

    public void enQueue(int val){
        if(count < size ){

//            // Update rear in a circular fashion
//            rear = (rear + 1) % size;
//            data[rear] = val;
//            count++;
//            System.out.println("Enqueued: " + val);
            if(rear  == size -1) {
                rear=0;
                data[rear]=val;
            }else{
                data[++rear]=val;
            }
            System.out.println("Enqueued value :"+val);
            count++;
        }else{
            System.out.println("Queue is empty");
        }
    }



    public void deQueue(){
       if(count > 0){

//           int removedValue = data[front];
//           // Optionally, clear the slot
//           data[front] = 0;
//           // Update front in a circular fashion
//           front = (front + 1) % size;
//           count--;
           if(front == size){
               front  = 0 ;
           }
           System.out.println("Dequeued: " + data[front]);
           data[front]=0;
           front++;
           count--;
       }else{
           System.out.println("Queue is empty ");
       }
    }

   public void display(){
        System.out.print(" Data  in Queue ");
        for(int i: data){
            System.out.print(i+"  ");
        }
       System.out.println("\n");
   }
}






public class MyCircularQueue {
    public static void main(String[] args) {
        circularQueue q = new circularQueue(4);
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        q.display();

        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();


    }
}
