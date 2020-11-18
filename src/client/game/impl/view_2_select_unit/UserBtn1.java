package client.game.impl.view_2_select_unit;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;

import client.game.Button;
import client.game.Model;
import client.game.impl.common.ImageUrl;
import client.game.impl.common.Location;
import client.game.impl.common.Size;


class UserBtn1 implements Button{
	
	private int x = Location.SELECT_CARD_FIRST_X;
	private int y = Location.SELECT_CARD_Y;
	private int w= Size.SELECT_CARD_W;
	private int h = Size.SELECT_CARD_H;
	private Image img = Toolkit.getDefaultToolkit().getImage(ImageUrl.FIRST_USER_CARD);
	private String action = "SELECT_USER_1";
	
	@Override
	public boolean paint(Graphics2D g2d, ImageObserver imageObserver) {
		Toolkit.getDefaultToolkit().prepareImage(img, -1, -1, imageObserver);
		if(g2d.drawImage(img, x, y, w, h,imageObserver))
			return true;
		return false;
	}

	@Override
	public void focus() {
		img = Toolkit.getDefaultToolkit().getImage(ImageUrl.FIRST_USER_CARD_SELECTED);
	}

	@Override
	public void unfocus() {
		img = Toolkit.getDefaultToolkit().getImage(ImageUrl.FIRST_USER_CARD);
	}

	@Override
	public void doAction(Model model) {
		model.addCommand(action);
	}

}