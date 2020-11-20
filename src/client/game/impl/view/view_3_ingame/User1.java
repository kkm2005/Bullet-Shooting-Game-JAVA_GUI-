package client.game.impl.view.view_3_ingame;

import client.game.common.ImageUrl;

class User1 extends AbstractUser{

	@Override
	protected void setSpeed() {
		this.speed = 1;
	}

	@Override
	protected void setBulletType() {
		this.bulletType = BulletType.UserBullet1;
	}

	@Override
	protected void setImg() {
		this.img = getImage(ImageUrl.USER1);
	}
}