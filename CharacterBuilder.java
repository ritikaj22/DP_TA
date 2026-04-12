interface CharacterBuilder{
    CharacterBuilder setType(String s);

    CharacterBuilder setHealth(int h);

    CharacterBuilder setAttack(int a);
    
    Character getCharacter();
}