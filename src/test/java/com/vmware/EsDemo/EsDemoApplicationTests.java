package com.vmware.EsDemo;

import com.vmware.EsDemo.dao.LogDao;
import com.vmware.EsDemo.model.SysLog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.List;



@RunWith(SpringRunner.class)
@SpringBootTest
public class EsDemoApplicationTests {

	@Autowired
	private LogDao logDao;

	@Test
	public void contextLoads() {
        try {
            List<SysLog> logByTraceId = logDao.getLogByTraceId(1000);
            System.out.println(logByTraceId);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
