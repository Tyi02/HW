package com.CSCI185;

public class NinjaDemo{
    public static void main(String[] args) {
        Ninja[] shinobi = new Ninja[3];
        shinobi[0] = new Ninja("Sasuke","Hidden leaf village","Rinnegan",
                10, 15);

        shinobi[1] = new Ninja("Itachi", "Hidden leaf village", "Tsukuyomi",
                150, 20);

        shinobi[2] = new Ninja("Madara", "Hidden leaf village", "Chibaku Tensei",
                200, 25);



        for (Ninja shinobis:shinobi)
        {
            shinobis.bloodlineAttack();
            shinobis.ShinobiTrick();
        }
    }


}

