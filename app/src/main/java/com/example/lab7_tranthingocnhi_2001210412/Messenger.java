package com.example.lab7_tranthingocnhi_2001210412;

import java.util.ArrayList;

public class Messenger {
    private int img;
    private String name, content;
    private String time;

    public Messenger(int img, String name, String content, String time) {
        this.img = img;
        this.name = name;
        this.content = content;
        this.time = time;
    }

    public Messenger() {
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    //Hàm khởi tạo danh sách Music
    public static ArrayList<Messenger> initArrayList(int[] lstImg, String[]lstTen, String[]noiDung, String[] time){
        ArrayList<Messenger> arrlst = new ArrayList<>();
        for(int i = 0; i < lstImg.length; i++){
            Messenger mes = new Messenger(lstImg[i], lstTen[i], noiDung[i], time[i]);
            arrlst.add(mes);
        }
        return arrlst;
    }
}
