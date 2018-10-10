package com.vmware.EsDemo.model;

/**
 * Author:fxing@vmware.com
 * Date:2018/8/21
 * Time:14:58
 **/
public class Mtadapters {

    private String ar_AE;
    private String cs_CZ;
    private String de_DE;
    private String en_GB;
    private String es_ES;
    private String fr_FR;
    private String ja_JP;
    private String ko_KR;
    private String pt_BR;
    private String zh_CN;
    private String zh_TW;

    public Mtadapters(String ar_AE, String cs_CZ, String de_DE, String en_GB, String es_ES, String fr_FR, String ja_JP, String ko_KR, String pt_BR, String zh_CN, String zh_TW) {
        this.ar_AE = ar_AE;
        this.cs_CZ = cs_CZ;
        this.de_DE = de_DE;
        this.en_GB = en_GB;
        this.es_ES = es_ES;
        this.fr_FR = fr_FR;
        this.ja_JP = ja_JP;
        this.ko_KR = ko_KR;
        this.pt_BR = pt_BR;
        this.zh_CN = zh_CN;
        this.zh_TW = zh_TW;
    }

    public Mtadapters() {
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

    public String getDe_DE() {
        return de_DE;
    }

    public void setDe_DE(String de_DE) {
        this.de_DE = de_DE;
    }

    public String getEn_GB() {
        return en_GB;
    }

    public void setEn_GB(String en_GB) {
        this.en_GB = en_GB;
    }

    public String getEs_ES() {
        return es_ES;
    }

    public void setEs_ES(String es_ES) {
        this.es_ES = es_ES;
    }

    public String getFr_FR() {
        return fr_FR;
    }

    public void setFr_FR(String fr_FR) {
        this.fr_FR = fr_FR;
    }

    public String getJa_JP() {
        return ja_JP;
    }

    public void setJa_JP(String ja_JP) {
        this.ja_JP = ja_JP;
    }

    public String getKo_KR() {
        return ko_KR;
    }

    public void setKo_KR(String ko_KR) {
        this.ko_KR = ko_KR;
    }

    public String getPt_BR() {
        return pt_BR;
    }

    public void setPt_BR(String pt_BR) {
        this.pt_BR = pt_BR;
    }

    public String getZh_CN() {
        return zh_CN;
    }

    public void setZh_CN(String zh_CN) {
        this.zh_CN = zh_CN;
    }

    public String getZh_TW() {
        return zh_TW;
    }

    public void setZh_TW(String zh_TW) {
        this.zh_TW = zh_TW;
    }

    @Override
    public String toString() {
        return "Mtadapters{" +
                "ar_AE='" + ar_AE + '\'' +
                ", cs_CZ='" + cs_CZ + '\'' +
                ", de_DE='" + de_DE + '\'' +
                ", en_GB='" + en_GB + '\'' +
                ", es_ES='" + es_ES + '\'' +
                ", fr_FR='" + fr_FR + '\'' +
                ", ja_JP='" + ja_JP + '\'' +
                ", ko_KR='" + ko_KR + '\'' +
                ", pt_BR='" + pt_BR + '\'' +
                ", zh_CN='" + zh_CN + '\'' +
                ", zh_TW='" + zh_TW + '\'' +
                '}';
    }
}
