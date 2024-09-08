package PACKAGE_NAME;

public class EnhancePlayer {
  private String fullname;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String fullname) {
//        this.name = name;
        this(fullname, 100, "Sword");
    }

    public EnhancedPlayer(String fullname, int healthPercentage, String weapon) {
        this.fullname = fullname;
//        this.health = health;
        if (healthPercentage <= 0 ) {
            this.healthPercentage = 1;
        }else if (healthPercentage > 100){
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = healthPercentage;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        healthPercentage -= damage;
        if(healthPercentage <= 0){
            System.out.println("Player knocked out of the game");
        }
    }

    public int healthRemaining(){
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth){
        healthPercentage += extraHealth;
        if(healthPercentage > 100){
            System.out.println("Player restored to 100%");
            healthPercentage = 100;
        }

    }
}
