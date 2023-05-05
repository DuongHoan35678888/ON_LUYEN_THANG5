package hospital;

public class Department {
    private Leader leader;
    private String nameDepartment;
    private String codeDepartment;

    public Department(){
    }

    public Department(Staff staff, Leader leader, String nameDepartment, String codeDepartment) {
        this.leader = leader;
        this.nameDepartment = nameDepartment;
        this.codeDepartment = codeDepartment;
    }

    public Leader getLeader() {
        return leader;
    }

    public void setLeader(Leader leader) {
        this.leader = leader;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public String getCodeDepartment() {
        return codeDepartment;
    }

    public void setCodeDepartment(String codeDepartment) {
        this.codeDepartment = codeDepartment;
    }
}
