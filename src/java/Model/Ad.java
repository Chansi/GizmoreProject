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
    Image image;
    Part part;

    public Ad(String productcatogory, String pname, String price, String status, Image image) {
        this.productcatogory = productcatogory;
        this.pname = pname;
        this.price = price;
        this.status = status;
        this.image = image;
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

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
      
    }
    
     public Part getpart() {
        return part;
    }
    
}
