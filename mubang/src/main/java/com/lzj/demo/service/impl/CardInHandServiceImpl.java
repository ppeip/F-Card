package com.lzj.demo.service.impl;

import com.lzj.demo.dao.CardInHandDao;
import com.lzj.demo.entity.CardInHand;
import com.lzj.demo.service.CardInHandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author xcp
 * @version 1.0
 */
@Service
public class CardInHandServiceImpl implements CardInHandService {
    @Autowired
    private CardInHandDao cardInHandDao;



    @Override
    public List<CardInHand> queryCardInHand() {
        return cardInHandDao.queryCardInHand();
    }

    @Override
    public CardInHand queryCardInHandByName(String UID) {
        return cardInHandDao.queryCardInHandByName(UID);
    }

    @Transactional
    @Override
    public boolean insertCardInHand(CardInHand cardInHand) {
        if (cardInHand.getUID() != null && !"".equals(cardInHand.getUID())) {
            try {
                int effectedNum = cardInHandDao.insertCardInHand(cardInHand);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("插入手牌失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("插入手牌失败" + e.getMessage());
            }
        } else {
            throw new RuntimeException("手牌名称不能为空!");
        }
    }

    @Transactional
    @Override
    public boolean updateCardInHand(CardInHand cardInHand) {
        if (cardInHand.getUID() != null && !"".equals(cardInHand.getUID())) {
            try {
                int effectedNum = cardInHandDao.updateCardInHand(cardInHand);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("更新手牌失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("更新手牌失败" + e.getMessage());
            }
        } else {
            throw new RuntimeException("手牌名称不能为空!");
        }
    }

    @Transactional
    @Override
    public boolean deleteCardInHand(CardInHand cardInHand) {
        if (cardInHand.getUID() != null && !"".equals(cardInHand.getUID())) {
            try {
                int effectedNum = cardInHandDao.deleteCardInHand(cardInHand);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("删除手牌失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("删除手牌失败" + e.getMessage());
            }
        } else {
            throw new RuntimeException("手牌名称不能为空!");
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