
interface P{
  String p ="ppppppp";
  String methodP();
}

interface Q extends  P{
    String q="QQQQQQQQ";
    String methodQ();

}


class R implements Q{

    public String methodQ(){
        System.out.println("method of class Q");
        return  q+p;
    }
    public String methodP(){
        System.out.println("method of class P");
        return q+p;
    }

    public int method(int i){
        return  i += i*i;
    }
}


interface  x{
    char c='A';

    char methodx();
}

class y implements x
{

    {
        System.out.println(c);
    }


    public char methodx(){
       char c = this.c;
       return  ++c;
    }
}


interface  one{
    String s="FINAL";
    String methodONE();
}
interface Two{
    String methodONE();
}

abstract class Three {
    String s ="NOT FINAL";
    public abstract String methodONE();


}

class Four extends Three implements  one,Two{

    @Override
    public String methodONE() {
        String s =super.s + one.s;
        return s;
    }
}



interface A1{
   String A="AAA";
   String methodA();
}
interface  B1{
    String B="BBb";
    String methodB();

}
class C1 implements  A1,B1{

    @Override
    public String methodA() {
        return A+B;
    }

    @Override
    public String methodB() {
        return B+A;
    }
}

class D extends C1 implements  A1,B1{
    String D="DDD";
    public String methodA(){
        return D+methodB();
    }

}



public class Experiment2 {


    public static void main(String[] args) {
//        R r = new R();
//        System.out.println(r.methodQ());
//        System.out.println( r.methodP());
//        int i = 2;
//        System.out.println(r.method(i));

//
//        y y1= new y();
//        System.out.println(y1.methodx());
//        System.out.println(y.c);
//        System.out.println(x.c);


//        Four four = new Four();
//        System.out.println(four.methodONE());
//        one ONE =four;
//        System.out.println(one.s);
//     //   System.out.println(four);


        C1 c=new C1();
        System.out.println(c.methodA());
        System.out.println(c.methodB());
        c =new D();
        System.out.println(c.methodA());
        System.out.println(c.methodB());
        }
}





