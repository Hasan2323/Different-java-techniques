/*
 * apni jodi kono object/constructor create howar aage,
 * kono kichu korte chan tahole ai blocks gula use korte paren.
 * */

public class InstanceAndStaticBlock {
    private String testName;

    // this block will be executed Second. (before constructor)
    // After creating object, This block will be executed before constructor.
    // After creating an object, If you want to do something before calling the Constructor,
    // you can use this instance/object label block.
    {
        System.out.println("Hello from instance label block");
    }

    // this block will be executed First.
    // This block will be executed when this class will be run in JVM
    static {
        System.out.println("Hello from Static block");
    }

    public InstanceAndStaticBlock() {
        System.out.println("Hello from constructor");
    }

}

class TestingBlock {
    public static void main(String[] args) {
        InstanceAndStaticBlock obj = new InstanceAndStaticBlock();
    }
}
