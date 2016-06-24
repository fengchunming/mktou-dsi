package com.mktou.dsi.module.bill.dao2;

import org.springframework.stereotype.Repository;

import com.mktou.dsi.module.bill.entity.Bill;

@Repository
public interface IBillDao2 {
	int deleteByPrimaryKey(Integer id);

	int insert(Bill record);

	int insertSelective(Bill record);

	Bill selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Bill record);

	int updateByPrimaryKey(Bill record);
}