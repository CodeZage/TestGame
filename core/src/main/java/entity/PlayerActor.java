package main.java.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;


public class PlayerActor extends Actor {

    TextureAtlas.AtlasRegion sprite = atlas.findRegion("player/DudeGuy");

    public PlayerActor(SpriteBatch c_batch, TextureAtlas c_atlas) {
        super(c_batch, c_atlas);
        xPosition = 100;
        yPosition = 100;
    }

    @Override
    public void update() {
        batch.draw(sprite, xPosition, yPosition);
        this.detectInput();
    }

    private void detectInput() {
        if (Gdx.input.isKeyPressed(Input.Keys.W)) {
            yPosition += 1;
        }

        if (Gdx.input.isKeyPressed(Input.Keys.A)) {
            xPosition -= 1;
        }

        if (Gdx.input.isKeyPressed(Input.Keys.S)) {
            yPosition -= 1;
        }

        if (Gdx.input.isKeyPressed(Input.Keys.D)) {
            xPosition += 1;
        }
    }
}