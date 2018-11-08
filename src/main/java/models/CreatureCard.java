package models;

public class CreatureCard extends Card {

    private int hp;
    private int defence;
    private int power;
    private boolean tapped;
    private int playedOnRound;

    
    public CreatureCard(int attack, int cardEnergy, String cardName, String specialAttack, int hp, int defence, int power){

        super(attack, cardEnergy, cardName, specialAttack);
        this.hp = hp;
        this.defence = defence;
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public int getDefence() {
        return defence;
    }

    public int getPower() {
        return power;
    }

    public void removeHp( int dmg){

        this.hp -= dmg;
    }

    public boolean isTapped() {
        return tapped;
    }

    public void tap(){
        this.tapped = true;
    }

    public void unTap(){
        this.tapped = false;
    }

    public int getPlayedOnRound() {
        return playedOnRound;
    }

    public void setPlayedOnRound(int playedOnRound) {
        this.playedOnRound = playedOnRound;
    }
}
