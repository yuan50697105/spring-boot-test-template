package com.spring.boot.test.app3.modules.commons.entity.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "sys_user")
public class SysUser extends BaseEntity {
    private String username;

}
