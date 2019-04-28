package cn.cxh.util; /*
 ClassName:cn.cxh.util
 Description:
 User: myischenxiaohua@163.com
 Date: 2019-04-24
 Time: 10:58
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NoteProperties {
//    @Value("${cn.cxh.key}")
    private String key;
//    @Value("${cn.cxh.dis}")
    private String dis;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDis() {
        return dis;
    }

    public void setDis(String dis) {
        this.dis = dis;
    }
}
