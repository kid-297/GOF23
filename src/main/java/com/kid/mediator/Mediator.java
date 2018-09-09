package com.kid.mediator;

/**
 *中介者
 */
public interface Mediator {
    /**
     *
     * @param dname  部门名称
     * @param department  同事类
     */
    void register(String dname,Department department);

    /**
     * 发出命令
     * @param dname
     */
    void command(String dname);
}
