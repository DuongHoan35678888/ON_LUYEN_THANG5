package hospital;

public class Hopital {
    private Department department;
    private Manager manager;

    public Hopital(){
    }

    public Hopital(Department department, Manager manager) {
        this.department = department;
        this.manager = manager;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
