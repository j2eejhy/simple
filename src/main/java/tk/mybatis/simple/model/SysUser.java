package tk.mybatis.simple.model;

import com.mysql.jdbc.Blob;
import lombok.Data;

import java.sql.Date;


/**
 * @Auther: Raytine
 * @Date: 2018/6/28 04:13
 * @Description:
 */
@Data
public class SysUser {

    private Long id;

    private String userName;

    private String userPassword;

    private String userEmail;

    private String userInfo;

    private byte[] headImg;

    private Date createTime;
}
