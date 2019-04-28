//package cn.cxh.controller; /*
// ClassName:cn.cxh.controller
// Description:
// User: myischenxiaohua@163.com
// Date: 2019-04-24
// Time: 9:06
// */
//
//import cn.cxh.dao.UserDao;
//import cn.cxh.domain.User;
//import cn.cxh.service.UserService;
//import me.joshlarson.json.JSONArray;
//import org.springframework.cache.annotation.Cacheable;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpSession;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.UUID;
//
//@RestController
//public class UserController {
//    @Resource
//    private UserService userService;
//
//    @RequestMapping("/getUser")
//    public User getUser(@RequestParam String name){
//        User user=new User();
//        user.setUserName(name);
////        JSONArray jsonArray=new JSONArray();
////        jsonArray.add(user);
//
//        return user;
//    }
//
//
//    @RequestMapping("/user/index")
//    public String index(Model model){
//        model.addAttribute("name","张三使用模板121");
//        model.addAttribute("age",20);
//        return "index";
//
//    }
//
//    @RequestMapping("/user/list")
//    public String list(Model model){
////    List<User> users=new ArrayList<>();
////    users=userDao.findAll();
////        for (User user:users) {
////
////            System.out.println(user.getEmail());
////        }
//        model.addAttribute("title","列表页");
//        model.addAttribute("greeting","gee");
//       model.addAttribute("userList",userService.getUserList());
//        return "list";
//    }
//
//    @RequestMapping("/user/getList")
//    @Cacheable(value = "uerList")
//    public Object uertList(){
//        return userService.getUserList();
//    }
//
//    @RequestMapping("/user/getuid")
//    public Object getUid(HttpSession httpSession){
//        UUID uid=(UUID) httpSession.getAttribute("uid");
//        if (uid==null){
//            uid=UUID.randomUUID();
//            httpSession.setAttribute("uid",uid);
//        }
//        return httpSession.getId();
//    }
//
//}
