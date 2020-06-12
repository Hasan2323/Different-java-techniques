// TODO: Every class by default extends Object class.
// TODO: So Object class is a "default parent" of any class.
// TODO: you don't need to write "extends Object".

public class InstanceOfWhichClassAndSuperMethod /* extends Object */ {
    private int day;
    private String month;

    public InstanceOfWhichClassAndSuperMethod(int day, String month) {
        this.day   = day;
        this.month = month;
    }

    public InstanceOfWhichClassAndSuperMethod() {
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    // TODO: InstanceOfWhichClass is shown here

    public void doAction(Object obj) {
        System.out.println("obj is a object of \"" + obj.getClass() + "\"");

        if (obj instanceof Hasan) {
            Hasan objHasan = (Hasan) obj;
            System.out.println("Birthday of " + obj.getClass().getName() + ": " + objHasan.getDay() + "," + objHasan.getMonth());
        }

        if (obj instanceof Mishu) {
            Mishu objMishu = (Mishu) obj;
            System.out.println("Birthday of " + obj.getClass().getName() + ": " + objMishu.getDay() + "," + objMishu.getMonth());
        }


    }

}

class Hasan extends InstanceOfWhichClassAndSuperMethod {

    public Hasan(int day, String month) {
        super(day, month);
    }
}

class Mishu extends InstanceOfWhichClassAndSuperMethod {

    public Mishu(int day, String month) {
        super(day, month);
    }
}

class MainCls {
    public static void main(String[] args) {
        InstanceOfWhichClassAndSuperMethod obj = new InstanceOfWhichClassAndSuperMethod();

        Hasan hasan = new Hasan(15, "October");
        obj.doAction(hasan);

        Mishu mishu = new Mishu(12, "November");
        //obj.doAction(mishu);
    }

}
