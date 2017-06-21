package com.ssf.sys.model;

import java.io.Serializable;

/**
 *   sys_re_role_permission	角色权限表
 *
 */
public class SysReRolePermission implements Serializable {
    /**
     *  ,所属表字段为sys_re_role_permission.id
     */
    private Integer id;

    /**
     *  角色ID,所属表字段为sys_re_role_permission.roleId
     */
    private Integer roleid;

    /**
     *  权限ID,所属表字段为sys_re_role_permission.permissionId
     */
    private Integer permissionid;

    /**
     *  应用ID,所属表字段为sys_re_role_permission.appId
     */
    private Integer appid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(Integer permissionid) {
        this.permissionid = permissionid;
    }

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleid=").append(roleid);
        sb.append(", permissionid=").append(permissionid);
        sb.append(", appid=").append(appid);
        sb.append("]");
        return sb.toString();
    }
}