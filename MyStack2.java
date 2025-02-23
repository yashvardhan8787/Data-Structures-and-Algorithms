class Stack2{
    //    Here are the top 7 applications of the stack in data structure:
//    Expression Evaluation and Conversion
//    Backtracking
//    Function Call
//    Parentheses Checking
//    String Reversal
//    Syntax Parsing
//    Memory Management
    int top ;
    int stack[];
    int capacity;
    public  Stack2(int Size ){
        top = -1 ;
        stack= new int[Size];
        capacity = Size ;
    }

    public void push(int val){
        if(top  == capacity - 1){
            System.out.println("stack is full");
        }else{
            stack[++top] = val ;
            System.out.println("value pushed in to stack :"+val);
        }
    }

    public void display(){
        for(int i= 0 ; i <= top ; i++){
            System.out.println(stack[i]);
        }
    }


    public int pop(){
        if(top !=  -1){
            return stack[top--];
        }else{
            System.out.println("Stack is Empty ");
            return 0;
        }
    }


    public int peek(){
        if(top !=  -1){
            System.out.println(stack[top]+ " is on Top");
            return stack[top];
        }else{
            return 0;
        }
    }


}

public class MyStack2 {
    public static void main(String[] args) {
        Stack2 st = new Stack2(4);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);


        st.display();
        st.peek();
        st.pop();
        st.pop();
        st.pop();

        st.display();

        st.pop();
        st.pop();
    }
}
