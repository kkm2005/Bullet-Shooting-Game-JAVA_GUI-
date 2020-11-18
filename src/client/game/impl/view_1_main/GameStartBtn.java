package client.game.impl.view_1_main;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;

import client.game.Button;
import client.game.Model;
import client.game.impl.common.ImageUrl;
import client.game.impl.common.Size;

class GameStartBtn implements Button {
	private int x = Size.FRAME_W/8 * 3;
	private int y = Size.FRAME_H/6 + 200;
	private int w = Size.FRAME_W/4;
	private int h = Size.FRAME_H/10;
	private Image img = Toolkit.getDefaultToolkit().getImage(ImageUrl.START_BUTTON);
	private String action = "GAME_START";
	
	@Override
	public boolean paint(Graphics2D g2d, ImageObserver imageObserver) {
		Toolkit.getDefaultToolkit().prepareImage(img, -1, -1, imageObserver);
		if(g2d.drawImage(img,x,y,w,h,imageObserver))
			return true;
		return false;
	}   

	@Override
	public void focus() {
		img = Toolkit.getDefaultToolkit().getImage(ImageUrl.START_BUTTON_SELECTED);
	}
	@Override
	public void unfocus() {
		img = Toolkit.getDefaultToolkit().getImage(ImageUrl.START_BUTTON);
	}

	@Override
	public void doAction(Model model) {
		model.addCommand(action);
	}
	
}