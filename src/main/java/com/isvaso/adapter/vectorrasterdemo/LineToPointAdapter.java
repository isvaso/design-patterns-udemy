package com.isvaso.adapter.vectorrasterdemo;

import com.isvaso.logger.ProjectLogger;

import java.util.ArrayList;
import java.util.logging.Level;

public class LineToPointAdapter extends ArrayList<Point> {

    private static int count = 0;

    private final ProjectLogger LOGGER
            = ProjectLogger.getLogger(this.getClass().getName());

    public LineToPointAdapter(Line line) {
        LOGGER.log(Level.INFO, "LineToPointAdapter()");

        System.out.println(
                String.format("%d: Generating point for line [%d, %d]-[%d, %d] (no caching)",
                        ++count, line.start.x, line.start.y, line.end.x, line.end.y)
        );

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
                add(new Point(left, y));
            }
        }
        else if (dy == 0)
        {
            for (int x = left; x <= right; ++x)
            {
                add(new Point(x, top));
            }
        }
    }
}
