package com.yuan.springbootwebmybatisenhance.commons.entity.po;

import com.gitee.hengboy.mybatis.enhance.common.annotation.Id;
import com.gitee.hengboy.mybatis.enhance.common.enums.KeyGeneratorTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class BasePo implements Serializable {
    @Id(generatorType = KeyGeneratorTypeEnum.UUID)
    private String id;
    private String createUser;
    private String updateUser;
    private Date createDate;
    private Date updateDate;

}
