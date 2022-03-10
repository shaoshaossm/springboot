package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class UserController {
    @RequestMapping(value = "/each/list")
    public String eachList(Model model) {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(100 + i);
            user.setNick("张" + i);
            user.setPhone("12144" + i);
            user.setAddress("运城" + i);
            userList.add(user);
        }
        model.addAttribute("userList", userList);
        return "eachList";
    }

    @RequestMapping(value = "/each/map")
    public String eachMap(Model model) {
        Map<Integer, Object> userMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i);
            user.setNick("lisi" + i);
            user.setPhone("111" + i);
            user.setAddress("运城" + i);
            userMap.put(i, user);

        }
        model.addAttribute("userMaps", userMap);
        return "eachMap";

    }

    @RequestMapping(value = "/each/array")
    public String eacgArray(Model model) {
        User[] userArray = new User[10];
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i);
            user.setNick("zs" + i);
            user.setPhone("111111" + i);
            user.setAddress("运城" + i);
            userArray[i] = user;

        }
        model.addAttribute("userArray" , userArray);
        return "eachArray";
    }
    @RequestMapping(value = "/each/all")
    public String eachAll(Model model){
        List<Map<Integer, List<User>>> myList = new ArrayList<>();
        for (int i = 0; i <2 ; i++) {
            Map<Integer, List<User>> myMap = new HashMap<>();
            for (int j = 0; j <2 ; j++) {
                List<User> myUserList = new ArrayList<>();
                for (int k = 0; k <3 ; k++) {
                    User user = new User();
                    user.setId(k);
                    user.setNick("zs"+i);
                    user.setPhone("111111"+i);
                    user.setAddress("运城"+i);
                    myUserList.add(user);

                }
                myMap.put(j,myUserList);

            }
            myList.add(myMap);

        }
        model.addAttribute("myList",myList);
        return "eachAll";

    }
}
