package xyz.xnmq.seckill.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoulong
 * @Date 2021/7/10
 * @Description
 */
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
