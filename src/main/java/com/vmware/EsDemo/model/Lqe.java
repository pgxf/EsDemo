package com.vmware.EsDemo.model;

/**
 * Author:fxing@vmware.com
 * Date:2018/8/21
 * Time:14:43
 **/
public class Lqe {

    private Object lqe_exclude_100_match;
    private Object lqe_exclude_ice_match;
    private Object lqe_fast_track;
    private String lqe_file_type;
    private Object lqe_is_mt;
    private String LqeIsMt;
    private String lqe_product_name;
    private String lqe_product_release_number;
    private Object lqe_provider;
    private String lqe_quality_level;
    private String lqe_request_by;
    private Object lqe_sampling_percentage;
    private Object lqe_translation_provider;

    public Lqe(Object lqe_exclude_100_match, Object lqe_exclude_ice_match, Object lqe_fast_track, String lqe_file_type, Object lqe_is_mt, String lqeIsMt, String lqe_product_name, String lqe_product_release_number, Object lqe_provider, String lqe_quality_level, String lqe_request_by, Object lqe_sampling_percentage, Object lqe_translation_provider) {
        this.lqe_exclude_100_match = lqe_exclude_100_match;
        this.lqe_exclude_ice_match = lqe_exclude_ice_match;
        this.lqe_fast_track = lqe_fast_track;
        this.lqe_file_type = lqe_file_type;
        this.lqe_is_mt = lqe_is_mt;
        LqeIsMt = lqeIsMt;
        this.lqe_product_name = lqe_product_name;
        this.lqe_product_release_number = lqe_product_release_number;
        this.lqe_provider = lqe_provider;
        this.lqe_quality_level = lqe_quality_level;
        this.lqe_request_by = lqe_request_by;
        this.lqe_sampling_percentage = lqe_sampling_percentage;
        this.lqe_translation_provider = lqe_translation_provider;
    }

    public Lqe() {
    }

    public Object getLqe_exclude_100_match() {
        return lqe_exclude_100_match;
    }

    public void setLqe_exclude_100_match(Object lqe_exclude_100_match) {
        this.lqe_exclude_100_match = lqe_exclude_100_match;
    }

    public Object getLqe_exclude_ice_match() {
        return lqe_exclude_ice_match;
    }

    public void setLqe_exclude_ice_match(Object lqe_exclude_ice_match) {
        this.lqe_exclude_ice_match = lqe_exclude_ice_match;
    }

    public Object getLqe_fast_track() {
        return lqe_fast_track;
    }

    public void setLqe_fast_track(Object lqe_fast_track) {
        this.lqe_fast_track = lqe_fast_track;
    }

    public String getLqe_file_type() {
        return lqe_file_type;
    }

    public void setLqe_file_type(String lqe_file_type) {
        this.lqe_file_type = lqe_file_type;
    }

    public Object getLqe_is_mt() {
        return lqe_is_mt;
    }

    public void setLqe_is_mt(Object lqe_is_mt) {
        this.lqe_is_mt = lqe_is_mt;
    }

    public String getLqeIsMt() {
        return LqeIsMt;
    }

    public void setLqeIsMt(String lqeIsMt) {
        LqeIsMt = lqeIsMt;
    }

    public String getLqe_product_name() {
        return lqe_product_name;
    }

    public void setLqe_product_name(String lqe_product_name) {
        this.lqe_product_name = lqe_product_name;
    }

    public String getLqe_product_release_number() {
        return lqe_product_release_number;
    }

    public void setLqe_product_release_number(String lqe_product_release_number) {
        this.lqe_product_release_number = lqe_product_release_number;
    }

    public Object getLqe_provider() {
        return lqe_provider;
    }

    public void setLqe_provider(Object lqe_provider) {
        this.lqe_provider = lqe_provider;
    }

    public String getLqe_quality_level() {
        return lqe_quality_level;
    }

    public void setLqe_quality_level(String lqe_quality_level) {
        this.lqe_quality_level = lqe_quality_level;
    }

    public String getLqe_request_by() {
        return lqe_request_by;
    }

    public void setLqe_request_by(String lqe_request_by) {
        this.lqe_request_by = lqe_request_by;
    }

    public Object getLqe_sampling_percentage() {
        return lqe_sampling_percentage;
    }

    public void setLqe_sampling_percentage(Object lqe_sampling_percentage) {
        this.lqe_sampling_percentage = lqe_sampling_percentage;
    }

    public Object getLqe_translation_provider() {
        return lqe_translation_provider;
    }

    public void setLqe_translation_provider(Object lqe_translation_provider) {
        this.lqe_translation_provider = lqe_translation_provider;
    }

    @Override
    public String toString() {
        return "Lqe{" +
                "lqe_exclude_100_match=" + lqe_exclude_100_match +
                ", lqe_exclude_ice_match=" + lqe_exclude_ice_match +
                ", lqe_fast_track=" + lqe_fast_track +
                ", lqe_file_type='" + lqe_file_type + '\'' +
                ", lqe_is_mt=" + lqe_is_mt +
                ", LqeIsMt='" + LqeIsMt + '\'' +
                ", lqe_product_name='" + lqe_product_name + '\'' +
                ", lqe_product_release_number='" + lqe_product_release_number + '\'' +
                ", lqe_provider=" + lqe_provider +
                ", lqe_quality_level='" + lqe_quality_level + '\'' +
                ", lqe_request_by='" + lqe_request_by + '\'' +
                ", lqe_sampling_percentage=" + lqe_sampling_percentage +
                ", lqe_translation_provider=" + lqe_translation_provider +
                '}';
    }


}
