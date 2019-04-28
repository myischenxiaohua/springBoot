package cn.cxh.dao; /*
 ClassName:cn.cxh.dao
 Description:
 User: myischenxiaohua@163.com
 Date: 2019-04-26
 Time: 8:42
 */

import cn.cxh.domain.News;
import org.apache.ibatis.annotations.*;

import java.util.List;

//@Mapper
public interface NewsDao {
    @Select("select * from news")
    @Results({
            @Result(property = "id",column = "id",javaType =int.class),
            @Result(property = "categoryId",column = "category_id"),
            @Result(property = "title",column = "title"),
            @Result(property = "content",column = "content")
    })
    List<News> fandAll();
    News findById(int id);

    @Insert("insert into news(category_id,title,content) values(#{categoryIid},#{title},#{content})")
    int add(News news);

    @Update("update news set title=#{title},content=#{content} where id=#{id}")
    int update(News news);

    @Delete("delete from news where id=#{id}")
    int delById(int id);
}
