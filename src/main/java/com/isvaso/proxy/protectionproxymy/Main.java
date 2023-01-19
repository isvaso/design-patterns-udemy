package com.isvaso.proxy.protectionproxymy;

public class Main {

    public static void main(String[] args) {
        Skateboarder skater = new Skateboarder("Tony");

        SkateboardFirst skateboard = new SkateboardFirst(skater);
        skateboard.doKickflip();

        skateboard = new SkateboardToday(skater);
        skateboard.doKickflip();
    }
}
