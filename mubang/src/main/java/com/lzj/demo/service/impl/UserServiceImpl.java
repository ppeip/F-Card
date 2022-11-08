package com.lzj.demo.service.impl;

import com.lzj.demo.dao.UserDao;
import com.lzj.demo.entity.User;
import com.lzj.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author xcp
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;



    @Override
    public List<User> queryUser() {
        return userDao.queryUser();
    }

    @Override
    public User queryUserByName(String UID) {
        return userDao.queryUserByName(UID);
    }

    @Transactional
    @Override
    public boolean insertUser(User user) {
        if (user.getUID() != null && !"".equals(user.getUID())) {
            try {
                int effectedNum = userDao.insertUser(user);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("插入用户失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("插入用户失败" + e.getMessage());
            }
        } else {
            throw new RuntimeException("用户名称不能为空!");
        }
    }

    @Transactional
    @Override
    public boolean updateUser(User user) {
        if (user.getUID() != null && !"".equals(user.getUID())) {
            try {
                int effectedNum = userDao.updateUser(user);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("更新用户失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("更新用户失败" + e.getMessage());
            }
        } else {
            throw new RuntimeException("用户名称不能为空!");
        }
    }

    @Transactional
    @Override
    public boolean deleteUser(User user) {
        if (user.getUID() != null && !"".equals(user.getUID())) {
            try {
                int effectedNum = userDao.deleteUser(user);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("删除用户失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("删除用户失败" + e.getMessage());
            }
        } else {
            throw new RuntimeException("用户名称不能为空!");
        }
    }

//    @Transactional
//    @Override
//    public boolean rollCard(Integer influence) {
//        if (influence == 0) {
//            try {
//                Card card;
//                List<Card> cardList = cardDao.queryCard();
//                double x = Math.random() * influence;
//                if (x < 100) {
//                    do {
//                        card = cardList.get((int) (Math.random() * cardList.size()));
//                    } while (!card.getRank().equals("讲师"));
//                } else if (x < 1000) {
//                    do {
//                        card = cardList.get((int) (Math.random() * cardList.size()));
//                    } while (!card.getRank().equals("副教授"));
//                } else if (x < 10000) {
//                    do {
//                        card = cardList.get((int) (Math.random() * cardList.size()));
//                    } while (!card.getRank().equals("教授"));
//                } else if (x < 100000) {
//                    do {
//                        card = cardList.get((int) (Math.random() * cardList.size()));
//                    } while (!card.getRank().equals("学士"));
//                }
//                addPersonalCard
//                return true;
//
//            }catch (Exception e){
//                throw new RuntimeException("抽卡失败");
//            }
//        }else{
//            throw new RuntimeException("影响力不能为0!");
//        }
//    }

}