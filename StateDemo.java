interface BattleState {
    void work(Character player, Enemy enemy);
}

class IdleState implements BattleState {
    public void work(Character player, Enemy enemy) {
        System.out.println(player.type + " is preparing for battle...");
    }
}

class AttackState implements BattleState {
    public void work(Character player, Enemy enemy) {
        enemy.health -= player.attack;
        System.out.println(player.type + " attacks!");
        System.out.println("Enemy HP: " + enemy.health);
    }
}

class DefenseState implements BattleState {
    public void work(Character player, Enemy enemy) {
        int reducedDamage = enemy.attack / 2;
        player.health -= reducedDamage;

        System.out.println(player.type + " defends!");
        System.out.println("Damage Taken: " + reducedDamage);
        System.out.println("Player HP: " + player.health);
    }
}

class SpecialMoveState implements BattleState {
    public void work(Character player, Enemy enemy) {
        int damage = player.attack * 2;
        enemy.health -= damage;

        System.out.println(player.type + " uses SPECIAL MOVE!");
        System.out.println("Damage: " + damage);
        System.out.println("Enemy HP: " + enemy.health);
    }
}

class DeadState implements BattleState {
    public void work(Character player, Enemy enemy) {
        System.out.println(player.type + " has died.");
        System.out.println("GAME OVER");
    }
}

class BattleContext {
    BattleState state;

    public void setState(BattleState state) {
        this.state = state;
    }

    public void work(Character player, Enemy enemy) {
        state.work(player, enemy);
    }
}
