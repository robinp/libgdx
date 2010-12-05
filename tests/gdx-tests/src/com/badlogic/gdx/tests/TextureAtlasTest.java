/*
 * Copyright 2010 Mario Zechner (contact@badlogicgames.com), Nathan Sweet (admin@esotericsoftware.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

package com.badlogic.gdx.tests;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.BitmapFont;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Sprite;
import com.badlogic.gdx.graphics.SpriteBatch;
import com.badlogic.gdx.graphics.TextureAtlas;
import com.badlogic.gdx.tests.utils.GdxTest;

public class TextureAtlasTest extends GdxTest {
	SpriteBatch batch;
	Sprite badlogic, badlogicSmall, star;
	TextureAtlas atlas;
	BitmapFont font;

	public void create () {
		batch = new SpriteBatch();

		atlas = new TextureAtlas(Gdx.files.internal("data"));
		badlogic = atlas.getSprite("badlogicslice");
		badlogicSmall = atlas.getSprite("badlogicsmall");
		star = atlas.getSprite("particle-star");

		badlogic.setPosition(50, 50);
		badlogicSmall.setPosition(10, 10);
		star.setPosition(10, 70);

		font = new BitmapFont(Gdx.files.internal("data/font.fnt"), atlas.getRegion("font"), false);

		Gdx.gl.glClearColor(0, 1, 0, 1);
	}

	public void render () {
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		batch.begin();
		badlogicSmall.draw(batch);
		badlogic.draw(batch);
		badlogic.getHeight();
		star.draw(batch);
		font.draw(batch, "This font was packed!", 26, 65);
		batch.end();
	}

	public void resize (int width, int height) {
	}

	public void pause () {
	}

	public void resume () {
	}

	public void dispose () {
		atlas.dispose();
	}

	public boolean needsGL20 () {
		return false;
	}
}