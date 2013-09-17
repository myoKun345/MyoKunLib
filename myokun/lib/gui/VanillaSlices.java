/**
 * MyoKunLib
 *
 * VanillaSlices.java
 *
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
package myokun.lib.gui;

import net.minecraft.util.ResourceLocation;

public class VanillaSlices {
	
	public static Slice vanillaSlice;
	
	public static void initSlices() {
		vanillaSlice = new Slice(new ResourceLocation("mkl", "textures/slices/vanilla.png"));
	}
	
}
