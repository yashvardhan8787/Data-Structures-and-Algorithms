class linkNode {
    linkNode next;
    int  data;
    linkNode(int data){
       this.data = data ;
    }
}

class LinkedList {
    int nodeCount;
    linkNode firstNode;
    linkNode currentNode;
    linkNode previousNode;

    LinkedList() {
        currentNode = null;
        previousNode = null;
        nodeCount =0;
    }

    public void addNode(int data ){
        linkNode node = new linkNode(data);
        if(nodeCount == 0){
            currentNode = node;
          previousNode = node;
          firstNode = currentNode;
        }else{
            currentNode.next = node;
          previousNode = currentNode;
          currentNode = node;
        }
        nodeCount++;
    }

    public void addNode(int data , int location ){
        linkNode node = new linkNode(data);
        if(location == 0 ){
             node.next = firstNode ;
             firstNode = node;
             nodeCount++;
        }else{
            if(location > 0 && location <= nodeCount) {
                linkNode currNode = firstNode;
                linkNode previousNode = firstNode;
                int count = 0;
                while(count < location){
                    previousNode = currNode;
                    currNode = currNode.next;
                    count++;
                }
                previousNode.next = node;
                node.next =currNode ;
                nodeCount++;
            }else{
               addNode(data);
            }
        }
    }


    public void display(){
        linkNode currNode = firstNode;
        int count = 0;
        while(currNode != null){
            System.out.println(count+" : "+currNode.data);
            currNode = currNode.next;
            count++;
        }
    }

    public void display(int node){
        linkNode currNode = firstNode;
        int count = 0;
        while(count < node){
            currNode = currNode.next;
            count++;
        }
        System.out.println(count+" : "+currNode.data);
    }
}

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList list  =  new LinkedList();
        list.addNode(10);
        list.addNode(12);
        list.addNode(14);
        list.addNode(16,2
        );
        list.addNode(18,0
        );
        list.addNode(20,6
        );
        list.display();

    }

}
