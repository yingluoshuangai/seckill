package xyz.xnmq.seckill.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xnmq
 * @Date 2021/7/10
 * @Description
 */
@Api(tags = "Demo模块")
@RestController
@RequestMapping("demo")
public class DemoController {
    /**
     * 测试验证
     * @return
     */
    @RequestMapping("test")
    public String demo(){
        return "hello word";
    }
}
