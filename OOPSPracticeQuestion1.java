
class Simple{
    static int  num=100;
    Simple(){
        System.out.println("hello this is a message ");
    }

    public void hello(){
        System.out.println("hii , i am yash");
    }
}

public class OOPSPracticeQuestion1 {
    public static void main(String[] args) {
        Simple obj= new Simple();
        obj.hello();


        Simple obj2;
        obj2 = obj ;
        obj2.hello();
        
        Simple obj3 = null;
        System.out.println(obj3.num );



    }
}
