package com.vmware.EsDemo.model;

/**
 * Author:fxing@vmware.com
 * Date:2018/8/21
 * Time:14:52
 **/
public class LqeProvider {

    private String ar_AE;
    private String cs_CZ;
    private String es_ES;
    private String ja_JP;
    private String zh_CN;

    public LqeProvider(String ar_AE, String cs_CZ, String es_ES, String ja_JP, String zh_CN) {
        this.ar_AE = ar_AE;
        this.cs_CZ = cs_CZ;
        this.es_ES = es_ES;
        this.ja_JP = ja_JP;
        this.zh_CN = zh_CN;
    }

    public LqeProvider() {

    }

    public String getAr_AE() {
        return ar_AE;
    }

    public void setAr_AE(String ar_AE) {
        this.ar_AE = ar_AE;
    }

    public String getCs_CZ() {
        return cs_CZ;
    }

    public void setCs_CZ(String cs_CZ) {
        this.cs_CZ = cs_CZ;
    }

    public String getEs_ES() {
        return es_ES;
    }

    public void setEs_ES(String es_ES) {
        this.es_ES = es_ES;
    }

    public String getJa_JP() {
        return ja_JP;
    }

    public void setJa_JP(String ja_JP) {
        this.ja_JP = ja_JP;
    }

    public String getZh_CN() {
        return zh_CN;
    }

    public void setZh_CN(String zh_CN) {
        this.zh_CN = zh_CN;
    }

    @Override
    public String toString() {
        return "LqeProvider{" +
                "ar_AE='" + ar_AE + '\'' +
                ", cs_CZ='" + cs_CZ + '\'' +
                ", es_ES='" + es_ES + '\'' +
                ", ja_JP='" + ja_JP + '\'' +
                ", zh_CN='" + zh_CN + '\'' +
                '}';
    }

}
