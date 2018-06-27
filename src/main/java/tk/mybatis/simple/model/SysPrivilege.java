package tk.mybatis.simple.model;

import lombok.Data;

/**
 * @Auther: Raytine
 * @Date: 2018/6/28 04:21
 * @Description:
 */
@Data
public class SysPrivilege {

    private Long id;

    private String privilegeName;

    private String privilegeUrl;
}
