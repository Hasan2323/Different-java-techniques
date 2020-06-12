public class ParentClass {

    private String name;
    private String address;
    private String profession;

    public ParentClass(String name, String address, String profession) {
        this.name = name;
        this.address = address;
        this.profession = profession;
    }

    public ParentClass() {

    }

    public void job() {
        System.out.println("Parent" + this.getProfession());
    }


    public String getProfession() {
        return profession;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}
