package com.lzj.demo.service;

import com.lzj.demo.entity.PersonalCard;
import com.lzj.demo.entity.User;

import java.util.List;

/**
 * @author xcp
 * @version 1.0
 */
public interface PersonalCardService {

    List<PersonalCard> queryPersonalCard();
    PersonalCard queryPersonalCardByName(String UID);
    boolean insertPersonalCard(PersonalCard personalCard);
    boolean updatePersonalCard(PersonalCard personalCard);
    boolean deletePersonalCard(PersonalCard personalCard);
    boolean rollCard(User user);
}
