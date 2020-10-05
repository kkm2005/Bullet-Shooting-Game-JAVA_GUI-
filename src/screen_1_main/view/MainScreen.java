package screen_1_main.view;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.ImageObserver;

import interfaces.element.Elements;
import interfaces.element.ElementsFactory;
import interfaces.screen.KeyHandler;
import interfaces.screen.KeyHandlerFactory;
import interfaces.screen.Screen;

public class MainScreen implements Screen{
	Elements elements = ElementsFactory.forMain();
	KeyHandler focusHandler = KeyHandlerFactory.getHandlerToMain(elements);
	
	@Override
	public void paint(Graphics2D g2d,ImageObserver imageObserver) {
		elements.allPaint(g2d, imageObserver);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		focusHandler.keyPressed(e);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		focusHandler.keyReleased(e);
	}


}
