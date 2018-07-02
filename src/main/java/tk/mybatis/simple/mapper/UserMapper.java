package tk.mybatis.simple.mapper;

import org.apache.ibatis.annotations.Param;
import tk.mybatis.simple.model.SysRole;
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

    List<SysRole> selectRoleByUserId(Long userId);

    int insert(SysUser sysUser);

    List<SysRole> selectRolesByUserIdAndEnabled( @Param("enabled")Integer enabled,@Param("userId") Long userId);
}
