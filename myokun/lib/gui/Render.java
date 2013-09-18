/**
 * MyoKunLib
 *
 * Render.java
 *
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
package myokun.lib.gui;

import java.util.logging.Level;

import myokun.lib.util.LogHelper;
import net.minecraft.client.renderer.Tessellator;

public class Render {
	
	public static void drawTexturedModalRect(int par1, int par2, int par3, int par4, int par5, int par6) {
		LogHelper.log(Level.INFO, "Drawing");
        Tessellator TESLR = Tessellator.instance;
        TESLR.startDrawingQuads();
        TESLR.addVertexWithUV((double)(par1 + 0), (double)(par2 + par6), (double)0.5F, (double)((float)(par3 + 0) * 0.5F), (double)((float)(par4 + par6) * 0.5F));
        TESLR.addVertexWithUV((double)(par1 + par5), (double)(par2 + par6), (double)0.5F, (double)((float)(par3 + par5) * 0.5F), (double)((float)(par4 + par6) * 0.5F));
        TESLR.addVertexWithUV((double)(par1 + par5), (double)(par2 + 0), (double)0.5F, (double)((float)(par3 + par5) * 0.5F), (double)((float)(par4 + 0) * 0.5F));
        TESLR.addVertexWithUV((double)(par1 + 0), (double)(par2 + 0), (double)0.5F, (double)((float)(par3 + 0) * 0.5F), (double)((float)(par4 + 0) * 0.5F));
        TESLR.draw();
    }
	
}
