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
		Window.CreateWindow(800, 600, "Source Engine Clone");
		while(!Display.isCloseRequested()) {
			// Do rendering through the engine
			// Do game logic through the engine
			Window.UpdateWindow(60);
		}
		Window.DestroyWindow();
		System.exit(0);
	}
	
	public EngineMain() {
		
	}
}
