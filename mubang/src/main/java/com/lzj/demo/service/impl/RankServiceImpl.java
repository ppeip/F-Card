package com.lzj.demo.service.impl;

import com.lzj.demo.dao.RankDao;
import com.lzj.demo.entity.Rank;
import com.lzj.demo.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author xcp
 * @version 1.0
 */
@Service
public class RankServiceImpl implements RankService {
    @Autowired
    private RankDao rankDao;



    @Override
    public List<Rank> queryRank() {
        return rankDao.queryRank();
    }

    @Override
    public Rank queryRankByName(String name) {
        return rankDao.queryRankByName(name);
    }

    @Transactional
    @Override
    public boolean insertRank(Rank rank) {
        if (rank.getName() != null && !"".equals(rank.getName())) {
            try {
                int effectedNum = rankDao.insertRank(rank);
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
    public boolean updateRank(Rank rank) {
        if (rank.getName() != null && !"".equals(rank.getName())) {
            try {
                int effectedNum = rankDao.updateRank(rank);
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
    public boolean deleteRank(Rank rank) {
        if (rank.getName() != null && !"".equals(rank.getName())) {
            try {
                int effectedNum = rankDao.deleteRank(rank);
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