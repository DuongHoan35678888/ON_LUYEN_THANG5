package hospital;

import java.util.Date;

public class TypeRequestOvertime extends Request {
    private Date startOvertime;
    private Date endOvertime;

    public TypeRequestOvertime() {
    }

    public TypeRequestOvertime(Date startOvertime, Date endOvertime) {
        this.startOvertime = startOvertime;
        this.endOvertime = endOvertime;
    }

    public TypeRequestOvertime(Date dateRequest, boolean status, Date startOvertime, Date endOvertime) {
        super(dateRequest, status);
        this.startOvertime = startOvertime;
        this.endOvertime = endOvertime;
    }

    public Date getStartOvertime() {
        return startOvertime;
    }

    public void setStartOvertime(Date startOvertime) {
        this.startOvertime = startOvertime;
    }

    public Date getEndOvertime() {
        return endOvertime;
    }

    public void setEndOvertime(Date endOvertime) {
        this.endOvertime = endOvertime;
    }
}
