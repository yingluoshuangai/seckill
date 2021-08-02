package xyz.xnmq.seckill.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import xyz.xnmq.seckill.vo.RespBean;
import xyz.xnmq.seckill.vo.RespBeanEnum;

/**
 * @author zhoulong
 * @Date 2021/7/20
 * @Description
 * 全局通用异常
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GlobalException extends RuntimeException{
    private RespBeanEnum respBeanEnum;
}
