package com.vmware.EsDemo.model;

/**
 * Author:fxing@vmware.com
 * Date:2018/8/21
 * Time:15:50
 **/
public class SysLog {

    private String trace;
    private String stack_trace;
    private String timestamp;
    private String level;
    private String service;

    public SysLog(String trace, String stack_trace, String timestamp, String level, String service) {
        this.trace = trace;
        this.stack_trace = stack_trace;
        this.timestamp = timestamp;
        this.level = level;
        this.service = service;
    }

    public SysLog() {
    }

    public String getTrace() {
        return trace;
    }

    public void setTrace(String trace) {
        this.trace = trace;
    }

    public String getStack_trace() {
        return stack_trace;
    }

    public void setStack_trace(String stack_trace) {
        this.stack_trace = stack_trace;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "SysLog{" +
                "trace='" + trace + '\'' +
                ", stack_trace='" + stack_trace + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", level='" + level + '\'' +
                ", service='" + service + '\'' +
                '}';
    }
}
