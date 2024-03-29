package com.yuan.spring.boot.dao.mybatis.mapper.utils;

import com.github.pagehelper.PageInfo;
import com.yuan.spring.boot.dao.commons.entity.vo.PageVo;

/**
 * @author yuane
 * @date 2019/7/13 12:35
 **/
public class PageUtils extends com.yuan.spring.boot.dao.commons.utils.PageUtils {
    public static <T> PageVo<T> build(PageInfo<T> pageInfo) {
        return build(pageInfo.getTotal(), pageInfo.getList());
    }
}
