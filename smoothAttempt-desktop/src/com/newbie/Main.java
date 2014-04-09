package com.newbie;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "smoothAttempt";
		cfg.useGL20 = false;
		cfg.vSyncEnabled = true;
		cfg.width = 800;
		cfg.height = 600;
		//cfg.fullscreen = true; // much better when full screen, but still not fully smooth :-(
		
		new LwjglApplication(new SmoothAttempt(), cfg);
	}
}
