package com.yuan.spring.boot.app1.modules.system.entity.converter;

import com.yuan.spring.boot.app1.modules.system.entity.domain.SysPermisson;
import com.yuan.spring.boot.app1.modules.system.entity.vo.SysPermissionVo;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author yuane
 * @date 2019/7/14 23:24
 **/
@Mapper(componentModel = "spring", implementationPackage = "<PACKAGE_NAME>.impl")
public interface SysPermissionConverter {
    SysPermisson voToDomain(SysPermissionVo sysPermissionVo);

    List<SysPermisson> voToDomain(List<SysPermissionVo> sysPermissionVos);
}