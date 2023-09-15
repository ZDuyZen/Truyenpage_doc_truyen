package com.example.truyen_page.Object;

import org.json.JSONException;
import org.json.JSONObject;

public class HomeDoctruyen {
    private String tenTruyen;
    private String tenTacGia;
    private String tenChuong;
    private String anhBiaTruyen;

    public HomeDoctruyen() {
    }

    public HomeDoctruyen(JSONObject o) throws JSONException {
        tenTruyen = o.getString("tenTruyen");
        tenTacGia = o.getString("tenTacGia");
        tenChuong = o.getString("tenChuong");
        anhBiaTruyen = o.getString("anhBiaTruyen");
    }

    public HomeDoctruyen(String tenTruyen, String tenTacGia, String tenChuong, String anhBiaTruyen) {
        this.tenTruyen = tenTruyen;
        this.tenTacGia = tenTacGia;
        this.tenChuong = tenChuong;
        this.anhBiaTruyen = anhBiaTruyen;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getTenTruyen() {
        return tenTruyen;
    }

    public void setTenTruyen(String tenTruyen) {
        this.tenTruyen = tenTruyen;
    }

    public String getTenChuong() {
        return tenChuong;
    }

    public void setTenChuong(String tenChuong) {
        this.tenChuong = tenChuong;
    }

    public String getAnhBiaTruyen() {
        return anhBiaTruyen;
    }

    public void setAnhBiaTruyen(String anhBiaTruyen) {
        this.anhBiaTruyen = anhBiaTruyen;
    }
}
