/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicClass.Trickster;

import BasicClass.BasicClass;

/**
 *
 * @author Kevin
 */
public class Reaper extends BasicClass
{
    private final String NAME = "Reaper";
    public Reaper(){}
    
    @Override
    public String getName()
    {
        return NAME;
    }
    @Override
    public int weaponCalculator(int[] weapon)
    {
        int value = 50 * GOLD;
        return value;
    }
    @Override
    public int ringCalculator(int[] ring)
    {
        int value = 50 * GOLD;
        return value;
    }
    @Override
    public int necklaceCalculator(int[] necklace)
    {
        int value = 50 * GOLD;
        return value;
    }
    @Override
    public int helmetCalculator(int[] helmet)
    {
        int value = 50 * GOLD;
        return value;
    }
    @Override
    public int armorCalculator(int[] armor)
    {
        int value = 50 * GOLD;
        return value;
    }
    @Override
    public int pantsCalculator(int[] pants)
    {
        int value = 50 * GOLD;
        return value;
    }
    @Override
    public int bootsCalculator(int[] boots)
    {
        int value = 50 * GOLD;
        return value;
    }
}
