/**
 * MyoKunLib
 *
 * Render.java
 *
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
package myokun.lib.gui;

import net.minecraft.client.renderer.Tessellator;

public class Render {
	
	public void drawTexturedModalRect(int x, int y, int u, int v, int width, int height) {
        Tessellator TESLR = Tessellator.instance;
        TESLR.startDrawingQuads();
        TESLR.addVertexWithUV((double)(x + 0), (double)(y + height), (double)0, (double)((float)(u + 0) * 1), (double)((float)(v + height) * 1));
        TESLR.addVertexWithUV((double)(x + width), (double)(y + height), (double)0, (double)((float)(u + width) * 1), (double)((float)(v + height) * 1));
        TESLR.addVertexWithUV((double)(x + width), (double)(y + 0), (double)0, (double)((float)(u + width) * 1), (double)((float)(v + 0) * 1));
        TESLR.addVertexWithUV((double)(x + 0), (double)(y + 0), (double)0, (double)((float)(u + 0) * 1), (double)((float)(v + 0) * 1));
        TESLR.draw();
    }
	
}
