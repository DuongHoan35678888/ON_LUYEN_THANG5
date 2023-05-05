package hospital;

public class Doctor extends Staff {
    private String specialized;
    public Doctor(){
    }

    public Doctor(String specialized) {
        this.specialized = specialized;
    }

    public Doctor(String name, int age, String sex, String address, String specialized) {
        super(name, age, sex, address);
        this.specialized = specialized;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }
}
