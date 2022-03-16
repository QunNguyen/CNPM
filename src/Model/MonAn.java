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
public class MonAn implements Serializable{
    private  String maMon;
    private String ten;
    private String loai;
    private String mota;
    private int giahientai;

    public Object[] toObject(){
        return new Object[]{
          maMon,ten,loai,giahientai,mota  
        };
    }

    
    public MonAn() {
    }

    public MonAn(String maMon, String ten, String loai,  int giahientai,String mota) {
        this.maMon = maMon;
        this.ten = ten;
        this.loai = loai;
        this.mota = mota;
        this.giahientai = giahientai;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getGiahientai() {
        return giahientai;
    }

    public void setGiahientai(int giahientai) {
        this.giahientai = giahientai;
    }
    
    
}
