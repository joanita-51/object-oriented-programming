import java.awt.*;

public class String {
    //immutable objects
    java.lang.String s = new java.lang.String("This is BSSE");
    System.out.println(s);

    //Mutable objects
    import java.swt.Point;
    Point p = new Point(7,9);
    System.out.println(p);
    p.setLocation(2,5);
    System.out.println(p);
    //final class - no more subclasses hence strong mutability
    //private  class - the subclasses will not have a chance of accessing the members to nutate
    // methods final - weak mutability - subclass can override the method
    // mutation through behaviour avoided  by final class, final method,properties private, avoid setters in the super class
    //privacy leakage - in the subclass there is a setter to access the contents in the super class
    //limit on mutability:
    //importance of immutability : Security purposes, avoid data loss
    //Interning:Is where we create string objects , and at run time strings with the same character sequesnce will have one reference and all the variables will be pointing to that reference
    String s1 = new String("this is a BSSE3");// a new object is created and a new address is obtained
    String s2 = "this is BSSE3";//same memory address is created with s3 but not the same reference as s1
    String s3 = "this is BSSE3"// its interned
    // equals method compares the contents i.e. the same character sequence

}
