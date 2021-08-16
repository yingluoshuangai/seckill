package xyz.xnmq.seckill.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author xnmq
 * @Date 2021/8/16
 * @Description
 */
@Api("商品模块")
@Controller
@RequestMapping("goods")
@Slf4j
public class GoodsController {

    /**
     * 页面 ： 获得商品列表页面
     * @return
     */
    @ApiOperation(value = "页面-获得商品列表页面", notes = "页面-获得商品列表页面")
    @RequestMapping(value = "toList", method = RequestMethod.GET)
    public String toList(){
        return "goodsList";
    }
}
