/**
 * MyoKunLib
 *
 * Slice.java
 *
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
package myokun.lib.gui;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.logging.Level;

import javax.imageio.ImageIO;

import myokun.lib.util.LogHelper;
import net.minecraft.util.ResourceLocation;

public class Slice {
	
	public Slice(ResourceLocation texture) {
		URL url = this.getClass().getResource("/assets/" + texture.getResourceDomain() + "/" + texture.getResourcePath());
		BufferedImage sliceTexture;
		
		try {
			sliceTexture = ImageIO.read(url);
			findSections(sliceTexture);
		}
		catch (FileNotFoundException e) {
			LogHelper.log(Level.SEVERE, "Slice texture was not found!");
			System.err.println("Caught FileNotFoundException: " + e.getMessage());
			e.printStackTrace(System.err);
		}
		catch (IOException e) {
			LogHelper.log(Level.SEVERE, "Slice texture failed to be registered!");
			System.err.println("Caught IOException: " + e.getMessage());
			e.printStackTrace(System.err);
		}
	}
	
	protected void findSections(BufferedImage image) {
		LinkedList<Integer[]> greenCoords = new LinkedList<Integer[]>();
		
		if (image != null) {
			LogHelper.log(Level.INFO, "Finding sections in slice image");
			
			LogHelper.log(Level.INFO, "Width of slice image: " + image.getWidth());
			LogHelper.log(Level.INFO, "Height of slice image: " + image.getHeight());
			
			for (int x = 0; x < image.getWidth(); x++) {
				for (int y = 0; y < image.getHeight(); y++) {
					Color color = new Color(image.getRGB(x, y));

					LogHelper.log(Level.INFO, "R" + color.getRed() + " G" + color.getGreen() + " B" + color.getBlue() + " A" + color.getAlpha());
					
					if (color.getGreen() == 255 && color.getBlue() == 0 && color.getRed() == 0) {
						LogHelper.log(Level.INFO, "Found a green at " + x + "," + y);
						
						greenCoords.add(new Integer[]{x, y});
					}
					
				}
			}
			
		}
	}
	
}
