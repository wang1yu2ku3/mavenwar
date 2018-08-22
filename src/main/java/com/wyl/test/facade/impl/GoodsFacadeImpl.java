/**
 * 
 */
package com.wyl.test.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wyl.test.entity.Goods;
import com.wyl.test.entity.User;
import com.wyl.test.facade.IUserFacade;
import com.wyl.test.service.IGoodsService;
import com.wyl.test.service.IUserService;

/**
 * @author Administrator
 *
 */
@Service(value = "goodsFacadeImpl")
public class GoodsFacadeImpl extends HibernateBaseFacade<Goods, Long> implements
IGoodsFacade{
	
	@Autowired
    @Qualifier("goodsServiceImpl")
    private IGoodsService iGoodsService;
	
	@Override
    public User getByGoodsId(Long goodsId) {
        return this.iGoodsService.getByGoodsId(goodsId);
    }

	

}
