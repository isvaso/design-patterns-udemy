package com.isvaso.proxy.protectionproxymy;

public class SkateboardToday extends SkateboardFirst {

    public SkateboardToday(Skateboarder skateboarder) {
        super(skateboarder);
    }

    @Override
    public void doKickflip() {
        System.out.print("New School ");
        super.doKickflip();
    }
}
