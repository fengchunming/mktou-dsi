package com.mktou.dsi.module.bill;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.mktou.dsi.module.bill.entity.Bill;
import com.mktou.dsi.module.bill.service.BillService;

@RunWith(SpringJUnit4ClassRunner.class)
// 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-context.xml" })
public class BillServiceTest {
	private static Logger logger = Logger.getLogger(BillServiceTest.class);
	private ApplicationContext ac = null;
	@Resource
	private BillService billService = null;

	@Before
	public void before() {
		ac = new ClassPathXmlApplicationContext("spring-context.xml");
		billService = (BillService) ac.getBean("billService");
	}

	@Test
	public void test1() {
		Bill bill = billService.getBillById(1);
		System.out.println(bill.getName());
		logger.info("值：" + bill.getName());
		logger.info(JSON.toJSONString(bill));
	}
}