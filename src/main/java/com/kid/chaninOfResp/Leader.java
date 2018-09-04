package com.kid.chaninOfResp;

/**
 * 抽象类
 */
public abstract class Leader {
    protected String name;
    protected Leader nextLeader; //责任链上的后继模式

    public Leader(String name) {
        super();
        this.name = name;
    }
    //设定责任链上的后继对象
    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    /**
     * 处理请求的核心方法
     * @param request
     */
    public abstract void handleRequest(LeaveRequest request);
}
