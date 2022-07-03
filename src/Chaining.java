public class Chaining {
    Chaining(){
        System.out.println("This is C");
    }
}
class Constructor extends Chaining{
    Constructor(){
/*        super();
          this(10);

 */
        System.out.println("This is B");
    }
    Constructor(int x){
        System.out.println("This is B of " +x);
    }
}

class A extends Constructor{
    public A(){
//        super(10);
        System.out.println("This is A");
    }
    public static void main (String[] args){
        A a = new A();

    }
}
//Output:
//This is C
//This is B
//This is A
