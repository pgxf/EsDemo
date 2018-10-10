package com.vmware.EsDemo.model;


/**
 * Author:fxing@vmware.com
 * Date:2018/8/21
 * Time:14:28
 **/
//@Document(indexName = "vmware",type = "grm")
public class SingleModel {

    private String branch_name;
    private String created;
    private Long drop_id;
    private String drop_name;
    private Long file_id;
    private String file_path;
    private String global_id;
    private String key;
    private String language_code;
    private String modified;
    private String parser_type;
    private String product_name;
    private String project_manager;
    private Long release_id;
    private String release_name;
    private Object release_profile;
    private String source_string;
    private String translation;

    public SingleModel(String branch_name, String created, Long drop_id, String drop_name, Long file_id, String file_path, String global_id, String key, String language_code, String modified, String parser_type, String product_name, String project_manager, Long release_id, String release_name, Object release_profile, String source_string, String translation) {
        this.branch_name = branch_name;
        this.created = created;
        this.drop_id = drop_id;
        this.drop_name = drop_name;
        this.file_id = file_id;
        this.file_path = file_path;
        this.global_id = global_id;
        this.key = key;
        this.language_code = language_code;
        this.modified = modified;
        this.parser_type = parser_type;
        this.product_name = product_name;
        this.project_manager = project_manager;
        this.release_id = release_id;
        this.release_name = release_name;
        this.release_profile = release_profile;
        this.source_string = source_string;
        this.translation = translation;
    }

    public SingleModel() {
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Long getDrop_id() {
        return drop_id;
    }

    public void setDrop_id(Long drop_id) {
        this.drop_id = drop_id;
    }

    public String getDrop_name() {
        return drop_name;
    }

    public void setDrop_name(String drop_name) {
        this.drop_name = drop_name;
    }

    public Long getFile_id() {
        return file_id;
    }

    public void setFile_id(Long file_id) {
        this.file_id = file_id;
    }

    public String getFile_path() {
        return file_path;
    }

    public void setFile_path(String file_path) {
        this.file_path = file_path;
    }

    public String getGlobal_id() {
        return global_id;
    }

    public void setGlobal_id(String global_id) {
        this.global_id = global_id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLanguage_code() {
        return language_code;
    }

    public void setLanguage_code(String language_code) {
        this.language_code = language_code;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getParser_type() {
        return parser_type;
    }

    public void setParser_type(String parser_type) {
        this.parser_type = parser_type;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProject_manager() {
        return project_manager;
    }

    public void setProject_manager(String project_manager) {
        this.project_manager = project_manager;
    }

    public Long getRelease_id() {
        return release_id;
    }

    public void setRelease_id(Long release_id) {
        this.release_id = release_id;
    }

    public String getRelease_name() {
        return release_name;
    }

    public void setRelease_name(String release_name) {
        this.release_name = release_name;
    }

    public Object getRelease_profile() {
        return release_profile;
    }

    public void setRelease_profile(Object release_profile) {
        this.release_profile = release_profile;
    }

    public String getSource_string() {
        return source_string;
    }

    public void setSource_string(String source_string) {
        this.source_string = source_string;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return "SingleModel{" +
                "branch_name='" + branch_name + '\'' +
                ", created='" + created + '\'' +
                ", drop_id=" + drop_id +
                ", drop_name='" + drop_name + '\'' +
                ", file_id=" + file_id +
                ", file_path='" + file_path + '\'' +
                ", global_id='" + global_id + '\'' +
                ", key='" + key + '\'' +
                ", language_code='" + language_code + '\'' +
                ", modified='" + modified + '\'' +
                ", parser_type='" + parser_type + '\'' +
                ", product_name='" + product_name + '\'' +
                ", project_manager='" + project_manager + '\'' +
                ", release_id=" + release_id +
                ", release_name='" + release_name + '\'' +
                ", release_profile=" + release_profile +
                ", source_string='" + source_string + '\'' +
                ", translation='" + translation + '\'' +
                '}';
    }
}
