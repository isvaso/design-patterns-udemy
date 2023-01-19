package com.isvaso.bridge.vectorrasteradaptercaching;

import com.google.inject.AbstractModule;

public class ShapeModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Renderer.class).to(RasterRenderer.class);
    }
}
