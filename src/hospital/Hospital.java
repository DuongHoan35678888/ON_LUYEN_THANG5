package hospital;

public class Hospital {
    private String CEO;
    private Department department;
    public Hospital(){
    }

    public Hospital(String CEO, Department department) {
        this.CEO = CEO;
        this.department = department;
    }

    public String getCEO() {
        return CEO;
    }

    public void setCEO(String CEO) {
        this.CEO = CEO;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
