/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Image;
import java.sql.Blob;
import javax.servlet.http.Part;

/**
 *
 * @author chanura
 */
public class Ad {
    String productcatogory;
    String pname;
    String price;
    String status;
    String owner_name;
    String owner_email;
    String location;
    String image;
    Part part;

    public Ad(String productcatogory, String pname, String price, String status, String image) {
        this.productcatogory = productcatogory;
        this.pname = pname;
        this.price = price;
        this.status = status;
        this.image = image;
    }

    public Ad(String productcatogory, String pname, String price, String status, String owner_name, String owner_email, String image) {
        this.productcatogory = productcatogory;
        this.pname = pname;
        this.price = price;
        this.status = status;
        this.owner_name = owner_name;
        this.owner_email = owner_email;
        this.image = image;
    }

    public Ad(String productcatogory, String pname, String price, String status, String owner_name, String owner_email, String location, String image) {
        this.productcatogory = productcatogory;
        this.pname = pname;
        this.price = price;
        this.status = status;
        this.owner_name = owner_name;
        this.owner_email = owner_email;
        this.location = location;
        this.image = image;
    }

    
    
    
    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getOwner_email() {
        return owner_email;
    }

    public void setOwner_email(String owner_email) {
        this.owner_email = owner_email;
    }
    
    
    
    public Ad(String productcatogory, String pname, String price, String status, Part p){
        
        this.productcatogory = productcatogory;
        this.pname = pname;
        this.price = price;
        this.status = status;
        this.part = p;
    
    }

 

    public String getProductcatogory() {
        return productcatogory;
    }

    public void setProductcatogory(String productcatogory) {
        this.productcatogory = productcatogory;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
      
    }
    
     public Part getpart() {
        return part;
    }
        public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
