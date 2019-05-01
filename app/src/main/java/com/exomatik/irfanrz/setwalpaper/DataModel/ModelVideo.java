package com.exomatik.irfanrz.setwalpaper.DataModel;

/**
 * Created by IrfanRZ on 05/11/2018.
 */

public class ModelVideo {
    String str_path,str_thumb;
    boolean boolean_selected;

//    public ModelVideo(String str_path, String str_thumb, boolean boolean_selected) {
//        this.str_path = str_path;
//        this.str_thumb = str_thumb;
//        this.boolean_selected = boolean_selected;
//    }

    public String getStr_path() {
        return str_path;
    }

    public void setStr_path(String str_path) {
        this.str_path = str_path;
    }

    public String getStr_thumb() {
        return str_thumb;
    }

    public void setStr_thumb(String str_thumb) {
        this.str_thumb = str_thumb;
    }

    public boolean isBoolean_selected() {
        return boolean_selected;
    }

    public void setBoolean_selected(boolean boolean_selected) {
        this.boolean_selected = boolean_selected;
    }
}
