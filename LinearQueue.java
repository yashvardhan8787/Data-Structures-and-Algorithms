class LQueue{
    int size;
    int rear;
    int front;
    int count;
    int[] data;

    LQueue(int size){
        this.size=size;
        this.front=0 ;
        this.rear= -1;
        this.count= 0;
        data= new int[size];
    }

    public void enQueue(int val){
     if(rear < size-1){
         System.out.println("enQueued :"+val);
         data[++rear] = val;
         count++;
     }else{
         System.out.println("Queue is full");
     }
    }

    public void deQueue(){
        if(count > 0){
            if(front != rear){
                System.out.println("Dequeued :"+data[front]);
                data[front++]=0;
                count--;
            }else{
                System.out.println("Dequeued :"+data[front]);
                data[front++]=0;
                count--;
                front=0;
                rear=-1;
            }
        }else{
            System.out.println("queue is empty");
        }

    }


    public void display(){
        System.out.print("data : ");
        for(int i : data){
            System.out.print(i+" ");
        }
        System.out.println("\n");
    }
}




public class LinearQueue {
    public static void main(String[] args) {
        LQueue q=new LQueue(4);
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(3);
        q.enQueue(4);
        q.display();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.display();
        q.enQueue(1);
        q.enQueue(2);
        q.display();
        q.deQueue();
        q.deQueue();
        q.enQueue(3);
        q.enQueue(4);
        q.display();

    }
}
