package xyz.xnmq.seckill.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.xnmq.seckill.entity.User;
import xyz.xnmq.seckill.exception.GlobalException;
import xyz.xnmq.seckill.mapper.UserMapper;
import xyz.xnmq.seckill.service.IUserService;
import xyz.xnmq.seckill.utils.MD5Util;
import xyz.xnmq.seckill.dto.LoginDto;
import xyz.xnmq.seckill.vo.RespBean;
import xyz.xnmq.seckill.vo.RespBeanEnum;

import java.util.Objects;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xnmq
 * @since 2021-07-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public RespBean doLogin(LoginDto vo) {
        String mobile = vo.getMobile();
        String password = vo.getPassword();
//        if(StringUtils.isEmpty(mobile) || StringUtils.isEmpty(password)){
//            return RespBean.error(RespBeanEnum.LOGIN_ERROR);
//        }
//
//        if(!ValidatorUtil.isMobile(mobile)){
//            return RespBean.error(RespBeanEnum.MOBILE_ERROR);
//        }

        User user = userMapper.selectById(mobile);
        if(Objects.isNull(user)){
            throw new GlobalException(RespBeanEnum.LOGIN_ERROR);
        }

        if(!MD5Util.fromPassToDBPass(password, user.getSlat()).equals(user.getPassword())){
            throw new GlobalException(RespBeanEnum.LOGIN_ERROR);
        }

        return RespBean.success();
    }
}
