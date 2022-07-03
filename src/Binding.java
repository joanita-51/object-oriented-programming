//Has the concept of method overriding
public class Binding {
    public int m(int k){
        return k*2;
    }
}
class Y extends Binding{
    public int m(int a){
        return a+10;
    }
}

class Z extends Y {
    public static void main (String[] args){
        Z obj = new Z();
        int value = obj.m(20);
//        double v  = obj.m(2.5); An error because no definition of m takes a double
        System.out.println("Value is "+value);
    }
}