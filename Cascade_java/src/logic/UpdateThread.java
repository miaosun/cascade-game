package logic;

import gui.CascadeFrame;

import jp.vdmtools.VDM.CGException;

public class UpdateThread  implements Runnable {
	Cascade game;
	CascadeFrame frame;
	int level = 1;
	
	public UpdateThread(Cascade c, CascadeFrame f){
		game = c;
		frame = f;
	}
	
	@Override
	public void run() {
		while(game.isPlayable){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			frame.update();
		}
		frame.update();
	}
}
