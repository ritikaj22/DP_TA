class SpeedBoostDecorator extends Ability {
    Ability ability;

    public SpeedBoostDecorator(Ability ability) {
        this.ability = ability;
    }

    public String decorate() {
        return ability.decorate() + " + Speed Boost";
    }

    public int bonusHealth() {
        return ability.bonusHealth();
    }

    public int bonusAttack() {
        return ability.bonusAttack() + 10;
    }
}