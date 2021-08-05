package xyz.xnmq.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.xnmq.seckill.entity.User;
import xyz.xnmq.seckill.dto.LoginDto;
import xyz.xnmq.seckill.vo.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xnmq
 * @since 2021-07-13
 */
public interface IUserService extends IService<User> {

     /**
      * 登录功能
      * @param vo
      * @return
      */
    RespBean doLogin(LoginDto vo);

}
