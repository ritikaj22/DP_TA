public class Character {
    String type;
    int health;
    int attack;
    int level = 1;
    int xp = 0;

    public void gainXP(int amount){
        xp += amount;

        if(xp >= 100){
            level++;
            xp = 0;
            health += 20;
            attack += 10;
            System.out.println("LEVEL UP! Reached Level " + level);
        }
    }

    public String toString(){
        return type + " | HP: " + health + " | ATK: " + attack + " | LVL: " + level + " | XP: " + xp;
    }
}
