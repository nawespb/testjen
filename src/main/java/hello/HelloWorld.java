package hello;

public class HelloWorld {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        ByeClass bye = new ByeClass();
        System.out.println(greeter.sayHello());
        System.out.println(bye.sayBye());
    }
}
