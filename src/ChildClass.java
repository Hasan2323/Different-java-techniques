public class ChildClass extends ParentClass {

    public ChildClass(String name, String address, String profession) {
        super(name, address, profession);
    }

    ChildClass() {
        super();
    }

    public void job() {
        System.out.println("Child: " + this.getProfession());
    }

}
