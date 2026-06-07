
interface MyInterface {
    public void myMethod1();
    public void myMethod2();
}

interface Animal{
    public void eat();
    public void sleep();
}

class rat implements Animal {
    public void eat() {
        System.out.println("Rat is eating");
    }

    public void sleep() {
        System.out.println("Rat is sleeping");
    }
}

class human implements Animal{
    @Override 
    public void eat(){
        System.out.println("Human is eating");
    }
    
    public void sleep() {
        System.out.println("Human is sleeping");
    }
}
public class Main implements MyInterface, Animal {
    public void myMethod1() {
        System.out.println("This is myMethod1");
    }

    public void myMethod2() {
        System.out.println("This is myMethod2");
    }
    public static void main(String[] args) {
        MyInterface obj = new Main();
        obj.myMethod1();
        obj.myMethod2();
    }
}