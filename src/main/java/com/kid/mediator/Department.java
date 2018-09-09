package com.kid.mediator;

/**
 * 同事类接口
 */
public interface Department {
    /**
     * 做本部门的事情
     */
    void selfAction();

    /**
     * 向总经理发出申请
     */
    void outAction();
}
