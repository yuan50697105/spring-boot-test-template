package com.yuan.springbootwebmybatisplus.system.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yuan.springbootwebmybatisplus.commons.controller.BaseController;
import com.yuan.springbootwebmybatisplus.commons.entity.dto.Result;
import com.yuan.springbootwebmybatisplus.commons.entity.vo.AjaxResult;
import com.yuan.springbootwebmybatisplus.commons.entity.vo.PageVo;
import com.yuan.springbootwebmybatisplus.system.entity.bo.SysUserQueryParams;
import com.yuan.springbootwebmybatisplus.system.service.SysUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.async.WebAsyncTask;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author yuane
 * @date 2019/7/1 22:36
 **/

@Controller
@RequestMapping("system/user")
public class SysUserController extends BaseController {
    private final SysUserService sysUserService;

    public SysUserController(SysUserService sysUserService) {
        this.sysUserService = sysUserService;
    }

    @RequestMapping
    public WebAsyncTask<ModelAndView> list() {
        return new WebAsyncTask<>(() -> new ModelAndView("system/user/list"));
    }

    public WebAsyncTask<AjaxResult> dataPage(SysUserQueryParams queryParams, int page, int size) {
        return new WebAsyncTask<>(() -> {
            Page<Map<String, Object>> list = sysUserService.findPage(new Page<Map<String, Object>>(page, size), queryParams);
            return Result.of(Result.Status.DATA, null, PageVo.of(list.getTotal(), list.getRecords())).toAjax();
        });


    }
}
