package xyz.xnmq.seckill.vo;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import xyz.xnmq.seckill.annotation.IsMobile;

import javax.validation.constraints.NotNull;

/**
 * @author zhoulong
 * @Date 2021/7/13
 * @Description 登录VO
 */
@Data
public class LoginVo {
    // 手机号
    @NotNull
    @IsMobile
    private String mobile;

    // 密码
    @NotNull
    @Length(min = 32)
    private String password;
}
