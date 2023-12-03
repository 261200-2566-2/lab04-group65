// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");
    }
  }
                                       
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
    void addHP(int hp);      
    void addMana(int mana);                          
    void addAttackSpeed(int attackSpeed);                                  
    void addArmor(int armor);                              
    void setMana(int mana);                                
    void setCurrentHP(int currentHP);                          
  }                                          

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
 //Warrior Interface (Implementing RPGCharacter)
                             
  public interface Warrior extends RPGCharacter {                                     
    // Warrior-specific abilities                               
    void useSlashAttack();                                          
    void useDefend();                                              
  }                                                        
                                                                  
//Mage Interface (Implementing RPGCharacter)                                                                    
                                                                
public interface Mage extends RPGCharacter {                                                    
    // Mage-specific abilities                                      
    void castSpell(String spell);                                              
    void meditate();                                                            
  }                                                              
                                                        
 //Accessory Interface                                                  
                                                            
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
                                                              
  //Gauntlet Class (Implementing Accessory)                                                                    
                                                                    
  public class Gauntlet implements Accessory {                                                
    private String name;                                                                  
    private int strengthBonus;                                                              
    private int hpBonus;                                                            
    public Gauntlet(String name, int strengthBonus, int hpBonus) {                                                                    
        this.name = name;                                                                                                  
        this.strengthBonus = strengthBonus;                                                                                      
        this.hpBonus = hpBonus;                                                                                        
    }                                                  
                                                                            
    public String getName() {                                                                                                  
        return name;                                                                                  
    }                                                                
                                                                            
    public void applyEffect(RPGCharacter character) {                                                                
        // Apply strength bonus to the character's attack                                                                                                                  
        int currentAttack = character.getAttack();                                                                                  
        int newAttack = currentAttack + strengthBonus;                                                                                                                
        character.setAttack(newAttack);                                                                              
        // Apply HP bonus to the character                                                            
        addHP(character, hpBonus);                                                        
    }                                                                      
                                                                              
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

    public String getName() {
        return name;
    }

    public void applyEffect(RPGCharacter character) {
        // Apply intelligence bonus to the character's intelligence
        int currentIntelligence = character.getIntelligence();
        int newIntelligence = currentIntelligence + intelligenceBonus;
        character.setIntelligence(newIntelligence);
        // Apply mana bonus to the character
        addMana(character, manaBonus);
    }
}
    public void addMana(RPGCharacter character, int manaBonus) {
        int currentMana = character.getMana();
        int newMana = currentMana + manaBonus;
        character.setMana(newMana);  
    }

    