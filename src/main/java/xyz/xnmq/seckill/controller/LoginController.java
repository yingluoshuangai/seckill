package xyz.xnmq.seckill.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import xyz.xnmq.seckill.service.IUserService;
import xyz.xnmq.seckill.vo.LoginVo;
import xyz.xnmq.seckill.vo.RespBean;

import javax.validation.Valid;

/**
 * @author zhoulong
 * @Date 2021/7/13
 * @Description
 */
@Api(tags = "登录模块")
@Controller
@RequestMapping("login")
@Slf4j
public class LoginController {
    @Autowired
    IUserService userService;

    /**
     * 进入登录界面
     * @return
     */
    @RequestMapping("toLogin")
    public String toLogin(){
        return "login";
    }

    /**
     * 登录功能
     * @param vo
     * @return
     */
    @RequestMapping("doLogin")
    @ResponseBody
    @ApiOperation(value = "登录功能")
    @ApiImplicitParam(name = "name",value = "姓名",required = true)
    public RespBean doLogin(@Validated LoginVo vo){
        log.info("Login:{}", vo);
        return userService.doLogin(vo);
    }
}
