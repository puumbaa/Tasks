package task_01;

public class ParentChildTest {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent child = new Child();
        child.saySomething();

//        task_01.Child p = (task_01.Child) child;
//        p.bar();
        Parent[] parents = {parent,child};
        for (Parent p: parents){
            p.saySomething();
        }
    }
}
