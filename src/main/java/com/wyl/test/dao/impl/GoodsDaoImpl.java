/**
 * GoodsDaoImpl.java
 * wyk
 * 2018年8月21日
 */
package com.wyl.test.dao.impl;

import com.wyl.test.entity.Goods;
import com.wyl.test.entity.User;

import java.util.Objects;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.wyl.test.dao.IGoodsDao;

@Repository
@Transactional
public class GoodsDaoImpl extends HibernateBaseDao<User, Long> implements IGoodsDao  {

	@Override
	public Goods getByGoodsId(Long goodsId) {
		// TODO Auto-generated method stub
		return (Goods) super.getCurrentSession().get(Goods.class, goodsId);
	}

	@Override
	public Long add(Goods goods) {
		// TODO Auto-generated method stub
		return (Long) super.getCurrentSession().save(goods);
	}

	@Override
	public void updateGoods(Goods goods) {
		// TODO Auto-generated method stub
		super.getCurrentSession().update(goods);
		
	}
	
	@Override
	public void delete(Long goodsId) {
		Goods goods=this.get(goodsId);
		if(Objects.isNull(goods)) {
			return;
		}
		super.getCurrentSession().delete(goodsId);
		
	}
	
	
	

}
