package com.vmware.EsDemo.dao;

import com.vmware.EsDemo.model.SingleModel;
import com.vmware.EsDemo.model.SysLog;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.unit.Fuzziness;
import org.elasticsearch.common.unit.TimeValue;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.beanutils.BeanUtils;

/**
 * Author:fxing@vmware.com
 * Date:2018/8/21
 * Time:15:39
 **/
@Repository
public class LogDao {
    private final String INDEX = "vmware";
    private final String TYPE = "grm";

    @Autowired
    private RestHighLevelClient restHighLevelClient;


    /**
     * 根据traceId查询LOG记录
     * @param traceId
     * @return
     * @throws IOException
     */
    public List<SysLog> getLogByTraceId(int traceId) throws IOException {
        List<SysLog> result = new ArrayList();

        QueryBuilder matchQueryBuilder = QueryBuilders.matchQuery("source_string", "comman")
                .fuzziness(Fuzziness.AUTO)
                .prefixLength(0)
                .maxExpansions(10);

        // term query, 查询trace字段
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.size(1000);
//        searchSourceBuilder.query(QueryBuilders.termQuery("source_string", "comma"));
        searchSourceBuilder.query(matchQueryBuilder);
//        sourceBuilder.timeout(new TimeValue(60, TimeUnit.SECONDS));

        // 指定索引和类型
        SearchRequest searchRequest = new SearchRequest(INDEX);
        searchRequest.types(TYPE);
        searchRequest.source(searchSourceBuilder);

        // 执行查询
        SearchResponse searchResponse = restHighLevelClient.search(searchRequest);
        SearchHits hits = searchResponse.getHits();

        // 查询结果
        SearchHit[] searchHits = hits.getHits();
        System.out.println(searchHits.length);
        for (SearchHit hit : searchHits) {
            Map<String, Object> sourceAsMap = hit.getSourceAsMap();
//            System.out.println(sourceAsMap);
//            Map release_profile = (Map) sourceAsMap.get("release_profile");
//            System.out.println(release_profile);
//            System.out.println();
            SingleModel sm = new SingleModel();
            try {
                BeanUtils.populate(sm,sourceAsMap);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            System.out.println(sm);
            String timestamp = (String) sourceAsMap.get("@timestamp");
            String trace = (String) sourceAsMap.get("sourcelocale");
            String service = (String) sourceAsMap.get("workflow");
            String level = (String) sourceAsMap.get("severity");
            Object stackTrace = sourceAsMap.get("stack_trace");
            String stack_trace = null;
            if (stackTrace != null) {
                stack_trace = (String) stackTrace;
            }

            SysLog sysLog = new SysLog(trace, stack_trace, timestamp, level, service);
            result.add(sysLog);
        }
        return result;
    }

}
