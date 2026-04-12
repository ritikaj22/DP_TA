class MageBuilder implements CharacterBuilder{
    Character c = new Character();

    public MageBuilder(){
        c.type="Mage";
    }

    public CharacterBuilder setType(String s){
        c.type=s;
        return this; 
    }

    public CharacterBuilder setHealth(int h){ 
        c.health=h; 
        return this; 
    }

    public CharacterBuilder setAttack(int a){ 
        c.attack=a; 
        return this; 
    }

    public Character getCharacter(){ 
        return c; 
    }
    
}