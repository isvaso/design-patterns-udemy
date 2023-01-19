package com.isvaso.chainofresponsibility.brokerchain;

public class DoubleAttackModifier extends CreatureModifier implements AutoCloseable {

    private final int token;

    public DoubleAttackModifier(Game game, Creature creature) {
        super(game, creature);
        System.out.println("Double attack");
        token = game.queries.subscribe(q -> {
            if (q.creatureName.equals(creature.name)
            && q.argument == Query.Argument.ATTACK) {
                q.result *= 2;
            }
        });
    }

    @Override
    public void close() /*throws Exception*/ {
        game.queries.unsubscribe(token);
    }
}
