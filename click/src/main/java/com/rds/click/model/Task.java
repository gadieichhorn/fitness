/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rds.click.model;

/**
 *
 * @author Gadi
 */
public class Task {

    private String callID;
    private String number;
    private String district;

    public Task() {
    }
    
    public void setCallID(String callID) {
        this.callID = callID;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
