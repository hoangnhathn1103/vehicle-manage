/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Account;
import Model.Vehicle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author DELL
 */
public class SqlController {
    private static Connection conn;
    
    public SqlController() {
        conn = SqlContext.getConn();
    }
    
        public boolean addVehicle(Vehicle s){
        
        String sql = "insert into VEHICLE(VehID,VehName,Maker,VehType,Year,Price,Color,SeatNum,EngineType,Watt,Tonn) values(?,?,?,?,?,?,?,?,?,?,?)";
        try{
            if(conn!=null)
                System.out.println("Ket noi thanh cong!");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s.getVehicleId());
            ps.setString(2,s.getVehicleName());
            ps.setString(3,s.getMaker());
            ps.setString(4,s.getVehType());
            ps.setString(5,s.getYear());
            ps.setString(6,s.getUnitPrice());
            ps.setString(7,s.getColor());
            ps.setString(8,s.getSeatNum());
            ps.setString(9,s.getEngineType());
            ps.setString(10,s.getWattage());
            ps.setString(11,s.getTonnage());
            
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
        }
        return false;
    }
    
    public boolean updateVehicle(Vehicle s) throws Exception{
        String sql = "update VEHICLE set VehName = ?,Maker = ?,Year = ?,Price = ?,Color = ?,SeatNum = ?,EngineType = ?,Watt = ?,Tonn = ? where VehId=?";
        try{
            if(conn!=null)
                System.out.println("Ket noi thanh cong!");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(10,s.getVehicleId());
            ps.setString(1,s.getVehicleName());
            ps.setString(2,s.getMaker());
            ps.setString(3,s.getYear());
            ps.setString(4,s.getUnitPrice());
            ps.setString(5,s.getColor());
            ps.setString(6,s.getSeatNum());
            ps.setString(7,s.getEngineType());
            ps.setString(8,s.getWattage());
            ps.setString(9,s.getTonnage());
            
            return ps.executeUpdate() > 0;
        } catch(SQLException e){
        }
        return false;
    }
    
    public boolean deleteVehicle(String VehID){
        String sql="delete from VEHICLE where VehID=?";
        try{
            if(conn!=null)
                System.out.println("Ket noi thanh cong!");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, VehID);
            return ps.executeUpdate()>0;
        } catch(SQLException e){
        }
        return false;
    }
    
    public ArrayList<Vehicle>showXeMay(){
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        String sql = "select * from VEHICLE where VehType = 'xe máy'";
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Vehicle st = new Vehicle(rs.getString("VehID"),
                        rs.getString("VehName"),rs.getString("Maker"),rs.getString("VehType"),
                        rs.getString("Year"),rs.getString("Price"),rs.getString("Color"),
                        rs.getString("SeatNum"),rs.getString("EngineType"),rs.getString("Watt"),rs.getString("Tonn"));
                vehicleList.add(st);
            }
        } catch(SQLException e){
        }
        return vehicleList;
    }
    
    public ArrayList<Vehicle>showOTo(){
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        String sql = "select * from VEHICLE where VehType = 'ô tô'";
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Vehicle st = new Vehicle(rs.getString("VehID"),
                        rs.getString("VehName"),rs.getString("Maker"),rs.getString("VehType"),
                        rs.getString("Year"),rs.getString("Price"),rs.getString("Color"),
                        rs.getString("SeatNum"),rs.getString("EngineType"),rs.getString("Watt"),rs.getString("Tonn"));
                vehicleList.add(st);
            }
        } catch(SQLException e){
        }
        return vehicleList;
    }
    
    public ArrayList<Vehicle>showXeTai(){
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        String sql = "select * from VEHICLE where VehType = 'xe tai'";
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Vehicle st = new Vehicle(rs.getString("VehID"),
                        rs.getString("VehName"),rs.getString("Maker"),rs.getString("VehType"),
                        rs.getString("Year"),rs.getString("Price"),rs.getString("Color"),
                        rs.getString("SeatNum"),rs.getString("EngineType"),rs.getString("Watt"),rs.getString("Tonn"));
                vehicleList.add(st);
            }
        } catch(SQLException e){
        }
        return vehicleList;
    }
    
    public Vehicle findById(String vehicleId){
        String sql = "select * from VEHICLE where VehID = ?";
        try{
            if(conn!=null)
                System.out.println("Ket noi thanh cong!");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, vehicleId);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                Vehicle v = new Vehicle();
                v.setVehicleId(rs.getString("VehID"));
                v.setVehicleName(rs.getString("VehName"));
                v.setMaker(rs.getString("Maker"));
                v.setVehType(rs.getString("VehType"));
                v.setYear(rs.getString("Year"));
                v.setUnitPrice(rs.getString("Price"));
                v.setColor(rs.getString("Color"));
                v.setSeatNum(rs.getString("SeatNum"));
                v.setEngineType(rs.getString("EngineType"));
                v.setWattage(rs.getString("Watt"));
                v.setTonnage(rs.getString("Tonn"));
                return v;
            }
        } catch (SQLException ex) {
        }
        return null;
    }
    
    public Vehicle findXeMayById(String vehicleId){
        String sql = "select * from VEHICLE where VehID = ? and VehType='xe máy'";
        try{
            if(conn!=null) {
                System.out.println("Ket noi thanh cong!");
            }
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, vehicleId);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                Vehicle v = new Vehicle();
                v.setVehicleId(rs.getString("VehID"));
                v.setVehicleName(rs.getString("VehName"));
                v.setMaker(rs.getString("Maker"));
                v.setVehType(rs.getString("VehType"));
                v.setYear(rs.getString("Year"));
                v.setUnitPrice(rs.getString("Price"));
                v.setColor(rs.getString("Color"));
                v.setSeatNum(rs.getString("SeatNum"));
                v.setEngineType(rs.getString("EngineType"));
                v.setWattage(rs.getString("Watt"));
                v.setTonnage(rs.getString("Tonn"));
                return v;
            }
        } catch (SQLException ex) {
        }
        return null;
    }
    
    public Vehicle findOToById(String vehicleId){
        String sql = "select * from VEHICLE where VehID = ? and VehType='ô tô'";
        try{
            if(conn!=null)
                System.out.println("Ket noi thanh cong!");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, vehicleId);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                Vehicle v = new Vehicle();
                v.setVehicleId(rs.getString("VehID"));
                v.setVehicleName(rs.getString("VehName"));
                v.setMaker(rs.getString("Maker"));
                v.setVehType(rs.getString("VehType"));
                v.setYear(rs.getString("Year"));
                v.setUnitPrice(rs.getString("Price"));
                v.setColor(rs.getString("Color"));
                v.setSeatNum(rs.getString("SeatNum"));
                v.setEngineType(rs.getString("EngineType"));
                v.setWattage(rs.getString("Watt"));
                v.setTonnage(rs.getString("Tonn"));
                return v;
            }
        } catch (SQLException ex) {
        }
        return null;
    }
    
    public Vehicle findXeTaiById(String vehicleId){
        String sql = "select * from VEHICLE where VehID = ? and VehType='xe tai'";
        try{
            if(conn!=null)
                System.out.println("Ket noi thanh cong!");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, vehicleId);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                Vehicle v = new Vehicle();
                v.setVehicleId(rs.getString("VehID"));
                v.setVehicleName(rs.getString("VehName"));
                v.setMaker(rs.getString("Maker"));
                v.setVehType(rs.getString("VehType"));
                v.setYear(rs.getString("Year"));
                v.setUnitPrice(rs.getString("Price"));
                v.setColor(rs.getString("Color"));
                v.setSeatNum(rs.getString("SeatNum"));
                v.setEngineType(rs.getString("EngineType"));
                v.setWattage(rs.getString("Watt"));
                v.setTonnage(rs.getString("Tonn"));
                return v;
            }
        } catch (SQLException ex) {
        }
        return null;
    }
    
    public ArrayList<Vehicle>findAll(){
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        String sql = "select * from vehicle";
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Vehicle st = new Vehicle(rs.getString("VehID"),
                        rs.getString("VehName"),rs.getString("Maker"),rs.getString("VehType"),
                        rs.getString("Year"),rs.getString("Price"),rs.getString("Color"),
                        rs.getString("SeatNum"),rs.getString("EngineType"),rs.getString("Watt"),rs.getString("Tonn"));
                vehicleList.add(st);
            }
        } catch(SQLException e){
        }
        return vehicleList;
    }
    
    
    public boolean addAccount(Account ac){
        
        String sql = "insert into ACCOUNT(Username, Password, Name, Email, Phonenumber, Rol) values(?,?,?,?,?,?)";
        try{
            if(conn!=null)
                System.out.println("Ket noi thanh cong!");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,ac.getUserName());
            ps.setString(2,ac.getPassword());
            ps.setString(3,ac.getName());
            ps.setString(4,ac.getEmail());
            ps.setString(5,ac.getPhoneNumber());
            ps.setInt(6,'1');
            
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
        }
        return false;
    }
    
    public boolean updateAccount(Account ac) throws Exception{
        String sql = "update ACCOUNT set Password=?, Name=?, Email=?, Phonenumber=? where Username=?";
        try{
            if(conn!=null)
                System.out.println("Ket noi thanh cong!");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(5,ac.getUserName());
            ps.setString(1,ac.getPassword());
            ps.setString(2,ac.getName());
            ps.setString(3,ac.getEmail());
            ps.setString(4,ac.getPhoneNumber());
            
            return ps.executeUpdate() > 0;
        } catch(SQLException e){
        }
        return false;
    }
    
    public boolean deleteAccount(String Username){
        String sql="delete from ACCOUNT where Username=?";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            if(conn!=null)
                System.out.println("Ket noi thanh cong!");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, Username);
            return ps.executeUpdate()>0;
        } catch(ClassNotFoundException | SQLException e){
        }
        return false;
    }
    
    public Account findTaiKhoanById(String Username){
        String sql = "select * from ACCOUNT where Username = ?";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            if(conn!=null)
                System.out.println("Ket noi thanh cong!");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, Username);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                Account ac = new Account();
                ac.setUserName(rs.getString("UserName"));
                ac.setPassword(rs.getString("Password"));
                ac.setName(rs.getString("Name"));
                ac.setEmail(rs.getString("Email"));
                ac.setPhoneNumber(rs.getString("Phonenumber"));
                ac.setRol(rs.getInt("Rol"));
                return ac;
            }
        } catch (ClassNotFoundException | SQLException ex) {
        }
        return null;
    }
    
    public ArrayList<Account>showTaiKhoan(){
        ArrayList<Account> accountList = new ArrayList<>();
        String sql = "select * from ACCOUNT where Rol = 1";
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Account ac = new Account(rs.getString("Username"),
                        rs.getString("Password"),rs.getString("Name"),rs.getString("Email"),
                        rs.getString("Phonenumber"),rs.getInt("Rol"));
                accountList.add(ac);
            }
        } catch(SQLException e){
        }
        return accountList;
    }
    
}
