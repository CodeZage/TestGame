package main.java.entity;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public abstract class Actor {
    protected SpriteBatch batch;
    protected TextureAtlas atlas;

    protected int xPosition, yPosition;

    protected float maxSpeed, acceleration, deacceleration;

    public Actor(SpriteBatch c_batch, TextureAtlas c_atlas) {
        batch = c_batch;
        atlas = c_atlas;
    }

    public abstract void update();
}

