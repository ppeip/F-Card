package com.lzj.demo.service.impl;

import com.lzj.demo.dao.PersonalCardDao;
import com.lzj.demo.entity.Card;
import com.lzj.demo.entity.PersonalCard;
import com.lzj.demo.service.PersonalCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.lzj.demo.entity.User;
import com.lzj.demo.dao.CardDao;

import java.util.List;

/**
 * @author xcp
 * @version 1.0
 */
@Service
public class PersonalCardServiceImpl implements PersonalCardService {
    @Autowired
    private PersonalCardDao personalCardDao;
    @Autowired
    private CardDao cardDao;


    @Override
    public List<PersonalCard> queryPersonalCard() {
        return personalCardDao.queryPersonalCard();
    }

    @Override
    public PersonalCard queryPersonalCardByName(String UID) {
        return personalCardDao.queryPersonalCardByName(UID);
    }

    @Transactional
    @Override
    public boolean insertPersonalCard(PersonalCard personalCard) {
        if (personalCard.getUID() != null && !"".equals(personalCard.getUID())) {
            try {
                int effectedNum = personalCardDao.insertPersonalCard(personalCard);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("插入卡牌失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("插入卡牌失败" + e.getMessage());
            }
        } else {
            throw new RuntimeException("卡牌名称不能为空!");
        }
    }

    @Transactional
    @Override
    public boolean updatePersonalCard(PersonalCard personalCard) {
        if (personalCard.getUID() != null && !"".equals(personalCard.getUID())) {
            try {
                int effectedNum = personalCardDao.updatePersonalCard(personalCard);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("更新卡牌失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("更新卡牌失败" + e.getMessage());
            }
        } else {
            throw new RuntimeException("卡牌名称不能为空!");
        }
    }

    @Transactional
    @Override
    public boolean deletePersonalCard(PersonalCard personalCard) {
        if (personalCard.getUID() != null && !"".equals(personalCard.getUID())) {
            try {
                int effectedNum = personalCardDao.deletePersonalCard(personalCard);
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

    @Transactional
    @Override
    public PersonalCard rollCard(User user) {
        int influence = user.getCollegeInflunce();
        if (influence == 0) {
            try {
                Card card = new Card();
                List<Card> cardList = cardDao.queryCard();
                double x = Math.random() * influence;
                if (x < 100) {
                    do {
                        card = cardList.get((int) (Math.random() * cardList.size()));
                    } while (!card.getRank().equals("讲师"));
                } else if (x < 1000) {
                    do {
                        card = cardList.get((int) (Math.random() * cardList.size()));
                    } while (!card.getRank().equals("副教授"));
                } else if (x < 10000) {
                    do {
                        card = cardList.get((int) (Math.random() * cardList.size()));
                    } while (!card.getRank().equals("教授"));
                } else if (x < 100000) {
                    do {
                        card = cardList.get((int) (Math.random() * cardList.size()));
                    } while (!card.getRank().equals("学士"));
                }
                PersonalCard personalCard = new PersonalCard(card.getAbility1(),card.getAbility2(),
                        card.getAbility3(),card.getAbility4(),card.getAbility5(),card.getCardLevel(),
                        card.getExperience(),card.getRank(),card.getIntroduction(),card.getPreferance(),user.getUID(),
                        card.getPreferance(),card.getCardName());
                personalCardDao.insertPersonalCard(personalCard);
                return personalCard;
            }catch (Exception e){
                throw new RuntimeException("抽卡失败");
            }
        }else{
            throw new RuntimeException("影响力不能为0!");
        }
    }
}