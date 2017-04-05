/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicClass;

/**
 *
 * @author Kevin
 */
public abstract class BasicClass
{
    private int[] stats = new int[5];
    protected final int COPPER = 1;
    protected final int SILVER = 1000;
    protected final int GOLD = 1000000;
    protected final int GEM = 100000000;
    public int newItem(String itemType, int strength, int intelligence, int endurance, 
            int dexterity, int spirit)
    {
        if (itemType.equals("Weapon"))
            return newWeapon(strength, intelligence, endurance, 
                    dexterity, spirit);
        else if (itemType.equals("Ring"))
            return newRing(strength, intelligence, endurance, 
                    dexterity, spirit);
        else if (itemType.equals("Necklace"))
            return newNecklace(strength, intelligence, endurance, 
                    dexterity, spirit);
        else if (itemType.equals("Helmet"))
            return newHelmet(strength, intelligence, endurance, 
                    dexterity, spirit);
        else if (itemType.equals("Armor"))
            return newArmor(strength, intelligence, endurance, 
                    dexterity, spirit);
        else if (itemType.equals("Pants"))
            return newPants(strength, intelligence, endurance, 
                    dexterity, spirit);
        else if (itemType.equals("Boots"))
            return newBoots(strength, intelligence, endurance, 
                    dexterity, spirit);
        else
            return 0;
    }
    public int newWeapon(int strength, int intelligence, int endurance, 
            int dexterity, int spirit)
    {
        stats[0] = strength;
        stats[1] = intelligence;
        stats[2] = endurance;
        stats[3] = dexterity;
        stats[4] = spirit;
        return weaponCalculator(stats);
    }
    public int newRing(int strength, int intelligence, int endurance, 
            int dexterity, int spirit)
    {
        stats[0] = strength;
        stats[1] = intelligence;
        stats[2] = endurance;
        stats[3] = dexterity;
        stats[4] = spirit;
        return ringCalculator(stats);
    }
    public int newNecklace(int strength, int intelligence, int endurance, 
            int dexterity, int spirit)
    {
        stats[0] = strength;
        stats[1] = intelligence;
        stats[2] = endurance;
        stats[3] = dexterity;
        stats[4] = spirit;
        return necklaceCalculator(stats);
    }
    public int newHelmet(int strength, int intelligence, int endurance, 
            int dexterity, int spirit)
    {
        stats[0] = strength;
        stats[1] = intelligence;
        stats[2] = endurance;
        stats[3] = dexterity;
        stats[4] = spirit;
        return helmetCalculator(stats);
    }
    public int newArmor(int strength, int intelligence, int endurance, 
            int dexterity, int spirit)
    {
        stats[0] = strength;
        stats[1] = intelligence;
        stats[2] = endurance;
        stats[3] = dexterity;
        stats[4] = spirit;
        return armorCalculator(stats);
    }
    public int newPants(int strength, int intelligence, int endurance, 
            int dexterity, int spirit)
    {
        stats[0] = strength;
        stats[1] = intelligence;
        stats[2] = endurance;
        stats[3] = dexterity;
        stats[4] = spirit;
        return pantsCalculator(stats);
    }
    public int newBoots(int strength, int intelligence, int endurance, 
            int dexterity, int spirit)
    {
        stats[0] = strength;
        stats[1] = intelligence;
        stats[2] = endurance;
        stats[3] = dexterity;
        stats[4] = spirit;
        return bootsCalculator(stats);
    }
    public abstract String getName();
    public abstract int weaponCalculator(int[] weapon);
    public abstract int ringCalculator(int[] ring);
    public abstract int necklaceCalculator(int[] necklace);
    public abstract int helmetCalculator(int[] helmet);
    public abstract int armorCalculator(int[] armor);
    public abstract int pantsCalculator(int[] pants);
    public abstract int bootsCalculator(int[] boots);
}
