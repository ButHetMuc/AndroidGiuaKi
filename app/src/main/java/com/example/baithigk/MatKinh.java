package com.example.baithigk;

public class MatKinh {
    private  String tenMk;
    private double giaMk;
    private String forMk;
    private int flagImage;

    public MatKinh(String tenMk, double giaMk, String forMk, int flagImage) {
        this.tenMk = tenMk;
        this.giaMk = giaMk;
        this.forMk = forMk;
        this.flagImage = flagImage;
    }

    public String getTenMk() {
        return tenMk;
    }

    public void setTenMk(String tenMk) {
        this.tenMk = tenMk;
    }

    public double getGiaMk() {
        return giaMk;
    }

    public void setGiaMk(double giaMk) {
        this.giaMk = giaMk;
    }

    public String getForMk() {
        return forMk;
    }

    public void setForMk(String forMk) {
        this.forMk = forMk;
    }

    public int getFlagImage() {
        return flagImage;
    }

    public void setFlagImage(int flagImage) {
        this.flagImage = flagImage;
    }
}
