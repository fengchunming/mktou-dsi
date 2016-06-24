package com.mktou.dsi.module.bill.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mktou.dsi.core.exception.BusinessException;
import com.mktou.dsi.module.bill.dao.IBillDao;
import com.mktou.dsi.module.bill.dao2.IBillDao2;
import com.mktou.dsi.module.bill.entity.Bill;

@Service
public class BillService {

	@Autowired
	private IBillDao billDao;
	
	@Autowired
	private IBillDao2 billDao2;

	@Transactional(readOnly = true)
	public Bill getBillById(Integer billId) {
		return billDao.selectByPrimaryKey(billId);
	}
	
	@Transactional
	public int update(Bill bill) {
		return billDao.updateByPrimaryKey(bill);
	}
	
	@Transactional
	public int updateBoth(Bill bill) {
		int r = billDao.updateByPrimaryKeySelective(bill);
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			
		}
		if (r == 1) {
			throw new BusinessException("我抛出一个异常来，看看能不能两个数据库都回滚！");
		}
		billDao2.updateByPrimaryKeySelective(bill);
		return r;
	}

}