/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

public class Vehicle implements Serializable {
    private static final long serialVersionUID= 1L;
    private String vehicleId;
    private String vehicleName;
    private String maker;
    private String vehType;
    private String unitPrice;
    private String year;
    private String color;
    private String seatNum;
    private String engineType;
    private String wattage;
    private String tonnage;
    
    public String getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }
    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getMaker() {
        return maker;
    }
    public void setMaker(String maker) {
        this.maker = maker;
    }
    
    public String getVehType() {
        return vehType;
    }
    public void setVehType(String vehType) {
        this.vehType = vehType;
    }

    public String getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
    }

    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getSeatNum() {
        return seatNum;
    }
    public void setSeatNum(String seatNum) {
        this.seatNum = seatNum;
    }

    public String getEngineType() {
        return engineType;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getWattage() {
        return wattage;
    }
    public void setWattage(String wattage) {
        this.wattage = wattage;
    }

    public String getTonnage() {
        return tonnage;
    }
    public void setTonnage(String tonnage) {
        this.tonnage = tonnage;
    }

    public Vehicle(String vehicleId, String vehicleName,
    String maker, String vehType, String year,String unitPrice, String color, String seatNum, 
    String engineType, String wattage, String tonnage) {
        super();
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.maker = maker;
        this.vehType = vehType;
        this.unitPrice = unitPrice;
        this.year = year;
        this.color = color;
        this.seatNum = seatNum;
        this.engineType = engineType;
        this.wattage = wattage;
        this.tonnage = tonnage;
    }

    public Vehicle() {
        super();
    }
}

