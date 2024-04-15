package com.example.lab7_tranthingocnhi_2001210412;

public class Home {
    private String imgIcon;
    private String Name;

    public Home(String imgIcon, String name) {
        this.imgIcon = imgIcon;
        Name = name;
    }

    public String getImgIcon() {
        return imgIcon;
    }

    public void setImgIcon(String imgIcon) {
        this.imgIcon = imgIcon;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
