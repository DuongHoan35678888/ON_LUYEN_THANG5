package hospital;

public class Nurse extends Employees {
    private TypeOfWork typeOfWork;
    public Nurse(){
    }

    public Nurse(TypeOfWork typeOfWork) {
        this.typeOfWork = typeOfWork;
    }

    public Nurse(String name, int age, Gender gender, String address, String roles, TypeOfWork typeOfWork) {
        super(name, age, gender, address, roles);
        this.typeOfWork = typeOfWork;
    }

    public TypeOfWork getTypeOfWork() {
        return typeOfWork;
    }

    public void setTypeOfWork(TypeOfWork typeOfWork) {
        this.typeOfWork = typeOfWork;
    }
}
