class ShieldDecorator extends Ability {
    Ability ability;

    public ShieldDecorator(Ability ability) {
        this.ability = ability;
    }

    public String decorate() {
        return ability.decorate() + " + Shield";
    }

    public int bonusHealth() {
        return ability.bonusHealth() + 30;
    }

    public int bonusAttack() {
        return ability.bonusAttack();
    }
}