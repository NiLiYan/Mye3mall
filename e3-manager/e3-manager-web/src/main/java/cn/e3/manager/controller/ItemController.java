package cn.e3.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3.manager.service.ItemService;
import cn.e3.pojo.TbItem;

@Controller
public class ItemController {

	//注入service层
	@Autowired
	private ItemService itemService;
	
	/**
	 * 根据id查询商品信息
	 * 请求：/item/id/{itemId}
	 */
	@RequestMapping("/item/id/{itemId}")
	@ResponseBody
	public TbItem findItemById(@PathVariable Long itemId){
		//调用service，查询商品
		TbItem tbItem = itemService.findItemById(itemId);
		return tbItem;
	}
}
