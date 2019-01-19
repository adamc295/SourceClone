package io.github.adamc295.Engine;

import org.lwjgl.opengl.Display;

public class EngineMain implements Runnable {
	
	public void start() {
		new Thread(this).start();
	}
	
	public static void e_main() {
		EngineMain game = new EngineMain();
		game.start();
	}
	
	public void run() {
		while(!Display.isCloseRequested()) {
			// Do rendering through the engine
			// Do game logic through the engine
			// Update
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public EngineMain() {
		
	}
}
