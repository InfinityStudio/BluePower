package net.quetzi.bluepower.tileentities.tier1;

import net.minecraft.tileentity.TileEntity;

public class TileWindmill extends TileEntity {

	
	public int turbineTick;
	public TileWindmill(){
		
		turbineTick = 0;
	}
	
	@Override
	public void updateEntity() {
		if(worldObj.isRemote){
			
			turbineTick++;
		}
	}
}
