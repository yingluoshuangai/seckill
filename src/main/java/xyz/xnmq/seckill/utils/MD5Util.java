package xyz.xnmq.seckill.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author xnmq
 * @Date 2021/7/12
 * @Description
 * MD5 加密工具类
 */
public class MD5Util {

    /**
     * MD5 加密的 salt
     * 主要是为了增强 MD5加密的安全性
     * 当需要对明文进行MD5加密的时候，添加一个salt值跟明文一起进行MD5加密，这样可以极大增强MD5被破解的难度
     * 当使用随机字符串作为salt加密是通常需要将salt一起上传服务器进行保存
     */
    private final static String salt = "1a2b3c4d";

    /**
     * MD5 加密
     * @param src
     * @return
     *
     */
    public static String md5(String src){
        return DigestUtils.md5Hex(src);
    }

    /**
     * 模拟前端加密
     * @param inputPass
     * @return
     */
    public static String inputPassToFromPass(String inputPass){
        // 注意char相加，会转成int类型相加，所以需要在前面加个空字符串
        // 对 密码 加salt
        String src = "" + salt.charAt(0) + salt.charAt(2) + inputPass + salt.charAt(5) + salt.charAt(4);
        return md5(src);
    }

    /**
     * 后端 对 密码 进行MD5加密
     * @param fromPass 传入的密码
     * @param salt 随机生成的salt
     * @return 加密后的密文
     */
    public static String fromPassToDBPass(String fromPass, String salt){
        String src = salt.charAt(0) + salt.charAt(1) + fromPass + salt.charAt(4) + salt.charAt(5);
        return md5(src);
    }

    public static void main(String[] args) {
        String password = "123456";
        String fromPass = inputPassToFromPass(password);
        String dbPass = fromPassToDBPass(fromPass, "12345erqw");
        System.out.println(fromPass);
        System.out.println(dbPass);
    }
}
