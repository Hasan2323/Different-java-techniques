package childParent;

/**
 * @Author Muhammad Saimon
 * @since Sep 9/5/20 3:35 PM
 */

class Parent {
    protected void parentMethodOne() {
        System.out.println("Parent method one");
    }

    protected void parentMethodTwo() {
        System.out.println("Parent method two");
    }

    protected void commonMethod() {
        System.out.println("Common method in parent");
    }

}

class Child extends Parent {
    protected void childMethodOne() {
        System.out.println("Child method one");
    }

    protected void childMethodTwo() {
        System.out.println("Child method two");
    }

    protected void commonMethod() {
        System.out.println("Common method in child");
    }

}

public class Priority {
    public static void main(String[] args) {

        // Child obj = new Parent(); // TODO: not possible. Parent cannot be converted to Child
        Parent obj = new Child();
        /*
        * ekhane ai "obj" diye Parent class er sob access kora jabe. Child class er gula access kora jabe na.
        * but Child class er kono method jodi Parent class er method er sathe mile jai tahole Child er class er
        * method Priority pabe.
        * Ex: Ekhane commonMethod 2 jaigai ache. but priority pabe Child class ta.
        * */
        obj.parentMethodOne();
        obj.commonMethod();
    }
}
