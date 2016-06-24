package com.mktou.dsi.module.bill.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mktou.dsi.core.entity.ResponseEntity;
import com.mktou.dsi.core.web.BaseController;
import com.mktou.dsi.module.bill.entity.Bill;
import com.mktou.dsi.module.bill.service.BillService;

@Controller
@RequestMapping("/bill")
public class BillController extends BaseController {

	@Autowired
	protected BillService billService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Object get(@PathVariable("id") Integer id) {
		Bill bill = billService.getBillById(id);
		return ResponseEntity.success("hi, how are you?", bill);
	}
	
	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public Object update(@PathVariable("id") Integer id) {
		Bill bill = billService.getBillById(id);
		bill.setRemark("更新成功！" + System.currentTimeMillis());
		billService.updateBoth(bill);
		return ResponseEntity.success("hi, how are you?", bill);
	}
	
}
