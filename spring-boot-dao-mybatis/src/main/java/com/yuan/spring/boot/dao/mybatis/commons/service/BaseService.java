package com.yuan.spring.boot.dao.mybatis.commons.service;

/**
 * @author yuane
 * @date 2019/7/10 21:47
 **/
public interface BaseService<T, ID> {
    void checkSave(T t);

    void checkInsert(T t);

    void checkUpdate(T t);

    void save(T t);

    void saveIgnoreNull(T t);

    void saveAll(T[] arrays);

    void saveAll(Iterable<T> iterable);

    void insert(T t);

    void update(T t);

    void updateIgnoreNull(T t);

    void delete(ID id);

    void delete(ID[] ids);

    void delete(Iterable<ID> iterable);
}
