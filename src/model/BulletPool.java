package model;

import model.Bullet;

public class BulletPool extends MemoryPool<Bullet> {
    @Override
    protected Bullet allocate() {
        return new Bullet();
    }
}
