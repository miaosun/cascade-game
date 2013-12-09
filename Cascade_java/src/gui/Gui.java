package gui;

import java.awt.Frame;

import jp.vdmtools.VDM.CGException;

public class Gui {

	/**
	 * @param args
	 * @throws CGException 
	 */
	public static void main(String[] args) throws CGException {
		Frame f = new CascadeFrame();
        f.setVisible(true);
	}

}
