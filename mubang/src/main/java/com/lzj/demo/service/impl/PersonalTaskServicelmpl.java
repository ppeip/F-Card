package com.lzj.demo.service.impl;

import com.lzj.demo.dao.*;

import com.lzj.demo.entity.PersonalTask;
import com.lzj.demo.entity.Task;
import com.lzj.demo.service.PersonalTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.lzj.demo.entity.User;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;


@Service
public class PersonalTaskServicelmpl implements PersonalTaskService {
    @Autowired
    private PersonalTaskDao personalTaskDao;
    @Autowired
    private TaskDao taskdao;
    @Autowired
    private UserDao userDao;

    @Override
    public List<PersonalTask> queryPersonalTask() {
        return personalTaskDao.queryPersonalTask();
    }

    @Override
    public List<PersonalTask> queryPersonalTaskByUID(String UID) {
        return personalTaskDao.queryPersonalTaskByUID(UID);
    }


    @Transactional
    @Async
    @Scheduled(cron = "0 0 0 * * ?")
    @Override
    public void rollroutinePersonalTask() {
        try {
            List<User> users = userDao.queryUser();
            Date d = new Date();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd ");
            for (User user : users) {
                Date d1 = df.parse(user.getDateTime());
                if (d.getTime() - d1.getTime() < 2 * 24 * 60 * 60 * 1000) {
                    String uid = user.getUID();
                    List<Task> task = taskdao.queryTaskByType("日常");
                    Task userTask = task.get(new Random().nextInt(task.size()));
                    personalTaskDao.updatePersonalTask(
                            new PersonalTask(uid, userTask.getTaskName(), userTask.getCurrent(),
                                    userTask.getEnd(), userTask.getType(), userTask.getReward(),
                                    df.format(d.getTime())));
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("日常更新失败" + e);
        }
    }

    @Transactional
    @Async
    @Scheduled(cron = "0 0 4 ? * 1 ")
    @Override
    public void rollweekPersonalTask() {
        try {
            List<User> users = userDao.queryUser();
            Date d = new Date();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            for (User user : users) {
                Date d1 = df.parse(user.getDateTime());
                if (d.getTime() - d1.getTime() < 14 * 24 * 60 * 60 * 1000) {
                    String uid = user.getUID();
                    List<Task> task = taskdao.queryTaskByType("周常");
                    Task userTask = task.get(new Random().nextInt(task.size()));
                    personalTaskDao.insertPersonalTask(
                            new PersonalTask(uid, userTask.getTaskName(), userTask.getCurrent(),
                                    userTask.getEnd(), userTask.getType(), userTask.getReward(),
                                    df.format(d.getTime())));
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("周常更新失败" + e);
        }
    }

    @Transactional
    @Override
    public void insertroutinePersonalTask(User user) {
        try {
            Date d = new Date();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String uid = user.getUID();
            List<Task> task = taskdao.queryTaskByType("日常");
            Task userTask = task.get(new Random().nextInt(task.size()));
            personalTaskDao.insertPersonalTask(
                    new PersonalTask(uid, userTask.getTaskName(), userTask.getCurrent(),
                            userTask.getEnd(), userTask.getType(), userTask.getReward(),
                            df.format(d.getTime())));
        } catch (Exception e) {
            throw new RuntimeException("日常初始化失败" + e);
        }
    }
    @Transactional
    @Override
    public void insertweekPersonalTask(User user) {
        try {
            Date d = new Date();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String uid = user.getUID();
            List<Task> task = taskdao.queryTaskByType("周常");
            Task userTask = task.get(new Random().nextInt(task.size()));
            personalTaskDao.insertPersonalTask(
                    new PersonalTask(uid, userTask.getTaskName(), userTask.getCurrent(),
                            userTask.getEnd(), userTask.getType(), userTask.getReward(),
                            df.format(d.getTime())));
        } catch (Exception e) {
            throw new RuntimeException("周常初始化失败" + e);
        }
    }


    @Transactional
    @Override
    public boolean insertPersonalTask(PersonalTask personalTask) {
        if (personalTask.getUID() != null && !"".equals(personalTask.getUID())) {
            try {
                int effectedNum = personalTaskDao.insertPersonalTask(personalTask);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("插入个人任务失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("插入个人任务失败" + e.getMessage());
            }
        } else {
            throw new RuntimeException("个人任务UID不能为空!");
        }
    }

    @Transactional
    @Override
    public boolean updatePersonalTask(PersonalTask personalTask) {
        if (personalTask.getUID() != null && !"".equals(personalTask.getUID())) {
            try {
                int effectedNum = personalTaskDao.updatePersonalTask(personalTask);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("更新个人任务失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("更新个人任务失败" + e.getMessage());
            }
        } else {
            throw new RuntimeException("个人任务UID不能为空!");
        }
    }

    @Transactional
    @Override
    public boolean deletePersonalTask(String UID, String taskName) {
        if (UID != null && !"".equals(UID)) {
            try {
                int effectedNum = personalTaskDao.deletePersonalTask(UID, taskName);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("删除卡牌失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("删除卡牌失败" + e.getMessage());
            }
        } else {
            throw new RuntimeException("卡牌名称不能为空!");
        }
    }


}
