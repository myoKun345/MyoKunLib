/**
 * MyoKunLib
 *
 * MyoKunLibModContainer.java
 *
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
package myokun.lib;

import myokun.lib.gui.VanillaSlices;
import myokun.lib.util.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "MyoKunLib", name = "MyoKunLib", version = "1.0.01.@@BUILD@@")
@NetworkMod(channels = {"mkl"}, clientSideRequired = true, serverSideRequired = false)
public class MyoKunLibModContainer {
	
	@Instance("MyoKunLib")
	public static MyoKunLibModContainer instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		LogHelper.init();
		VanillaSlices.initSlices();
		
	}
	
}
