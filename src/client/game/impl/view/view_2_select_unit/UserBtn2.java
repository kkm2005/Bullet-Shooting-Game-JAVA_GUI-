package client.game.impl.view.view_2_select_unit;

import client.game.Command;
import client.game.Model;
import client.game.Projector;
import client.game.common.ImageUrl;
import client.game.common.Location;
import client.game.common.Size;
import client.game.impl.view.AbstractButton;
import client.game.impl.view.ViewFactory;


class UserBtn2 extends AbstractButton {

	public UserBtn2() {
		setX(Location.SELECT_CARD_SECOND_X);
		setY(Location.SELECT_CARD_Y);
		setWidth(Size.SELECT_CARD_W);
		setHeight(Size.SELECT_CARD_H);
		setImage(getImage(ImageUrl.SECOND_USER_CARD));
	}
	
	@Override
	public void focus() {
		setImage(getImage(ImageUrl.SECOND_USER_CARD_SELECTED));
	}

	@Override
	public void unfocus() {
		setImage(getImage(ImageUrl.SECOND_USER_CARD));
	}
	@Override
	public void doAction(Model model) {
		model.addCommand(new SelectUserCommand());
	}
	
	private static class SelectUserCommand implements Command {
		@Override
		public void execute(Projector projector, Model model) {
			projector.showInGame(ViewFactory.getUser2(), model);
		}
	}
}
