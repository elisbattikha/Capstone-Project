package edu.gcccd.csis;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Finds the largest file using DFS.
 */
public class Finder {

    /**
     * If no start location is given, the we start the search in the current dir
     *
     * @param args {@link String}[] start location for the largest file search.
     */
    public static void main(final String[] args) {
        final Path path = Paths.get(args.length < 1 ? "." : args[0]);
        final File ex = findExtremeFile(path);
        System.out.printf("Starting at : %s, the largest file was found here:\n%s\n its size is: %d\n",
                path.toAbsolutePath().toString(),
                ex.getAbsolutePath(),
                ex.length());
    }

    /**
     * Identifies the more extreem of two given files.
     * Modifying this method allows to search for other extreems, like smallest, oldest, etc.
     *
     * @param f1 {@link File} 1st file
     * @param f2 {@link File} 2nd file
     * @return {@link File} the more extreme of the two given files.
     */
    static File extreme(final File f1, final File f2) {
        // ...
    }

    /**
     * DFS for the most extreme file, starting the search at a given directory path.
     *
     * @param p {@link Path} path to a directory
     * @return {@link File} most extreme file in the given path
     */
    static File findExtremeFile(final Path p) {
        File x = null;
        final File[] fa = p.toFile().listFiles();
        if (fa != null) { // if null then directory is probably not accessible
            //
            // Since this is DFS, first find all sub-directories in the current directory
            //

                ..
            //
            // Now let's look at al the files in the current dir
            //
                ..
        }
        return x;
    }
}
