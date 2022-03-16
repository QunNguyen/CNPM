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
public class Nhahang implements Serializable{
    
    private String maBan;
    private String ten;
    private int soLuongKhach;
    private String mota;

     public Object[] toObject() {
        return new Object[]{
            maBan,ten,soLuongKhach,mota
        };
    }
    
    public Nhahang() {
    }

    public Nhahang(String maBan, String ten, int soLuongKhach, String mota) {
        this.maBan = maBan;
        this.ten = ten;
        this.soLuongKhach = soLuongKhach;
        this.mota = mota;
    }

    public String getMaBan() {
        return maBan;
    }

    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoLuongKhach() {
        return soLuongKhach;
    }

    public void setSoLuongKhach(int soLuongKhach) {
        this.soLuongKhach = soLuongKhach;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
  
    

}
