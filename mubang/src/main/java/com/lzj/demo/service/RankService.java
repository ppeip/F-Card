package com.lzj.demo.service;

import com.lzj.demo.entity.Rank;

import java.util.List;

/**
 * @author xcp
 * @version 1.0
 */
public interface RankService {

    List<Rank> queryRank();
    Rank queryRankByName(String name);
    boolean insertRank(Rank rank);
    boolean updateRank(Rank rank);
    boolean deleteRank(Rank rank);
}
