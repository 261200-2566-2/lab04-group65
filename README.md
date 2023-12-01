[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/DRqen68Y)

-RPG Character Interface

 public interface RPGCharacter {
    // Common character attributes
    String getName();
    int getLevel();
    int getMaxHP();
    int getCurrentHP();
    int getMana();
    int getRunSpeed();
    int getAttack(); 
    void setAttack(int attack);
    int getIntelligence();
    void setIntelligence(int intelligence);
    // Common character actions
    void attack(RPGCharacter target);
    void takeDamage(int damage);
    void useAbility(String ability);
    // Equip and unequip accessories
    void equipAccessory(Accessory accessory);
    void unequipAccessory(Accessory accessory);
    void addHP(int hp); // Method to add HP to the character
    void addMana(int mana); // Method to add Mana to the character
    void addAttackSpeed(int attackSpeed); // Method to add Attack Speed to the character
    void addArmor(int armor); // Method to add Armor to the character
    void setMana(int mana);
    void setCurrentHP(int currentHP);
  }

 -Warrior Interface (Implementing RPGCharacter)

  public interface Warrior extends RPGCharacter {
    // Warrior-specific abilities
    void useSlashAttack();
    void useDefend();
  }

-Mage Interface (Implementing RPGCharacter)

public interface Mage extends RPGCharacter {
    // Mage-specific abilities
    void castSpell(String spell);
    void meditate();
  }

 -Accessory Interface

  public interface Accessory {
    // Get accessory name
    String getName();
    // Apply accessory effects
    void applyEffect(RPGCharacter character);
    void addHP(RPGCharacter character, int hpBonus);
    void addMana(RPGCharacter character, int manaBonus);
    void addAttackSpeed(RPGCharacter character, int attackSpeedBonus);
    void addArmor(RPGCharacter character, int armorBonus);
  }

  -Gauntlet Class (Implementing Accessory)

  public class Gauntlet implements Accessory {
    private String name;
    private int strengthBonus;
    private int hpBonus;
    public Gauntlet(String name, int strengthBonus, int hpBonus) {
        this.name = name;
        this.strengthBonus = strengthBonus;
        this.hpBonus = hpBonus;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void applyEffect(RPGCharacter character) {
        // Apply strength bonus to the character's attack
        int currentAttack = character.getAttack();
        int newAttack = currentAttack + strengthBonus;
        character.setAttack(newAttack);
        // Apply HP bonus to the character
        addHP(character, hpBonus);
    }
    @Override
    public void addHP(RPGCharacter character, int hpBonus) {
        int currentHP = character.getCurrentHP();
        int newHP = currentHP + hpBonus;
        character.setCurrentHP(newHP);  
    }  
  }

  -Ring Class (Implementing Accessory)

    public class Ring implements Accessory {
    private String name;
    private int intelligenceBonus;
    private int manaBonus;
    public Ring(String name, int intelligenceBonus, int manaBonus) {
        this.name = name;
        this.intelligenceBonus = intelligenceBonus;
        this.manaBonus = manaBonus;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void applyEffect(RPGCharacter character) {
        // Apply intelligence bonus to the character's intelligence
        int currentIntelligence = character.getIntelligence();
        int newIntelligence = currentIntelligence + intelligenceBonus;
        character.setIntelligence(newIntelligence);
        // Apply mana bonus to the character
        addMana(character, manaBonus);
    }
    @Override
    public void addMana(RPGCharacter character, int manaBonus) {
        int currentMana = character.getMana();
        int newMana = currentMana + manaBonus;
        character.setMana(newMana);  
    }

    
