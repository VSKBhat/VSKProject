package com.ihub.model;
// Generated 30 Apr, 2019 1:31:00 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Encrypteddata generated by hbm2java
 */
public class Encrypteddata  implements java.io.Serializable {


     private Integer serialno;
     private String message;
     private String reciever;
     private Date time;
     private String keyVal;

    public Encrypteddata() {
    }

	
    public Encrypteddata(Date time, String keyVal) {
        this.time = time;
        this.keyVal = keyVal;
    }
    public Encrypteddata(String message, String reciever, Date time, String keyVal) {
       this.message = message;
       this.reciever = reciever;
       this.time = time;
       this.keyVal = keyVal;
    }
   
    public Integer getSerialno() {
        return this.serialno;
    }
    
    public void setSerialno(Integer serialno) {
        this.serialno = serialno;
    }
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    public String getReciever() {
        return this.reciever;
    }
    
    public void setReciever(String reciever) {
        this.reciever = reciever;
    }
    public Date getTime() {
        return this.time;
    }
    
    public void setTime(Date time) {
        this.time = time;
    }
    public String getKeyVal() {
        return this.keyVal;
    }
    
    public void setKeyVal(String keyVal) {
        this.keyVal = keyVal;
    }




}

