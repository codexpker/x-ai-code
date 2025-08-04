package com.xpker.xaicodebackend.service;

import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.xpker.xaicodebackend.model.dto.user.UserLoginRequest;
import com.xpker.xaicodebackend.model.dto.user.UserQueryRequest;
import com.xpker.xaicodebackend.model.dto.user.UserRegisterRequest;
import com.xpker.xaicodebackend.model.entity.User;
import com.xpker.xaicodebackend.model.vo.LoginUserVO;
import com.xpker.xaicodebackend.model.vo.UserVO;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

/**
 * 用户 服务层。
 *
 * @author xpker
 */
public interface UserService extends IService<User> {
    /**
     * 用户注册
     *
     * @param userRegisterRequest 用户注册请求
     * @return 用户id
     */
    Long userRegister(UserRegisterRequest userRegisterRequest);

    /**
     * 用户登录
     *
     * @param userLoginRequest 用户登录请求
     * @return 登录用户封装类
     */
    LoginUserVO userLogin(UserLoginRequest userLoginRequest, HttpServletRequest request);

    /**
     * 获取登录用户信息
     *
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 用户注销
     *
     * @param request
     * @return
     */
    boolean userLogout(HttpServletRequest request);

    /**
     * 密码加密
     *
     * @param password 密码
     * @return 加密后的密码
     */
    String getEncodePassword(String password);

    /**
     * 获取登录用户封装类
     *
     * @param user 用户
     * @return 脱敏的登录用户
     */
    LoginUserVO getLoginUserVO(User user);

    /**
     * 获取用户封装类
     */
    UserVO getUserVO(User user);

    /**
     * 获取用户封装类列表
     */
    List<UserVO> getUserVOList(List<User> userList);

    /**
     * 构建条件查询器
     */
    QueryWrapper getQueryWrapper(UserQueryRequest userQueryRequest);
}
