package com.isvaso.adapter.adaptercaching;

import com.isvaso.logger.ProjectLogger;

import java.util.*;
import java.util.function.Consumer;
import java.util.logging.Level;

public class LineToPointAdapter implements Iterable<Point> {

    private static int count = 0;
    private static Map<Integer, List<Point>> cache = new HashMap<>();
    private int hash;

    private final ProjectLogger LOGGER
            = ProjectLogger.getLogger(this.getClass().getName());

    public LineToPointAdapter(Line line) {
        LOGGER.log(Level.INFO, "Constructor");

        hash = line.hashCode();

        if (cache.get(hash) != null) // we already have it
            return;

        System.out.println(
                String.format("%d: Generating point for line [%d, %d]-[%d, %d] (with caching)",
                        ++count, line.start.x, line.start.y, line.end.x, line.end.y)
        );

        ArrayList<Point> points = new ArrayList<>();

        int left = Math.min(line.start.x, line.end.x);
        int right = Math.max(line.start.x, line.end.x);
        int top = Math.min(line.start.y, line.end.y);
        int bottom = Math.max(line.start.y, line.end.y);
        int dx = right - left;
        int dy = line.end.y - line.start.y;

        if (dx == 0)
        {
            for (int y = top; y <= bottom; ++y)
            {
                points.add(new Point(left, y));
            }
        }
        else if (dy == 0)
        {
            for (int x = left; x <= right; ++x)
            {
                points.add(new Point(x, top));
            }
        }

        cache.put(hash, points);
    }

    // now all works from points in cache not for points in Adapter.
    // Therefore we need to implement Iterable<Point>
    // and @Override methods relatively cache Map.

    @Override
    public Iterator<Point> iterator() {
        LOGGER.log(Level.INFO, "iterator()");
        return cache.get(hash).iterator();
    }

    @Override
    public void forEach(Consumer<? super Point> action) {
        LOGGER.log(Level.INFO, "forEach()");
        cache.get(hash).forEach(action);
    }

    @Override
    public Spliterator<Point> spliterator() {
        LOGGER.log(Level.INFO, "spliterator()");
        return cache.get(hash).spliterator();
    }
}
