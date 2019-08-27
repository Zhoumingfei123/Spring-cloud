package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;
import com.tedu.sp01.pojo.User;

public interface ItemService {
	//通过订单id来获取商品例表
   User getUser(Integer id);
   //在保存
   void decreaseNumbers(List<Item> list);
List<Item> getItems(String orderId);
}
