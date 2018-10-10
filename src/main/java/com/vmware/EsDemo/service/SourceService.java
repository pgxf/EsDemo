package com.vmware.EsDemo.service;

import com.vmware.EsDemo.model.ScoreData;
import com.vmware.EsDemo.model.SingleModel;

import java.util.List;

/**
 * Author:fxing@vmware.com
 * Date:2018/8/22
 * Time:15:30
 **/
public interface SourceService {

    List<ScoreData> getExactSource(String key, String value);

    List<ScoreData> getFuzzySource(String key, String value);

}
