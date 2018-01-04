package com.olal.caclulator.service;

import com.olal.caclulator.dao.UserDao;
import com.olal.caclulator.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

   private UserDao userDao;


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User findOne(@PathVariable("id") Integer id) {
        return userDao.findById(id).get();
    }


    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public User create(@RequestBody User user) {
        return userDao.save(user);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id) {
        userDao.deleteById(id);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
