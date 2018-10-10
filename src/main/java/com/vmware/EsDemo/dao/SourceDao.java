package com.vmware.EsDemo.dao;

import com.vmware.EsDemo.model.SingleModel;
import org.elasticsearch.action.search.SearchResponse;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Author:fxing@vmware.com
 * Date:2018/8/22
 * Time:15:31
 **/
public interface SourceDao {

    SearchResponse getExactSource(String key, String value) throws IOException;

    SearchResponse getFuzzySource(String key, String value) throws IOException;

}
