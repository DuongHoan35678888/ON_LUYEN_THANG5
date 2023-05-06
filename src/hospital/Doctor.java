package hospital;

public class Doctor extends Employees {
    private String specialized;
    public Doctor(){
    }

    public Doctor(String specialized) {
        this.specialized = specialized;
    }

    public Doctor(String name, int age, Gender gender, String address, String roles, String specialized) {
        super(name, age, gender, address, roles);
        this.specialized = specialized;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }
}
