package xyz.xnmq.seckill.controller;

import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import xyz.xnmq.seckill.service.IUserService;
import xyz.xnmq.seckill.dto.LoginDto;
import xyz.xnmq.seckill.vo.RespBean;

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
     * 页面 ： 进入登录页面
     *
     * @return
     */
    @ApiOperation(value = "页面-获得登录页面", notes = "页面-获得登录页面", position = 1)
    @RequestMapping(value = "toLogin", method = RequestMethod.GET)
    public String toLogin() {
        return "login";
    }

    /**
     * 登录功能
     *
     * @param dto
     * @return
     */
    @ApiOperation(value = "登录功能", notes = "根据手机号和密码登录", position = 2)
    @RequestMapping(value = "doLogin", method = RequestMethod.POST)
    @ResponseBody
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "mobile", value = "手机号", required = true, paramType = "body"),
//            @ApiImplicitParam(name = "password", value = "密码", required = true, paramType = "body")
//    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "请求成功"),
            @ApiResponse(code = 500, message = "服务端异常")
    })
    public RespBean doLogin(@Validated LoginDto dto) {
        log.info("Login:{}", dto);
        return userService.doLogin(dto);
    }
}
