package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by sun on 2018/5/25.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceNaem;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceNaem() {
        return provinceNaem;
    }

    public void setProvinceNaem(String provinceNaem) {
        this.provinceNaem = provinceNaem;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
