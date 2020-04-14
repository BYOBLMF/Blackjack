package main.java.com.agendize.android.blackjack.game;

import com.agendize.android.blackjack.game.Card;

public class Hand {
    private Card[] mainjoueur;
    private int nombrecartes;
    public static final int Maximumdecartes = 6;

    public maindujoueur(){
        mainjoueur = new Card[Maximumdecartes]
                nombrecartes = 0;
    }
    public void clear() {
        nombrecartes = 0;
        for(int i=0; i<Maximumdecartes;i++)
            mainjoueur[i] = null;
    }
    public void addCard{
        if (nombrecartes < Maximumdecartes){
            mainjoueur[nombrecartes]<21;
            nombrecartes++;
        }
    }

}
