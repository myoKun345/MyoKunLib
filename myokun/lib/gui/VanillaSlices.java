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
	
	public static Slice9 vanillaSlice;
	
	public static void initSlices() {
		vanillaSlice = new Slice9(new ResourceLocation("mkl", "textures/slices/vanilla.png"),
				new Slice(new Coordinate(0, 0), 4, 4), new Slice(new Coordinate(5, 0), 1, 4), new Slice(new Coordinate(7, 0), 4, 4),
				new Slice(new Coordinate(0, 5), 4, 1), new Slice(new Coordinate(5, 5), 1, 1), new Slice(new Coordinate(7, 5), 4, 1),
				new Slice(new Coordinate(0, 7), 4, 4), new Slice(new Coordinate(5, 7), 1, 4), new Slice(new Coordinate(7, 7), 4, 4));
	}
	
}
