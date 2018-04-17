package net.arccode.protocol.javaremote.location;

/**
 * 查询区域信息指令
 *
 * @author http://arccode.net
 * @since 2018-04-13
 */
public class ExecuteSelectLocationsByParentCode {

    private String parentCode;

    public String getParentCode() {
        return parentCode;
    }

    public ExecuteSelectLocationsByParentCode() {
    }

    public ExecuteSelectLocationsByParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    @Override
    public String toString() {
        return "ExecuteSelectLocationsByParentCode{" +
                "parentCode='" + parentCode + '\'' +
                '}';
    }
}
