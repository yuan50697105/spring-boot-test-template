package com.yuan.spring.boot.dao.jpa.entity.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.io.Serializable;

/**
 * @author yuane
 * @date 2019/6/20 19:23
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class JpaQueryParams<ID extends Serializable> extends com.yuan.spring.boot.dao.commons.entity.dto.BaseQueryParams<ID> implements Serializable {
    private int pageNumber;
    private int pageSize;
    private Sort sort;

    public JpaQueryParams() {
    }

    public JpaQueryParams(ID id, ID[] ids) {

        super(id, ids);
    }

    public JpaQueryParams(ID id, ID[] ids, int pageNumber, int pageSize) {
        super(id, ids);
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.sort = Sort.unsorted();
    }

    public JpaQueryParams(ID id, ID[] ids, int pageNumber, int pageSize, Sort sort) {
        super(id, ids);
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.sort = sort;
    }

    public Pageable getPageable() {
        return PageRequest.of(pageNumber, pageSize, sort);
    }
}
