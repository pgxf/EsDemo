package com.vmware.EsDemo.model;

/**
 * Author:fxing@vmware.com
 * Date:2018/8/24
 * Time:17:10
 **/
public class ScoreData {

    private SingleModel data;
    private String score;

    public ScoreData(SingleModel data, String score) {
        this.data = data;
        this.score = score;
    }

    public ScoreData() {
    }

    public SingleModel getData() {
        return data;
    }

    public void setData(SingleModel data) {
        this.data = data;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "ScoreData{" +
                "data=" + data +
                ", score='" + score + '\'' +
                '}';
    }
}
