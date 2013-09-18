/**
 * MyoKunLib
 *
 * Slice9.java
 *
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
package myokun.lib.gui;

import net.minecraft.util.ResourceLocation;

public class Slice9 {
	
	private ResourceLocation tex;
	private Slice[] slices = new Slice[9];
	
	/**
	 * A 9-slice element.
	 * @param texture - The resource location of the slice texture
	 * @param s... - The slices
	 */
	public Slice9(ResourceLocation texture, 
			Slice s0, Slice s1, Slice s2,
			Slice s3, Slice s4, Slice s5,
			Slice s6, Slice s7, Slice s8) {
		this.tex = texture;
		this.slices[0] = s0;
		this.slices[1] = s1;
		this.slices[2] = s2;
		this.slices[3] = s3;
		this.slices[4] = s4;
		this.slices[5] = s5;
		this.slices[6] = s6;
		this.slices[7] = s7;
		this.slices[8] = s8;
	}
	
	public ResourceLocation getTexture() {return this.tex;}
	
	public Slice getSlice(int index) {return this.slices[index];}
	
}
