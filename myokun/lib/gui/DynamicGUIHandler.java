/**
 * MyoKunLib
 *
 * DynamicGUIHandler.java
 *
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
package myokun.lib.gui;

import java.util.logging.Level;

import org.lwjgl.opengl.GL11;

import myokun.lib.util.LogHelper;
import net.minecraft.client.Minecraft;

public class DynamicGUIHandler {
	
	public static void drawBackground(int guiLeft, int guiTop, int width, int height, Slice9 nineSlice) {
		Coordinate s0coord = nineSlice.getSlice(0).getTopLeft();
		Coordinate s1coord = nineSlice.getSlice(1).getTopLeft();
		Coordinate s2coord = nineSlice.getSlice(2).getTopLeft();
		Coordinate s3coord = nineSlice.getSlice(3).getTopLeft();
		Coordinate s4coord = nineSlice.getSlice(4).getTopLeft();
		Coordinate s5coord = nineSlice.getSlice(5).getTopLeft();
		Coordinate s6coord = nineSlice.getSlice(6).getTopLeft();
		Coordinate s7coord = nineSlice.getSlice(7).getTopLeft();
		Coordinate s8coord = nineSlice.getSlice(8).getTopLeft();
		
		LogHelper.log(Level.INFO, s0coord.toString());
		LogHelper.log(Level.INFO, s1coord.toString());
		LogHelper.log(Level.INFO, s2coord.toString());
		LogHelper.log(Level.INFO, s3coord.toString());
		LogHelper.log(Level.INFO, s4coord.toString());
		LogHelper.log(Level.INFO, s5coord.toString());
		LogHelper.log(Level.INFO, s6coord.toString());
		LogHelper.log(Level.INFO, s7coord.toString());
		LogHelper.log(Level.INFO, s8coord.toString());
		
		LogHelper.log(Level.INFO, "Background");
		GL11.glColor4f(1, 1, 1, 1);
		
		try {
			Minecraft.getMinecraft().renderEngine.bindTexture(nineSlice.getTexture());
			Render.drawTexturedModalRect(guiLeft, guiTop, s0coord.getX(), s0coord.getY(), nineSlice.getSlice(0).getWidth(), nineSlice.getSlice(0).getHeight());
			Render.drawTexturedModalRect(guiLeft + nineSlice.getSlice(0).getWidth(), guiTop + nineSlice.getSlice(0).getHeight(), s1coord.getX(), s1coord.getY(), nineSlice.getSlice(1).getWidth(), nineSlice.getSlice(1).getHeight());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		/*Render.drawTexturedModalRect(guiLeft, guiTop, s0coord.getX(), s0coord.getY(), nineSlice.getSlice(0).getWidth(), nineSlice.getSlice(0).getHeight());
		Render.drawTexturedModalRect(guiLeft + nineSlice.getSlice(0).getWidth(), guiTop + nineSlice.getSlice(0).getHeight(), s1coord.getX(), s1coord.getY(), nineSlice.getSlice(1).getWidth(), nineSlice.getSlice(1).getHeight());*/
	}
	
	public static void drawBackground(int guiLeft, int guiTop, int width, Slice3 threeSlice) {
		
	}
	
}
