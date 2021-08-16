package xyz.xnmq.seckill.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import springfox.documentation.annotations.ApiIgnore;
import xyz.xnmq.seckill.annotation.IsMobile;

import javax.validation.constraints.NotNull;

/**
 * @author xnmq
 * @Date 2021/7/13
 * @Description 登录VO
 */
@Data
@ApiModel(description = "登录Dto")
public class LoginDto {
    // 手机号
    @NotNull
    @IsMobile
    @ApiModelProperty(value = "手机号", required = true)
    private String mobile;

    // 密码
    @NotNull
    @Length(min = 32)
    @ApiModelProperty(value = "密码", required = true)
    private String password;
}
