package io.github.adamc295.Engine;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.ContextAttribs;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.PixelFormat;

public class Window {
	
	public static ContextAttribs attribs = new ContextAttribs(4, 5)
			.withForwardCompatible(true)
			.withProfileCore(true);
	
	public static void CreateWindow(int width, int height, String title) {
		Display.setResizable(false);
		Display.setTitle(title);
		try {
			Display.setDisplayMode(new DisplayMode(width, height));
			Display.create(new PixelFormat(), attribs);
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
	}
	
	public static void UpdateWindow(int fps) {
		Display.sync(fps);
		Display.update();
	}
	
	public static void DestroyWindow() {
		Display.destroy();
	}
}
