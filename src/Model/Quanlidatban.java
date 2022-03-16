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
public class Quanlidatban implements Serializable{
    
    private KhachHang khachhang;
    private Nhahang nhahang;
    private String ngaythang;

  
    public Object[] toObject(){
        return new Object[]{
            khachhang.getMa(),nhahang.getMaBan(),ngaythang
        };
    }
    
    public Quanlidatban() {
    }

    public Quanlidatban(KhachHang khachhang, Nhahang nhahang, String ngaythang) {
        this.khachhang = khachhang;
        this.nhahang = nhahang;
        this.ngaythang = ngaythang;
    }

    public KhachHang getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(KhachHang khachhang) {
        this.khachhang = khachhang;
    }

    public Nhahang getNhahang() {
        return nhahang;
    }

    public void setNhahang(Nhahang nhahang) {
        this.nhahang = nhahang;
    }

    public String getNgaythang() {
        return ngaythang;
    }

    public void setNgaythang(String ngaythang) {
        this.ngaythang = ngaythang;
    }
    
    
}
