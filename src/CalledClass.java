public class CalledClass {

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass("Hasan", "Ctg", "SE");
        ParentClass parentClass = new ChildClass("Saimon", "Dhk", "SD");
        ChildClass childClass1;
        childClass1 = (ChildClass) parentClass;
        childClass1.job();

        Check check = new Check();
        check.connect(childClass);
        //System.out.println(re);
    }

}
