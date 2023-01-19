package com.isvaso.solid.singleresponsibilityprinciple;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * SRP states is that a class should have just a single reason to change.
 * In other words, a single class should have one primary responsibility instead of taking on lots and lots of different responsibilities.
 * <p></p>
 * If you take on lots of responsibilities, you end up with something called a God object, which is an anti pattern,
 * the opposite of a pattern, something that you shouldn't be doing in your code.
 */

public class Main {

    public static void main(String[] args) throws IOException {

        Journal journal = new Journal();

        journal.addEntry("I cried today");
        journal.addEntry("I ate a bug");
        System.out.println(journal);

        Persistence persistence = new Persistence();
        String filename = "journal.txt";
        persistence.saveToFile(journal, filename, true);

        Desktop.getDesktop().open(new File(filename));
    }

}
