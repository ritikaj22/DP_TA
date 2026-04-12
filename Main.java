import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int playerXP = 50;

        System.out.println("Choose Character:");
        System.out.println("1. Warrior");
        if(playerXP >= 50){ 
            System.out.println("2. Mage");
        }
        if(playerXP >= 100){ 
            System.out.println("3. Archer");
        }

        int choice = sc.nextInt();

        Character player;

        if(choice == 1)
            player = new WarriorBuilder().setHealth(150).setAttack(30).getCharacter();
        else if(choice == 2)
            player = new MageBuilder().setHealth(100).setAttack(50).getCharacter();
        else
            player = new ArcherBuilder().setHealth(120).setAttack(40).getCharacter();

        
        System.out.println("You selected: " + choice);
        System.out.println(player);

        sc.close();
         // BATTLE
        Enemy enemy = new Enemy();
        BattleContext battle = new BattleContext();

        battle.setState(new IdleState());
        battle.work(player, enemy);

        battle.setState(new AttackState());
        battle.work(player, enemy);

        battle.setState(new DefenseState());
        battle.work(player, enemy);

        if(enemy.health < 30) {
            battle.setState(new SpecialMoveState());
            battle.work(player, enemy);
        }

        if(player.health <= 0) {
            battle.setState(new DeadState());
            battle.work(player, enemy);
        }

        player.gainXP(50);

        System.out.println("\nFinal Stats:");
        System.out.println(player);
    }
}


