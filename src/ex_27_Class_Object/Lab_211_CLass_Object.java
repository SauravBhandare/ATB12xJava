package ex_27_Class_Object;

public class Lab_211_CLass_Object extends Object {

        // Class object is the root of the class
        //Every Object is the superset of the class


    @Override
    public String toString() {
        System.out.println("This is coming from the Object class");
        return null;
    }

    @Override
    public int hashCode() {
        System.out.println("This is coming from the Object class");
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("This is coming from the Object class");
        return true;
    }

    
}
