
interface A{
    void  printname();
    default void name1(){
        System.out.println("name is yash ");
    }
}


interface B{
    void  printname();
    default void name(){
        System.out.println("name is yash ");
    }
}
abstract class d {
    abstract void age();
}

class C extends d implements A,B{


    public void age(){
        System.out.println("21 ");
    }
    @java.lang.Override
    public void printname() {
        System.out.println("yash only");
    }

    public void fullName(){
        System.out.println("yash vardhan singh");
    }
}


class z extends C {
    public void  course(){
        System.out.println("Qa");
    }
}
public class Experiment {
    public static void main(String[] args) {
     C c=new C();
     c.printname();
     c.name();
     c.name1();


//     A f= new C() ;
//     f.name1();
//     f.printname();
//     f.fullname();
//     f.name();
//
//     d e = new C();
//     e.age();
//     e.printname() ;
//     e.fullName();
//
//     C myZ= new z();
//      myZ.name1();
//      myZ.course();




    }
}


