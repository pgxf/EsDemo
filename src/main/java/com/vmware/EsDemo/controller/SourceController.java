package com.vmware.EsDemo.controller;

import com.vmware.EsDemo.model.ScoreData;
import com.vmware.EsDemo.model.SingleModel;
import com.vmware.EsDemo.service.SourceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author:fxing@vmware.com
 * Date:2018/8/22
 * Time:15:16
 **/
@Api()
@RestController
@RequestMapping("/vmware/grm")
public class SourceController {

    @Resource
    private SourceService sourceService;

    @ApiOperation(value = "列出符合条件的产品Exact",notes = "",produces = "application/json")
    @RequestMapping(value = "/exact",method = RequestMethod.GET)
    public Object exactListProducts(@RequestParam(value = "key",required = false)String key, @RequestParam(value = "value")String exactValue){
        List<ScoreData> results = sourceService.getExactSource(key,exactValue);
        return results;
    }

    @ApiOperation(value = "列出符合条件的产品Fuzzy",notes = "",produces = "application/json")
    @RequestMapping(value = "/fuzzy",method = RequestMethod.GET)
    public Object fuzzyListProducts(@RequestParam(value = "key",required = false)String key, @RequestParam(value = "value")String fuzzyValue){
        List<ScoreData> results = sourceService.getFuzzySource(key,fuzzyValue);
        return results;
    }

}
