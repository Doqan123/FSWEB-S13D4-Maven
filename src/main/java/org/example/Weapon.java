package org.example;

public enum Weapon {
    //Enumın değerlerini yazdığımızda enum' ı çağırıyoruz. new keyword u ile yeni nesne oluşturmaya benziyor.
    SWORD(20,4),
    AXE(30,2.3),
    MACE(40, 1.1);

    private int damage;
    private double attackSpeed;

    Weapon(int damage, double attackSpeed){
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public  int getDamage(){
        return this.damage;
    }
    public  double getAttackSpeed(){
        return  this.attackSpeed;
    }
}
