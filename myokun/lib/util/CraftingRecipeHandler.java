/**
 * MyoKunLib
 *
 * CraftingRecipeHandler.java
 *
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
package myokun.lib.util;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingRecipeHandler {
	
	/**
	 * A more disambiguous shaped recipe method. The main reason for this was that Scala was crashing all the things (All of them.) when trying to use the base Forge method.
	 * @param output - The output stack
	 * @param topRow - The top row of the grid, CANNOT BE NULL! Squeezing recipes towards the top left corner forces you to remove unnecessary empty space, so stop whining.
	 * @param midRow - The middle row of the grid. Can be null.
	 * @param botRow - The bottom row of the grid. Can be null.
	 * @param input - An array of stacks which will be the inputs.
	 * @param define - An array of characters, which you are defining with the input stacks. The lengths of these two arrays MUST be the same!
	 */
	public static void addShapedRecipe(ItemStack output, String topRow, String midRow, String botRow, ItemStack[] input, char[] define) {
		if (define.length == input.length) {
			if (topRow != null && midRow != null && botRow != null) {
				try {
					switch (define.length) {
					case 1:
						GameRegistry.addShapedRecipe(output, new Object[] {
								topRow, midRow, botRow, define[0], input[0] });
						break;
					case 2:
						GameRegistry.addShapedRecipe(output, new Object[] {
								topRow, midRow, botRow, define[0], input[0],
								define[1], input[1] });
						break;
					case 3:
						GameRegistry.addShapedRecipe(output, new Object[] {
								topRow, midRow, botRow, define[0], input[0],
								define[1], input[1], define[2], input[2] });
						break;
					case 4:
						GameRegistry.addShapedRecipe(output, new Object[] {
								topRow, midRow, botRow, define[0], input[0],
								define[1], input[1], define[2], input[2],
								define[3], input[3] });
						break;
					case 5:
						GameRegistry.addShapedRecipe(output, new Object[] {
								topRow, midRow, botRow, define[0], input[0],
								define[1], input[1], define[2], input[2],
								define[3], input[3], define[4], input[4] });
						break;
					case 6:
						GameRegistry.addShapedRecipe(output, new Object[] {
								topRow, midRow, botRow, define[0], input[0],
								define[1], input[1], define[2], input[2],
								define[3], input[3], define[4], input[4],
								define[5], input[5] });
						break;
					case 7:
						GameRegistry.addShapedRecipe(output, new Object[] {
								topRow, midRow, botRow, define[0], input[0],
								define[1], input[1], define[2], input[2],
								define[3], input[3], define[4], input[4],
								define[5], input[5], define[6], input[6] });
						break;
					case 8:
						GameRegistry.addShapedRecipe(output, new Object[] {
								topRow, midRow, botRow, define[0], input[0],
								define[1], input[1], define[2], input[2],
								define[3], input[3], define[4], input[4],
								define[5], input[5], define[6], input[6],
								define[7], input[7] });
						break;
					case 9:
						GameRegistry.addShapedRecipe(output, new Object[] {
								topRow, midRow, botRow, define[0], input[0],
								define[1], input[1], define[2], input[2],
								define[3], input[3], define[4], input[4],
								define[5], input[5], define[6], input[6],
								define[7], input[7], define[8], input[8] });
						break;
					}
				} catch (Exception e) {
					throw e;
				}
			}
			if (topRow != null && midRow != null && botRow == null) {
				try {
					switch (define.length) {
					case 1:
						GameRegistry.addShapedRecipe(output, new Object[] {
								topRow, midRow, define[0], input[0] });
						break;
					case 2:
						GameRegistry.addShapedRecipe(output, new Object[] {
								topRow, midRow, define[0], input[0],
								define[1], input[1] });
						break;
					case 3:
						GameRegistry.addShapedRecipe(output, new Object[] {
								topRow, midRow, define[0], input[0],
								define[1], input[1], define[2], input[2] });
						break;
					case 4:
						GameRegistry.addShapedRecipe(output, new Object[] {
								topRow, midRow, define[0], input[0],
								define[1], input[1], define[2], input[2],
								define[3], input[3] });
						break;
					case 5:
						GameRegistry.addShapedRecipe(output, new Object[] {
								topRow, midRow, define[0], input[0],
								define[1], input[1], define[2], input[2],
								define[3], input[3], define[4], input[4] });
						break;
					case 6:
						GameRegistry.addShapedRecipe(output, new Object[] {
								topRow, midRow, define[0], input[0],
								define[1], input[1], define[2], input[2],
								define[3], input[3], define[4], input[4],
								define[5], input[5] });
						break;
					case 7:
						GameRegistry.addShapedRecipe(output, new Object[] {
								topRow, midRow, define[0], input[0],
								define[1], input[1], define[2], input[2],
								define[3], input[3], define[4], input[4],
								define[5], input[5], define[6], input[6] });
						break;
					case 8:
						GameRegistry.addShapedRecipe(output, new Object[] {
								topRow, midRow, define[0], input[0],
								define[1], input[1], define[2], input[2],
								define[3], input[3], define[4], input[4],
								define[5], input[5], define[6], input[6],
								define[7], input[7] });
						break;
					case 9:
						GameRegistry.addShapedRecipe(output, new Object[] {
								topRow, midRow, define[0], input[0],
								define[1], input[1], define[2], input[2],
								define[3], input[3], define[4], input[4],
								define[5], input[5], define[6], input[6],
								define[7], input[7], define[8], input[8] });
						break;
					}
				} catch (Exception e) {
					throw e;
				}
			}
			if (topRow != null && midRow == null && botRow == null) {
				try {
					switch (define.length) {
					case 1:
						GameRegistry.addShapedRecipe(output, new Object[] {
								topRow, define[0], input[0] });
						break;
					case 2:
						GameRegistry.addShapedRecipe(output, new Object[] {
								topRow, define[0], input[0],
								define[1], input[1] });
						break;
					case 3:
						GameRegistry.addShapedRecipe(output, new Object[] {
								topRow, define[0], input[0],
								define[1], input[1], define[2], input[2] });
						break;
					case 4:
						GameRegistry.addShapedRecipe(output, new Object[] {
								topRow, define[0], input[0],
								define[1], input[1], define[2], input[2],
								define[3], input[3] });
						break;
					case 5:
						GameRegistry.addShapedRecipe(output, new Object[] {
								topRow, define[0], input[0],
								define[1], input[1], define[2], input[2],
								define[3], input[3], define[4], input[4] });
						break;
					case 6:
						GameRegistry.addShapedRecipe(output, new Object[] {
								topRow, define[0], input[0],
								define[1], input[1], define[2], input[2],
								define[3], input[3], define[4], input[4],
								define[5], input[5] });
						break;
					case 7:
						GameRegistry.addShapedRecipe(output, new Object[] {
								topRow, define[0], input[0],
								define[1], input[1], define[2], input[2],
								define[3], input[3], define[4], input[4],
								define[5], input[5], define[6], input[6] });
						break;
					case 8:
						GameRegistry.addShapedRecipe(output, new Object[] {
								topRow, define[0], input[0],
								define[1], input[1], define[2], input[2],
								define[3], input[3], define[4], input[4],
								define[5], input[5], define[6], input[6],
								define[7], input[7] });
						break;
					case 9:
						GameRegistry.addShapedRecipe(output, new Object[] {
								topRow, define[0], input[0],
								define[1], input[1], define[2], input[2],
								define[3], input[3], define[4], input[4],
								define[5], input[5], define[6], input[6],
								define[7], input[7], define[8], input[8] });
						break;
					}
				} catch (Exception e) {
					throw e;
				}
			}
		}
	}
	
}
