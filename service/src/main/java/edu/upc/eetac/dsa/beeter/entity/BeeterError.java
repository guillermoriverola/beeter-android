package edu.upc.eetac.dsa.beeter.entity;

/**
 * Created by Guillermo on 02/03/2016.
 */
public class BeeterError {
    private int status;
    private String reason;

    public BeeterError(int status, String reason) {
        this.status = status;
        this.reason = reason;
    }

    public BeeterError() {
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
