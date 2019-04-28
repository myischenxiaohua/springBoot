//package cn.cxh; /*
// ClassName:cn.cxh
// Description:
// User: myischenxiaohua@163.com
// Date: 2019-04-24
// Time: 9:14
// */
//
//import cn.cxh.controller.UserController;
//import cn.cxh.dao.UserDao;
//import cn.cxh.domain.User;
//import cn.cxh.util.NoteProperties;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.data.redis.core.ValueOperations;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import java.util.concurrent.TimeUnit;
//
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class ApplicationTest {
//    @Autowired
//    private StringRedisTemplate stringRedisTemplate;
//    @Autowired
//    private RedisTemplate redisTemplate;
//    @Autowired
//    private NoteProperties noteProperties;
//    @Autowired
//    private UserDao userDao;
//    private MockMvc mockMvc;
//    @Before //在执行测试之前执行
//    //UserController.class 测试的控制器
//    public void setUp(){
//        mockMvc= MockMvcBuilders.standaloneSetup(UserController.class).build();
//    }
//
//    @Test
//    public void getUser() throws Exception {
//        //MockMvcRequestBuilders.get("/getUser")设置请求方式get和接口方法请求地址
//        //accept(MediaType.APPLICATION_JSON) 设置数据格式json
//        //param("name","zs") 设置传递给接口方法参数
//      String responseString=  mockMvc.perform(
//                MockMvcRequestBuilders.get("/getUser")
//                        .accept(MediaType.APPLICATION_JSON)
//                        .param("name","zs")
//                ).andExpect(status().isOk())
//                .andDo(print()) //andDo(print())打印出请求和相应的内容
//                .andReturn().getResponse().getContentAsString(); ////将相应的数据转换为字符串
//        ; //andDo(print())打印出请求和相应的内容
//
//        System.out.println("响应的内容："+responseString);
//
//    }
//    @Test
//    public void testPr(){
////        System.out.println(noteProperties.getKey());
//////        System.out.println(noteProperties.getDis());
//        User user= userDao.findByUserName("lisi");
//       System.out.println(user.getUserName()+"密码"+user.getEmail());
//    }
//
//    @Test
//    public void testRedis(){
//        ValueOperations valueOperations=stringRedisTemplate.opsForValue();
//       // valueOperations.set("b1","springBoot整合Redis的使用b1");
//        System.out.println(valueOperations.get("boot"));
//
//    }
//    @Test
//    public void testRedisObject() throws InterruptedException {
//        User user=new User();
//        user.setUserName("李四");
//        user.setEmail("1@qq.com");
//        user.setUserId(10);
//        ValueOperations<String,User> valueOperations=redisTemplate.opsForValue();
//        valueOperations.set("userMsg",user);
//        valueOperations.set("cn.cxh.1",user,1, TimeUnit.SECONDS);
////        Thread.sleep(1000);
//       boolean flag= redisTemplate.hasKey("cn.cxh.1");
//       if(flag){
//
//           System.out.println("添加成功");
//           System.out.println( valueOperations.get("cn.cxh.1").getUserName());
//       }else {
//           System.out.println("添加失败");
//       }
//
//    }
//
//
//
//
//
//}
