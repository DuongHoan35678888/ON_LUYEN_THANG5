package hospital;

public class Department {
    private String leader;
    private String nameDepartment;
    private String codeDepartment;

    public Department(){
    }

    public Department(String leader, String nameDepartment, String codeDepartment) {
        this.leader = leader;
        this.nameDepartment = nameDepartment;
        this.codeDepartment = codeDepartment;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
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
