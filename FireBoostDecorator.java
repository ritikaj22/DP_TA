class FireBoostDecorator extends Ability {
    Ability ability;

    public FireBoostDecorator(Ability ability) {
        this.ability = ability;
    }

    public String decorate() {
        return ability.decorate() + " + Fire Boost";
    }

    public int bonusHealth() {
        return ability.bonusHealth();
    }

    public int bonusAttack() {
        return ability.bonusAttack() + 20;
    }
}