package com.zglu.api.user.service;

import com.zglu.common.Page;
import com.zglu.mybatis.user.User;
import com.zglu.mybatis.user.UserDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zglu
 */
@Service
@AllArgsConstructor
public class UserService {
    private final UserDao userDao;

    public User add(User user) {
        return userDao.save(user);
    }

    @Transactional(rollbackFor = RuntimeException.class)
    public User add2(User user) {
        userDao.save(user);
        // 当不设id为空时，会抛出重复id错误，事物回滚
        user.setId(null);
        return userDao.save(user);
    }

    public User get(long id) {
        return userDao.findById(id);
    }

    public List<User> list(String q, String order, Integer offset, Integer limit) {
        return userDao.findAll(q, order, offset, limit);
    }

    public Page<User> page(String q, String order, Integer number, Integer size) {
        long totalElements = userDao.count(q);
        Page<User> page = new Page<>(totalElements, number, size);
        List<User> content = userDao.findAll(q, order, page.getOffset(), size);
        page.setContent(content);
        return page;
    }

    public User put(User user) {
        return userDao.put(user);
    }

    public User set(User user) {
        return userDao.update(user);
    }

    public User disable(long id, Long lastModifiedBy) {
        User user = new User();
        user.setId(id);
        user.setEnable(false);
        user.setLastModifiedBy(lastModifiedBy);
        return userDao.update(user);
    }

    public int remove(long id) {
        return userDao.deleteById(id);
    }

}
