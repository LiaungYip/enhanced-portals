package uk.co.shadeddimensions.enhancedportals.item;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import uk.co.shadeddimensions.enhancedportals.network.CommonProxy;

public class ItemPortalFrame extends ItemBlock
{
    public ItemPortalFrame(int par1)
    {
        super(par1);
        setMaxDamage(0);
        setHasSubtypes(true);        
    }
    
    @Override
    public Icon getIconFromDamage(int par1)
    {
        return CommonProxy.blockFrame.getBlockTextureFromSide(0);
    }
    
    @Override
    public int getMetadata(int par1)
    {
        return par1;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack)
    {
        int meta = stack.getItemDamage();
        String name = "unknown";

        switch (meta)
        {
            default:
            case 0:
                name = "frame";
                break;
                
            case 1:
                name = "controller";
                break;
                
            case 2:
                name = "redstone";
                break;
                
            case 3:
                name = "networkInterface";
                break;
                
            case 4:
                name = "dialDevice";
                break;
                
            case 5:
                name = "biometric";
                break;
        }

        return super.getUnlocalizedName() + "." + name;
    }
}