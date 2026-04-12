class ArcherBuilder implements CharacterBuilder{
    Character c = new Character();

    public ArcherBuilder(){
        c.type="Archer"; 
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