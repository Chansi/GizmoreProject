/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author chanura
 */
public class Request {
    String product;
    String ownername;
    String owneremail;
    String duration;
    String requstorname;
    String requstoremail;
    String requestState;
    String location;
    String description;
    String payment_method;

    public Request(String product, String ownername, String owneremail, String duration, String requstorname, String requstoremail, String requestState, String location, String description, String payment_method) {
        this.product = product;
        this.ownername = ownername;
        this.owneremail = owneremail;
        this.duration = duration;
        this.requstorname = requstorname;
        this.requstoremail = requstoremail;
        this.requestState = requestState;
        this.location = location;
        this.description = description;
        this.payment_method = payment_method;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public String getOwneremail() {
        return owneremail;
    }

    public void setOwneremail(String owneremail) {
        this.owneremail = owneremail;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getRequstorname() {
        return requstorname;
    }

    public void setRequstorname(String requstorname) {
        this.requstorname = requstorname;
    }

    public String getRequstoremail() {
        return requstoremail;
    }

    public void setRequstoremail(String requstoremail) {
        this.requstoremail = requstoremail;
    }

    public String getRequestState() {
        return requestState;
    }

    public void setRequestState(String requestState) {
        this.requestState = requestState;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }
    
    
}
