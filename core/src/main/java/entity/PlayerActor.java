package main.java.entity;

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
    }
}