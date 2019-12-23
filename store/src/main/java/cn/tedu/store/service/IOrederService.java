package cn.tedu.store.service;

import cn.tedu.store.entity.Order;

public interface IOrederService {
    /**
     *
     * @param uid
     * @param username
     * @param aid
     * @param cids
     * @return
     */
    Order create(Integer uid,String username,Integer aid,Integer[] cids);
}
