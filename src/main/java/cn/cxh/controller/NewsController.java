package cn.cxh.controller; /*
 ClassName:cn.cxh.controller
 Description:
 User: myischenxiaohua@163.com
 Date: 2019-04-26
 Time: 9:06
 */

import cn.cxh.domain.News;
import cn.cxh.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsController {
    @Autowired
    private NewsService newsService;
    @RequestMapping("/news/list")
    public List<News> getNewsAll(){
        return newsService.getNewsAll();
    }
    @RequestMapping("news/getNews")
    public News getNews(int id){
        return  newsService.getNewsById(id);
    }

}
