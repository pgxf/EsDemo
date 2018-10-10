package com.vmware.EsDemo.service.implement;

import com.vmware.EsDemo.dao.SourceDao;
import com.vmware.EsDemo.model.ScoreData;
import com.vmware.EsDemo.model.SingleModel;
import com.vmware.EsDemo.service.SourceService;
import org.apache.commons.beanutils.BeanUtils;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.aggregations.Aggregation;
import org.elasticsearch.search.aggregations.Aggregations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Author:fxing@vmware.com
 * Date:2018/8/22
 * Time:15:31
 **/
@Service
public class SourceServiceImpl implements SourceService{

    @Autowired
    private SourceDao sourceDao;

    @Override
    public List<ScoreData> getExactSource(String key, String value) {
        List<ScoreData> list = new ArrayList<>();
        SearchResponse searchResponse = null;
        try {
            searchResponse = sourceDao.getExactSource(key, value);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SearchHits hits = searchResponse.getHits();
        SearchHit[] searchHits = hits.getHits();
        for (SearchHit hit : searchHits) {
            Map<String, Object> sourceAsMap = hit.getSourceAsMap();
//            System.out.println(hit.getScore());
            float score = hit.getScore();
            SingleModel sm = new SingleModel();
            try {
                BeanUtils.populate(sm,sourceAsMap);
                list.add(new ScoreData(sm,score+""));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        return list;
    }

    @Override
    public List<ScoreData> getFuzzySource(String key, String value) {
        List<ScoreData> list = new ArrayList<>();
        SearchResponse searchResponse = null;
        try {
            searchResponse = sourceDao.getFuzzySource(key, value);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SearchHits hits = searchResponse.getHits();

        SearchHit[] searchHits = hits.getHits();
        for (SearchHit hit : searchHits) {
            Map<String,Object> sourceAsMap = hit.getSourceAsMap();
//            System.out.println(hit.getScore());
            float score = hit.getScore();
            System.out.println(hit.getId());
            SingleModel sm = new SingleModel();
            try {
                BeanUtils.populate(sm, sourceAsMap);
                list.add(new ScoreData(sm,score+""));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        return list;

    }
}
