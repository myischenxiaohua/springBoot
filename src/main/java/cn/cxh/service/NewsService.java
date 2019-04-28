package cn.cxh.service; /*
 ClassName:cn.cxh.service
 Description:
 User: myischenxiaohua@163.com
 Date: 2019-04-26
 Time: 9:07
 */


import cn.cxh.domain.News;

import java.util.List;

public interface NewsService {
    List<News> getNewsAll();
    News getNewsById(int id);
    boolean addNews(News news);
    boolean updateNews(News news);
    boolean delNews(int id);

}
