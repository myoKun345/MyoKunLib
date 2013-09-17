/**
 * MyoKunLib
 *
 * StringUtils.scala
 *
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
package myokun.lib.util;

public class StringUtilities {
    
    /**
     * Just a method that finds the index of the first uppercase character in a string.
     * @param string - The string
     * @return the index of the first uppercase letter
     */
    public static int firstIndexOfUppercase(String string) {
        
        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))) {
                return i;
            }
        }
        return -1;
        
    }
    
}