package com.yuan.spring.boot.dao.mybatis.mapper.entity.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * @author yuane
 * @date 2019/6/15 22:47
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@MappedSuperclass
public abstract class MybatisMapperDomain<ID extends Serializable> extends com.yuan.spring.boot.dao.commons.entity.domain.BaseDomain<ID> implements Serializable {
    public MybatisMapperDomain() {
    }
}

