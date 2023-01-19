package com.isvaso.chainofresponsibility.brokerchain;

public class IncreaseDefenceModifier extends CreatureModifier {

    public IncreaseDefenceModifier(Game game, Creature creature) {
        super(game, creature);
        System.out.println("Increase defence");
        game.queries.subscribe(q -> {
            if (q.creatureName.equals(creature.name)
                    && q.argument == Query.Argument.DEFENCE) {
                q.result += 3;
            }
        });
    }
}
