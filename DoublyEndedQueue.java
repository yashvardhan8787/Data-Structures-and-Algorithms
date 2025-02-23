
class DeQueue{
    int size ,count , rear,front;
    int data[];
    DeQueue(int size){
     this.size = size;
     this.count =0 ;
     this.rear=-1;
     this.front = 0 ;
     data = new int[size];
    }

    public void rear_push(int val){
        if(count > size-1){
            System.out.println("Queue is full");
        }else{
            rear = (rear +1 )%size;
            data[rear] =val;
            count++;
        }
    }

    public void front_pop(){
        if(count < 0){
            System.out.println("Queue is empty");
        }else{
            data[front]= 0;
            front =(front + 1)%size;
            count--;
        }
    }
    public void front_push(int val){
        if(count > size-1){
            System.out.println("Queue is full");
        }else{
            front = ((rear + front)-1)%size;
            data[front] =val;
            count++;
        }

    }
    public void rear_pop(){
        if(count < 0){
            System.out.println("Queue is empty");
        }else{
            data[rear]= 0;
            if(rear == 0){
                rear = size -1;
            }else{
                rear--;
            }
            count--;
        }
    }

    public void display(){
        System.out.print("data   :");
        for(int i : data){
            System.out.print(i +" ");
        }
        System.out.println("\n");
    }
}

public class DoublyEndedQueue {
    public static void main(String[] args) {
        DeQueue q = new DeQueue(5);
        q.rear_push(5);
        q.rear_push(4);
        q.rear_push(3);


        q.display();
        q.front_pop();
        q.front_pop();
        q.front_pop();


        q.rear_push(5);
        q.rear_push(4);
        q.rear_push(3);


        q.display();

        q.front_push(8);
        q.front_push(9);
        q.front_push(6);
        q.display();

        q.rear_pop();
        q.display();
        q.rear_pop();
        q.rear_pop();
        q.rear_pop();
        q.rear_pop();
        q.rear_pop();
        q.rear_pop();
        q.display();
        q.rear_push(5);
        q.rear_push(4);
        q.rear_push(3);
        q.display();






    }
}
