** 秒杀系统Demo **

1. 使用两次md5对用户密码进行加密
2. 使用validator对参数校验，定义异常处理器，对validator返回的bindException进行处理，保证统一响应
3. 定义全局统一响应RespBean，保证响应的一致性
4. 定义全局异常处理，保证异常时，返回统一的响应