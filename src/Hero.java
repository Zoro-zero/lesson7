public  abstract class Hero implements HavingSuperAbility{
     public int health;
    public int damage ;

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    private String superPower;

}
