package com.exomatik.irfanrz.setwalpaper.DataModel;

/**
 * Created by IrfanRZ on 03/11/2018.
 */

public class ModelWarna {
    String warna;
    int id;
    String code;

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ModelWarna(String warna, int id, String code) {
        this.warna = warna;
        this.id = id;
        this.code = code;

    }
}
