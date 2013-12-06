package logic;

import gui.CascadeFrame;

import jp.vdmtools.VDM.CGException;

public class LineInserter  implements Runnable {
	Cascade game;
	CascadeFrame frame;
	int level = 1;
	
	public LineInserter(Cascade c, CascadeFrame f){
		game = c;
		frame = f;
	}
	
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Done waiting...");
			try {
				game.board.insertNewLine();
			} catch (CGException e) {
				e.printStackTrace();
			}
			System.out.println("Inserted line");
			frame.update();
		}
	}

}
