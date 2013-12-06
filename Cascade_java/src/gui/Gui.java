package gui;

import java.awt.Frame;

import jp.vdmtools.VDM.CGException;

public class Gui {

	/**
	 * @param args
	 * @throws CGException 
	 */
	public static void main(String[] args) throws CGException {
		System.out.println("Here");
		Frame f = new CascadeFrame();
		System.out.println("Here");
        f.setVisible(true);
	}

}
