package tk.mybatis.simple.model;

import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.Data;

/**
 * @Auther: Raytine
 * @Date: 2018/6/28 03:02
 * @Description:
 */
@Data
public class Country {

    private Long id;

    private String countryname;

    private String countrycode;
}
