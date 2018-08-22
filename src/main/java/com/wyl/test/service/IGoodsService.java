/**
 * IgoodsService.java
 * wyk
 * 2018年8月21日
 */
package com.wyl.test.service;

import com.gargoylesoftware.htmlunit.Page;
import com.wyl.test.entity.Goods;

/**
 * @author wyk
 *
 */
public interface IGoodsService {
	
    Goods getByGoodsId( Long goodsId); 	
	
	Long add(Goods goods);
	
	void updateGoods(Goods goods);

	void delete(Long goodsId);
	
	Page<Goods> Page(Page page);

}
