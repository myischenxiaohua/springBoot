package cn.cxh.service.impl; /*
 ClassName:cn.cxh.service.impl
 Description:
 User: myischenxiaohua@163.com
 Date: 2019-04-26
 Time: 9:09
 */

import cn.cxh.dao.NewsDao;
import cn.cxh.domain.News;
import cn.cxh.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class NewsServiceImpl implements NewsService {
    @Resource
    private NewsDao newsDao;
    @Override
    public List<News> getNewsAll() {
        return newsDao.fandAll();
    }

    @Override
    public News getNewsById(int id) {
        return newsDao.findById(id);
    }

    @Override
    public boolean addNews(News news) {
        return newsDao.add(news)>0;
    }

    @Override
    public boolean updateNews(News news) {
        return newsDao.update(news)>0;
    }

    @Override
    public boolean delNews(int id) {
        return newsDao.delById(id)>0;
    }
}
