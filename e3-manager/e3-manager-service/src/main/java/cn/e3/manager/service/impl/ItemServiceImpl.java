package cn.e3.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3.manager.service.ItemService;
import cn.e3.mapper.TbItemMapper;
import cn.e3.pojo.TbItem;

@Service
public class ItemServiceImpl implements ItemService {

	//依赖注入
	@Autowired
	private TbItemMapper tbItemMapper;
	/**
	 * 根据id查询商品信息
	 */
	@Override
	public TbItem findItemById(Long itemId) {
		TbItem tbItem = tbItemMapper.selectByPrimaryKey(itemId);
		return tbItem;
	}

}
