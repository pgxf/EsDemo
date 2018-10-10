package com.vmware.EsDemo.dao.implement;

import com.vmware.EsDemo.dao.SourceDao;
import com.vmware.EsDemo.model.SingleModel;
import org.apache.commons.beanutils.BeanUtils;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.unit.Fuzziness;
import org.elasticsearch.index.query.FuzzyQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Author:fxing@vmware.com
 * Date:2018/8/22
 * Time:15:31
 **/
@Repository
public class SourceDaoImpl implements SourceDao{

    private final String INDEX = "vmware";
    private final String TYPE = "grm";

    @Autowired
    private RestHighLevelClient restHighLevelClient;

    @Override
    public SearchResponse getExactSource(String key, String value) throws IOException {

        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
        sourceBuilder.size(10000);
        sourceBuilder.query(QueryBuilders.termQuery(key, value));

        SearchRequest searchRequest = new SearchRequest(INDEX);
        searchRequest.types(TYPE);
        searchRequest.source(sourceBuilder);

        SearchResponse searchResponse = restHighLevelClient.search(searchRequest);

        return searchResponse;
    }

    @Override
    public SearchResponse getFuzzySource(String key, String value) throws IOException {

        QueryBuilder matchQueryBuilder = QueryBuilders.matchQuery(key, value)
                .fuzziness(Fuzziness.AUTO)
                .prefixLength(0)
                .maxExpansions(3);

        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
        sourceBuilder.size(10000);

        sourceBuilder.query(matchQueryBuilder);

        SearchRequest searchRequest = new SearchRequest(INDEX);
        searchRequest.types(TYPE);

        searchRequest.source(sourceBuilder);

        SearchResponse searchResponse = restHighLevelClient.search(searchRequest);

        return searchResponse;

    }
}
