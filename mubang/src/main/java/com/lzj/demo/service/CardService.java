package com.lzj.demo.service;

import com.lzj.demo.entity.Card;

import java.util.List;

/**
 * @author 林子键
 * @version 1.0
 */
public interface CardService {

    List<Card> queryCard();
    Card queryCardByName(String cardName);
    boolean insertCard(Card card);
    boolean updateCard(Card card);
    boolean deleteCard(Card card);
}
