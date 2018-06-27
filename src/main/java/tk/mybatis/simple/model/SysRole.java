package tk.mybatis.simple.model;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: Raytine
 * @Date: 2018/6/28 04:18
 * @Description:
 */
@Data
public class SysRole {

    private Integer id;

    private String roleName;

    private Integer enabled;

    private Long createBy;

    private Date createTime;
}
