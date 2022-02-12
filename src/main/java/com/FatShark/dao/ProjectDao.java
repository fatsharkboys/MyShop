package com.FatShark.dao;

import com.FatShark.entity.Project;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Project)表数据库访问层
 *
 * @author makejava
 * @since 2021-11-03 07:55:50
 */
public interface ProjectDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Project queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Project> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 查看所有信息
     *
     * @return 实例集合
     */
    List<Project> queryAllInfo();


    List<Project> queryLocalProject(int id, int page, int limit);


    List<Project> queryByProjectKind(String projectKind, int page, int limit);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param projectName 实例对象名称
     * @return 对象列表
     */
    List<Project> queryProjectName(String projectName);

    /**
     * 新增数据
     *
     * @param project 实例对象
     * @return 影响行数
     */
    int insert(Project project);

    /**
     * 修改数据
     *
     * @param project 实例对象
     * @return 影响行数
     */
    int update(Project project);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}