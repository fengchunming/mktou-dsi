package com.mktou.dsi.module.bill.dao;

import org.springframework.stereotype.Repository;

import com.mktou.dsi.module.bill.entity.Bill;

@Repository
public interface IBillDao {
	int deleteByPrimaryKey(Integer id);

	int insert(Bill record);

	int insertSelective(Bill record);

	Bill selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Bill record);

	int updateByPrimaryKey(Bill record);
}