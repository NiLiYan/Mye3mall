package cn.e3.manager.service;

import cn.e3.pojo.TbItem;

public interface ItemService {

	/**
	 * 根据id查询商品信息
	 */
	public TbItem findItemById(Long itemId);
}
