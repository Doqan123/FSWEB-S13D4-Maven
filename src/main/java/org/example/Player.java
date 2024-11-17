package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon){
        this.name = name;
        this.healthPercentage = healthPercentage;
        this.weapon = weapon;
    }
    public int healthRemaining(){
        return  this.healthPercentage;
    }
    public void loseHealth(int damage){
        this.healthPercentage -= damage;

        if (this.healthPercentage < 0) {
            System.out.println(name + " player has been knocked out of the game");
            this.healthPercentage = 0;
        }

    }
    public void  restoreHealth(int healthPotion){
        this.healthPercentage += healthPotion; // Sağlık iksiri kadar artır

        if (this.healthPercentage > 100) {
            this.healthPercentage = 100; // Sağlık 100'ü aşarsa, 100'e sabitle
        }

    }
}
