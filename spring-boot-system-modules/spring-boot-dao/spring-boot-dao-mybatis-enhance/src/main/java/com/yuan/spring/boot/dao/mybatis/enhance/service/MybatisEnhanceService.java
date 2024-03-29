package com.yuan.spring.boot.dao.mybatis.enhance.service;

import com.yuan.spring.boot.dao.commons.service.BaseService;
import com.yuan.spring.boot.dao.mybatis.enhance.entity.domain.MybatisEnhanceDomain;

import java.io.Serializable;

public interface MybatisEnhanceService<T extends MybatisEnhanceDomain<ID>, ID extends Serializable> extends BaseService<T, ID> {

}
