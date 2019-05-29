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
public class User {
    String email;
    String password;
    String firstname;
    String lastname;
    String Utype;
    String contactnumber;

    public User(String email, String password, String firstname, String lastname, String Utype, String contactnumber) {
        this.email = email;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.Utype = Utype;
        this.contactnumber = contactnumber;
    }
    
     public User(String email,String password) {
        this.email= email;
        this.password= password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUtype() {
        return Utype;
    }

    public void setUtype(String Utype) {
        this.Utype = Utype;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }
   
    
    
}
