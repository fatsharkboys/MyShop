package com.FatShark.service;

import com.FatShark.entity.Project;

import java.util.List;

/**
 * (Project)表服务接口
 *
 * @author makejava
 * @since 2021-11-03 07:55:50
 */
public interface ProjectService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Project queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Project> queryAllByLimit(int offset, int limit);

    /**
     * 查询所有数据
     *
     * @return 实例对象集合
     */
    List<Project> queryAllInfo();


    List<Project> queryLocalProject(int id, int page, int limit);

    List<Project> queryByProjectKind(String projectKind, int page, int limit);

    /**
     *
     */
    List<Project> queryProjectName(String projectName);

    /**
     * 新增数据
     *
     * @param project 实例对象
     * @return 实例对象
     */
    int insert(Project project);

    /**
     * 修改数据
     *
     * @param project 实例对象
     * @return 实例对象
     */
    int update(Project project);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    int deleteById(Integer id);

}