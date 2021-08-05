package xyz.xnmq.seckill.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhoulong
 * @Date 2021/7/13
 * @Description 通用响应
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "响应数据")
public class RespBean {
    @ApiModelProperty(value = "状态码")
    private long code;
    @ApiModelProperty(value = "消息")
    private String message;
    @ApiModelProperty(value = "数据")
    private Object obj;

    /**
     * 成功返回
     * @return
     */
    public static RespBean success(){
        return new RespBean(RespBeanEnum.SUCCESS.getCode(),
                RespBeanEnum.SUCCESS.getMessage(),
                null);
    }

    /**
     * 成功返回
     * @param obj
     * @return
     */
    public static RespBean success(Object obj){
        return new RespBean(RespBeanEnum.SUCCESS.getCode(),
                RespBeanEnum.SUCCESS.getMessage(),
                obj);
    }

    /**
     * 失败返回
     * @return
     */
    public static RespBean error(RespBeanEnum respBeanEnum){
        return new RespBean(respBeanEnum.getCode(),
                respBeanEnum.getMessage(),
                null);
    }

    /**
     * 失败返回
     * @param respBeanEnum
     * @param obj
     * @return
     */
    public static RespBean error(RespBeanEnum respBeanEnum, Object obj){
        return new RespBean(respBeanEnum.getCode(),
                respBeanEnum.getMessage(),
                obj);
    }
}
