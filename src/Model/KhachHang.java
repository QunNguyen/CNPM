/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author default
 */
public class KhachHang implements Serializable{
    
    private String ma;
    private String ten;
    private String sodt;
    private String diachi;
    
    public Object[] toObject(){
        return new Object[]{
            ma,ten,sodt,diachi
        };
    }

    public KhachHang() {
    }

    public KhachHang(String ma, String ten, String sodt, String diachi) {
        this.ma = ma;
        this.ten = ten;
        this.sodt = sodt;
        this.diachi = diachi;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
     
    
}
