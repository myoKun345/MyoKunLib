/**
 * MyoKunLib
 *
 * LogHelper.java
 *
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
package myokun.lib.util;

import java.util.logging.Level;
import java.util.logging.Logger;

import cpw.mods.fml.common.FMLLog;

public class LogHelper {
	
	private static Logger logger = Logger.getLogger("MyoKunLib");
	
	public static void init() {
		logger.setParent(FMLLog.getLogger());
	}
	
	public static void log(Level level, String msg) {
		logger.log(level, msg);
	}
	
}
