package com.join.GoodsTradingProgram.mapper.managerMapper;

import com.join.GoodsTradingProgram.entity.manager.Manager;
import com.join.GoodsTradingProgram.entity.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Liulq
 * @Description:
 * @Date: 16:53 2020/5/17
 */
@Repository
@Mapper
public interface ManagerMapper {
    /**
     * 登录
     * @param manager
     * @return
     * @throws Exception
     */
    public Manager login(@Param("manager")Manager manager)throws Exception;

    /**
     * 增加管理员
     * @param manager
     * @return
     * @throws Exception
     */
    public Manager addManager(@Param("manager")Manager manager)throws Exception;

    /**
     * 修改个人信息
     * @param managerName
     * @param password
     * @return
     * @throws Exception
     */
    public Manager updateManager(@Param("managerName")String managerName,@Param("password")String password)throws Exception;
    /**
     * 列出所有管理者(查）
     * @return
     * @throws Exception
     */
    public List<Manager> listManager()throws Exception;

    /**
     * 查询用户列表
     * @return
     * @throws Exception
     */
    public List<User> listUser()throws Exception;

    /**
     * 删除用户
     * @param user
     * @return
     * @throws Exception
     */
    public User deleteUser(@Param("user")User user)throws Exception;
}
