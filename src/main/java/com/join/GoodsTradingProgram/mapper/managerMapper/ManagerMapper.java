package com.join.GoodsTradingProgram.mapper.managerMapper;

import com.join.GoodsTradingProgram.entity.manager.Manager;
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
     * 列出所有管理者
     * @return
     * @throws Exception
     */
    public List<Manager> listManager()throws Exception;
}
