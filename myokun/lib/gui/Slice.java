/**
 * MyoKunLib
 *
 * Slice.java
 *
 * @author Myo-kun
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
package myokun.lib.gui;

public class Slice {
	
	private Coordinate tl;
	private Coordinate tr;
	private Coordinate bl;
	private Coordinate br;
	
	public Slice(Coordinate origin, int width, int height) {
		this.tl = origin;
		this.tr = new Coordinate(origin.getX() + width, origin.getY());
		this.bl = new Coordinate(origin.getX(), origin.getY() + height);
		this.br = new Coordinate(origin.getX() + width, origin.getY() + height);
	}
	
	public Coordinate getTopLeft() {return this.tl;}
	public Coordinate getTopRight() {return this.tr;}
	public Coordinate getBottomLeft() {return this.bl;}
	public Coordinate getBottomRight() {return this.br;}
	
}
