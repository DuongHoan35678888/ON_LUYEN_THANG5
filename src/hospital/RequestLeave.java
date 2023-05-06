package hospital;

import java.util.Date;

public class RequestLeave extends Request{
    private TypeRequestLeave typeRequestLeave;
    public RequestLeave(){
    }

    public RequestLeave(TypeRequestLeave typeRequestLeave) {
        this.typeRequestLeave = typeRequestLeave;
    }

    public RequestLeave(Date dateRequest, boolean status, TypeRequestLeave typeRequestLeave) {
        super(dateRequest, status);
        this.typeRequestLeave = typeRequestLeave;
    }

    public TypeRequestLeave getTypeRequestLeave() {
        return typeRequestLeave;
    }

    public void setTypeRequestLeave(TypeRequestLeave typeRequestLeave) {
        this.typeRequestLeave = typeRequestLeave;
    }
}
