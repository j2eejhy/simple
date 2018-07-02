package tk.mybatis.simple.model;

/**
 * @Auther: Raytine
 * @Date: 2018/7/2 22:46
 * @Description:
 */
public class SysUserTest extends SysUser {

    public SysUserTest(String a){
        super();
    }

    public static void main(String[] args) {
        SysUserTest a = (SysUserTest) new SysUser();
        //SysUser a = new SysUserTest("aa");
    }
}
