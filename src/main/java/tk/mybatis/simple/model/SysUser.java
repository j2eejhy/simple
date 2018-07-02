package tk.mybatis.simple.model;

import lombok.Data;

import java.util.Date;


/**
 * @Auther: Raytine
 * @Date: 2018/6/28 04:13
 * @Description:
 */
@Data
public class SysUser {

    public SysUser() {

    }

    public SysUser(int a) {

    }

    public SysUser(int a,String b) {

    }

    private Long id;

    private String userName;

    private String userPassword;

    private String userEmail;

    private String userInfo;

    private byte[] headImg;

    private Date createTime;
}
