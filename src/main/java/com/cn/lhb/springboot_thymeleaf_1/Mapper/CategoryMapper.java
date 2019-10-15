package com.cn.lhb.springboot_thymeleaf_1.Mapper;

import com.cn.lhb.springboot_thymeleaf_1.pojo.Category;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CategoryMapper {

    @Select("select * from categorys")
    List<Category> findAll();

    @Insert("insert into categorys(name) values(#{name})")
    public int save(Category category);

    @Delete("delete from categorys where id = #{id}")
    public void delete(int id);

    @Select("select * from categorys where id = #{id}")
    public Category get(int id);

    @Update("update categorys set name = #{name} where id = #{id}")
    public int update(Category category);
}
