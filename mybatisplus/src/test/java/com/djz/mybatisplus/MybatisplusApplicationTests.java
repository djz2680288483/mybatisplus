package com.djz.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.djz.mapper.UserMapper;
import com.djz.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;

@SpringBootTest
class MybatisplusApplicationTests {
    @Autowired
    private UserMapper mapper;

    void testPage(){
        Page<User> page=new Page<>(1,5);
             mapper.selectPage(page,null);
             page.getRecords().forEach(System.out::println);

    }

    void testWrapper(){
        QueryWrapper<User> queryWrapper= new QueryWrapper<>();
        //queryWrapper.lambda().eq(User::getAge,20);
        queryWrapper.eq("age",20);
        queryWrapper.orderByAsc("age");
        List<User> list=mapper.selectList(queryWrapper);
        list.forEach(System.out::println);
//        queryWrapper.between("age",19,21);
//        Integer count=mapper.selectCount(queryWrapper);
//        System.out.println(count);


       // queryWrapper.eq("id",1L);
//       User user=   mapper.selectOne(queryWrapper);
//        System.out.println(user);



    }

    void update(){
        User user=new User();
        user.setId(3L);
        user.setName("翠花");
        user.setAge(18);
        user.setEmail("123546@139.com");
        mapper.updateById(user);


    }

    void delete(){
        mapper.deleteById(1L);


    }
    @Test
    void contextLoads() {
        HashMap<String,Object> map=new HashMap<>();
        //map.put("name","慧玲");
        map.put("age",21);

         List<User> users=   mapper.selectByMap(map);
        users.forEach(System.out::println);
//      List<User> list=mapper.selectBatchIds(Arrays.asList(1L,2L,3L));
    //  list.forEach(System.out::println);

//        User user1=new User();
//        user1.setId(1L);
//        user1.setAge(20);
//        user1.setName("吴军");
//        user1.setEmail("10086@qq.com");
      //   mapper.updateById(user1);
//        List<User> users = mapper.selectList(null);
//        for (User user : users) {
//            System.out.println(user);
//        }
    }
}
