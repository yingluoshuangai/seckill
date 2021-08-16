package xyz.xnmq.seckill.annotation;

import org.thymeleaf.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author xnmq
 * @Date 2021/7/20
 * @Description
 * validator 中 解析 注解 @IsMobile
 *
 * ConstraintValidator<A extends Annotation, T> 中 A表示解析那个注解， T表示注解标注的参数类型
 * ConstraintValidator<IsMobile, String> 表示解析注解@IsMobile，注解标注的变量类型为String
 */
public class IsMobileValidator implements ConstraintValidator<IsMobile, String> {
    private boolean required = false;

    /**
     * 初始化方法
     * @param constraintAnnotation
     */
    @Override
    public void initialize(IsMobile constraintAnnotation) {
        // 通过constraintAnnotation 获得 注解中填的参数
        required = constraintAnnotation.required();
    }

    /**
     * 校验方法
     * @param value 变量的值
     * @param context
     * @return
     */
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(required){
            // 必填
            return isMobile(value);
        }else{
            // 非必填
            if(StringUtils.isEmpty(value)){
                return true;
            }else{
                return isMobile(value);
            }
        }
    }

    // 手机号正则
    private static final Pattern mobile_pattern = Pattern.compile("1(?:3\\d|4[4-9]|5[0-35-9]|6[67]|7[013-8]|8\\d|9\\d)\\d{8}");

    /**
     * 校验是否手机号
     * @param mobile
     * @return
     */
    public static boolean isMobile(String mobile){
        if(StringUtils.isEmpty(mobile)){
            return false;
        }
        Matcher matcher = mobile_pattern.matcher(mobile);
        return matcher.matches();
    }
}
