package xyz.xnmq.seckill.utils;

import org.thymeleaf.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author xnmq
 * @Date 2021/7/16
 * @Description
 * 有效性校验
 */
public class ValidatorUtil {
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
