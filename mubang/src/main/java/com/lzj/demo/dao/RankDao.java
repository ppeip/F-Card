package com.lzj.demo.dao;

import com.lzj.demo.entity.Rank;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xcp
 * @version 1.0
 */
@Mapper
@Repository
public interface RankDao {
    List<Rank> queryRank();
    Rank queryRankByName(String name);
    int insertRank(Rank rank);
    int updateRank(Rank rank);
    int deleteRank(Rank rank);

}
