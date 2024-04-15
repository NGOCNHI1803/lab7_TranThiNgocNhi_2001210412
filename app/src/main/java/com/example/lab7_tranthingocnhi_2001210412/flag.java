package com.example.lab7_tranthingocnhi_2001210412;

public class flag {
    int idAnh;
    String tenQG;

    public flag() {
    }

    public flag(int idAnh, String tenQG) {
        this.idAnh = idAnh;
        this.tenQG = tenQG;
    }

    public int getIdAnh() {
        return idAnh;
    }

    public void setIdAnh(int idAnh) {
        this.idAnh = idAnh;
    }

    public String getTenQG() {
        return tenQG;
    }

    public void setTenQG(String tenQG) {
        this.tenQG = tenQG;
    }
}
