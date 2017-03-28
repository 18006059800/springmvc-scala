package com.myapp.Dao;
import com.myapp.Models.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * Created by jackywong on 28/03/2017.
 */
public interface UserDao {
    @Select("select * from User where id = #{id}")
    @Results({
            @Result(id=true,property = "id",column = "id",javaType = Long.class),
            @Result(property = "id_key",column = "id_key",javaType = String.class),
            @Result(property = "name",column = "name",javaType = String.class)
    })
    public User selectId(long id);
}
