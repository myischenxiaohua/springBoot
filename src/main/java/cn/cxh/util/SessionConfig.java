package cn.cxh.util; /*
 ClassName:cn.cxh.util
 Description:
 User: myischenxiaohua@163.com
 Date: 2019-04-25
 Time: 12:19
 */

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds=1000*60)
public class SessionConfig {

}
