package tk.mybatis.simple.mapper;

import tk.mybatis.simple.model.SysUser;

import java.util.List;

/**
 * @Auther: Raytine
 * @Date: 2018/6/28 04:31
 * @Description:
 */
public interface UserMapper {

    SysUser selectById(Long id);

    List<SysUser> selectAll();
}
