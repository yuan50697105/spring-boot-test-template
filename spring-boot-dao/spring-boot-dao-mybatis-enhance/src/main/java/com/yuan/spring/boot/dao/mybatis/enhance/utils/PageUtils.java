package com.yuan.spring.boot.dao.mybatis.enhance.utils;

import com.gitee.hengboy.mybatis.pageable.Page;
import com.yuan.spring.boot.dao.commons.entity.vo.PageVo;

/**
 * @author yuane
 * @date 2019/7/13 12:35
 **/
public class PageUtils extends com.yuan.spring.boot.dao.commons.utils.PageUtils {
    public static PageVo builde(Page page) {
        return PageVo.build(page.getTotalElements(), page.getData());
    }
}
