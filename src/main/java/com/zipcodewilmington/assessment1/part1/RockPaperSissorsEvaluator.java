package com.zipcodewilmington.assessment1.part1;

import java.awt.print.Paper;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
            return handSign.equals("scissor") ? ROCK : handSign.equals("rock") ? PAPER : SCISSOR;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        return handSign.equals("scissor") ? PAPER : handSign.equals("rock") ? SCISSOR : ROCK;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String losingMoveAgainstP1 = getLosingMove(handSignOfPlayer1);
        String losingMoveAgainstP2 = getLosingMove(handSignOfPlayer2);

            if(losingMoveAgainstP1.equals(handSignOfPlayer2)){
                return handSignOfPlayer1;
            }else if(losingMoveAgainstP2.equals(handSignOfPlayer1)){
                return handSignOfPlayer2;
        }
            else{return "Tie";}
    }
}
