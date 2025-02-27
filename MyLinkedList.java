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




    public void removeEndNode(){
        if(nodeCount == 0){
            System.out.println("linked list has no data");
            return ;

        }
       if(nodeCount == 1){
           previousNode=null;
           currentNode =null;
       }else{
           linkNode n =firstNode;
           while(n.next.next.next != null){
               n=n.next;
           }
           previousNode =n ;
           currentNode =n.next;
           n.next.next=null;
       }
       nodeCount--;
    }


    public void removeStartNode(){
        if(nodeCount == 0){
            System.out.println("linked list has no data");
            return ;
        }
        if(nodeCount == 1){
            previousNode=null;
            currentNode =null;
        }else{
            firstNode=firstNode.next;
        }
        nodeCount--;

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

        list.removeEndNode();
        System.out.println("after deleting the last element ");
        list.display();
        list.removeEndNode();
        list.removeEndNode();
        System.out.println("after removing the last element ");
        list.display();
        list.removeStartNode();
        list.removeStartNode();
        System.out.println("after first the last element ");
        list.display();
        list.removeStartNode();
        list.removeStartNode();
        System.out.println("after first the last element ");

    }
}

