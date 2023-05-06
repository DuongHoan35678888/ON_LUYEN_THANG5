package hospital;

import java.util.Date;

public class Request {
    private Date dateRequest;
    private boolean status;
    public Request(){
    }

    public Request(Date dateRequest, boolean status) {
        this.dateRequest = dateRequest;
        this.status = status;
    }

    public Date getDateRequest() {
        return dateRequest;
    }

    public void setDateRequest(Date dateRequest) {
        this.dateRequest = dateRequest;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
