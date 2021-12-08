package task_01;

public class Child extends Parent{

    public void bar(){}


    @Override
    void saySomething() {
        System.out.println("I'm a child");
    }
}
