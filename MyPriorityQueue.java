class MyNode{
    int  value;
    int  priority;
    MyNode(int value,int  priority){
      this.value = value;
      this.priority = priority;
    }

}


class PriorityQueue{
    int size ;
    int front ;
    int rear;
    int count;
    MyNode[] data;

    int maxIndex = 0 ;

    PriorityQueue(int size ){
        this.size = size;
        front = 0 ;
        rear = -1;
        count = 0 ;
        data = new MyNode[size] ;
    }

    public void enQueue(int val , int priority){
        if(count < size){
            if(rear == size-1){
                rear = -1;
            }
            data[++rear]=new MyNode(val,priority);
            count++;
        }else{
            System.out.println("Queue is full ");
        }
    }

    public void deQueue(){
        if (count > 0) {
            swapFrontAndPriority();
            System.out.println("deQueued : value :" + data[front].value + " priority :" + data[front].priority);
            data[front] = null;
            front = (front + 1) % size;  //moving the front pointer ;
            count--; // Reduce the count
        } else {
            System.out.println("Queue is empty ");
        }
    }


    public void swapFrontAndPriority(){
        int maxp =0;
        if(count > 0) {
           for(int i =0 ; i < size ; i++){
               if(data[i]!= null && data[i].priority > maxp){
                   maxp  = data[i].priority;
                   maxIndex =i ;
               }
           }
           MyNode temp = data[front];
           data[front] = data[maxIndex];
           data[maxIndex] = temp;
       }else{
           System.out.println("Queue is Empty");
       }
    }

    public void display(){
        System.out.print("priority Queue :   [");
        for(MyNode i : data){
            if(i != null) {
                System.out.print("["+i.value+","+i.priority+"]");
            }
        }
        System.out.print("]  \n");

    }



}








public class MyPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue q= new PriorityQueue(4);

        q.enQueue(4,1);
        q.enQueue(3,2);
        q.enQueue(2,3);
        q.enQueue(5,5);
        q.display();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.display();

    }
}
