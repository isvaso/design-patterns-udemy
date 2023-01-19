package com.isvaso.proxy.protectionproxymy;

public class SkateboardFirst implements TrickBoard {

    private Skateboarder skateboarder;

    public SkateboardFirst(Skateboarder skateboarder) {
        this.skateboarder = skateboarder;
    }

    @Override
    public void doKickflip() {
        System.out.println("Kickflip");
    }
}
