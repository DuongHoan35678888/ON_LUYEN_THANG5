package hospital;

public class Employees {
    private String name;
    private int age;
    private Gender gender;
    private String address;
    private String roles;

    public Employees(){
    }

    public Employees(String name, int age, Gender gender, String address, String roles) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
