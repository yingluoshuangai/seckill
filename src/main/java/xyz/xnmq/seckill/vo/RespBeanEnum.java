package xyz.xnmq.seckill.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @author xnmq
 * @Date 2021/7/13
 * @Description 通用响应 枚举
 */
@ToString
@AllArgsConstructor
@Getter
public enum  RespBeanEnum {
    // 通用
    SUCCESS(200, "success"),
    ERROR(500, "服务端异常"),

    // 登录相关
    LOGIN_ERROR(500218, "用户名或密码不正确"),
    MOBILE_ERROR(500211, "手机号码格式不正确"),

    BIND_ERROR(500212, "参数校验异常");

    private final Integer code;
    private final String message;
}
