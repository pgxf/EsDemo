package com.vmware.EsDemo.model;

/**
 * Author:fxing@vmware.com
 * Date:2018/8/21
 * Time:14:37
 **/
public class ReleaseProfile {

    private String costmodel;
    private String description;
    private String generatetime;
    private Long id;
    private Object lqe;
    private Object mtadapters;
    private String name;
    private Long releaseid;
    private Object reviewers;
    private String sourcelocale;
    private String targetlocales;
    private Object translators;
    private String workflow;
    private String workgroup;

    public ReleaseProfile(String costmodel, String description, String generatetime, Long id, Object lqe, Object mtadapters, String name, Long releaseid, Object reviewers, String sourcelocale, String targetlocales, Object translators, String workflow, String workgroup) {
        this.costmodel = costmodel;
        this.description = description;
        this.generatetime = generatetime;
        this.id = id;
        this.lqe = lqe;
        this.mtadapters = mtadapters;
        this.name = name;
        this.releaseid = releaseid;
        this.reviewers = reviewers;
        this.sourcelocale = sourcelocale;
        this.targetlocales = targetlocales;
        this.translators = translators;
        this.workflow = workflow;
        this.workgroup = workgroup;
    }

    public ReleaseProfile() {
    }

    public String getCostmodel() {
        return costmodel;
    }

    public void setCostmodel(String costmodel) {
        this.costmodel = costmodel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGeneratetime() {
        return generatetime;
    }

    public void setGeneratetime(String generatetime) {
        this.generatetime = generatetime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Object getLqe() {
        return lqe;
    }

    public void setLqe(Object lqe) {
        this.lqe = lqe;
    }

    public Object getMtadapters() {
        return mtadapters;
    }

    public void setMtadapters(Object mtadapters) {
        this.mtadapters = mtadapters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getReleaseid() {
        return releaseid;
    }

    public void setReleaseid(Long releaseid) {
        this.releaseid = releaseid;
    }

    public Object getReviewers() {
        return reviewers;
    }

    public void setReviewers(Object reviewers) {
        this.reviewers = reviewers;
    }

    public String getSourcelocale() {
        return sourcelocale;
    }

    public void setSourcelocale(String sourcelocale) {
        this.sourcelocale = sourcelocale;
    }

    public String getTargetlocales() {
        return targetlocales;
    }

    public void setTargetlocales(String targetlocales) {
        this.targetlocales = targetlocales;
    }

    public Object getTranslators() {
        return translators;
    }

    public void setTranslators(Object translators) {
        this.translators = translators;
    }

    public String getWorkflow() {
        return workflow;
    }

    public void setWorkflow(String workflow) {
        this.workflow = workflow;
    }

    public String getWorkgroup() {
        return workgroup;
    }

    public void setWorkgroup(String workgroup) {
        this.workgroup = workgroup;
    }

    @Override
    public String toString() {
        return "ReleaseProfile{" +
                "costmodel='" + costmodel + '\'' +
                ", description='" + description + '\'' +
                ", generatetime='" + generatetime + '\'' +
                ", id=" + id +
                ", lqe=" + lqe +
                ", mtadapters=" + mtadapters +
                ", name='" + name + '\'' +
                ", releaseid=" + releaseid +
                ", reviewers=" + reviewers +
                ", sourcelocale='" + sourcelocale + '\'' +
                ", targetlocales='" + targetlocales + '\'' +
                ", translators=" + translators +
                ", workflow='" + workflow + '\'' +
                ", workgroup='" + workgroup + '\'' +
                '}';
    }
}
