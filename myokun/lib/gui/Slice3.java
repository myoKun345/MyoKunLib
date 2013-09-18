/**
 * MyoKunLib
 *
 * Slice3.java
 *
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
package myokun.lib.gui;

import net.minecraft.util.ResourceLocation;

public class Slice3 {
	
	private ResourceLocation tex;
	private Slice[] slices = new Slice[3];
	
	/**
	 * A 3-slice element.
	 * @param texture - The resource location of the slice texture
	 * @param s... - The slices
	 */
	public Slice3(ResourceLocation texture, 
			Slice s0, Slice s1, Slice s2) {
		this.tex = texture;
		this.slices[0] = s0;
		this.slices[1] = s1;
		this.slices[2] = s2;
	}
	
	public ResourceLocation getTexture() {return this.tex;}
	
	public Slice getSlice(int index) {return this.slices[index];}
	
}
