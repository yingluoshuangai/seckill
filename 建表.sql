-- ============= seckill 建表语句 ================

-- 用户表 t_user
CREATE TABLE t_user
(
    id              bigint(20)   not null comment '用户ID',
    mobile          bigint(20)   not null comment '手机号',
    nickname        varchar(255) not null comment '昵称',
    password        varchar(32)  default null COMMENT '密码，MD5(MD5(pass明文 + 固定salt) + 固定salt)',
    slat            varchar(10)  DEFAULT null comment '密码加密需要的slat',
    head            varchar(128) default null comment '头像',
    register_date   datetime     default null comment '注册时间',
    last_login_date datetime     default null comment '最后其次登录时间',
    login_count     int(11)      default '0' comment '登录次数',
    primary key (id)
)