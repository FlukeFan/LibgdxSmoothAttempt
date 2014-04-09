package com.newbie;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class SmoothAttempt implements ApplicationListener {
	private SpriteBatch batch;
	private Texture texture;
	private float maxX;
	private float x = 0;
	private float y;
	private float pixelsPerSecond = 180;
	
	@Override
	public void create() {		
		batch = new SpriteBatch();
		texture = new Texture(Gdx.files.internal("data/ball.png"));
		y = (Gdx.graphics.getHeight() + texture.getHeight()) / 2;
		maxX = Gdx.graphics.getWidth() - texture.getWidth();
	}

	@Override
	public void dispose() {
		batch.dispose();
		texture.dispose();
	}

	@Override
	public void render() {		
		Gdx.gl.glClearColor(0, 0, 0.1f, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		float delta = Gdx.graphics.getDeltaTime();
		x += delta * pixelsPerSecond;
		
		if (x > maxX)
			x = 0;
		
		batch.begin();
		batch.draw(texture, x, y);
		batch.end();
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
