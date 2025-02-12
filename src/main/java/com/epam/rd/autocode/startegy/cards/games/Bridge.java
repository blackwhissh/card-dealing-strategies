package com.epam.rd.autocode.startegy.cards.games;

import com.epam.rd.autocode.startegy.cards.Card;
import com.epam.rd.autocode.startegy.cards.CardDealingStrategy;
import com.epam.rd.autocode.startegy.cards.Deck;

import java.util.List;
import java.util.Map;

import static com.epam.rd.autocode.startegy.cards.InitializePlayers.*;

public class Bridge implements CardDealingStrategy {
    private static final int cards = 13;
    @Override
    public Map<String, List<Card>> dealStacks(Deck deck, int players) {
        Map<String, List<Card>> stacks = init(players);

        deal(stacks, cards, players, deck);

        return stacks;
    }
}
