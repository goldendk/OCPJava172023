package chapter21;

import java.net.URI;
import java.nio.file.*;

public class IOPathMain {
    public static void main(String... args) {
        FileSystem fileSystem = FileSystems.getFileSystem(URI.create("file:///"));
        System.out.println(fileSystem);
        System.out.println(fileSystem.getFileStores());

        FileSystem aDefault = FileSystems.getDefault();

        Path path = Paths.get("c:\\temp", "t.txt");
        System.out.println(path.toFile().getAbsolutePath());
        System.out.println(path.toFile().exists());

        System.out.println("Root: " + path.getRoot().toFile().getAbsolutePath());
        System.out.println("name index 1: "+ path.getName(1));
        System.out.println("name index 0: "+ path.getName(0));

        Path of = Path.of("c:\\temp\\t.txt");
        System.out.println(of.toFile().exists());

        Path relative = Path.of("foo", "bar");
        System.out.println(relative.toAbsolutePath() + " just adds relative to working directory when setting to absolute.");

        Path resolve = of.resolve(relative);
        System.out.println(resolve);

        Path path1 = resolve.resolveSibling(relative);
        System.out.println("resolveSibling: " + path1);

        Path of1 = Path.of("c:\\temp\\..\\.\\temp\\..\\temp\\t.txt");
        System.out.println(of1);
        System.out.println(of1.normalize());
        boolean exists = Files.exists(of1);
        System.out.println(exists);
        boolean notExists = Files.notExists(relative);
        System.out.println(notExists);
        URI.create("foo");

        Path of2 = Path.of("./document", "../book/../chapter1");
        Path of3 = Path.of("./document", "../book/../chapter1").toAbsolutePath();

        System.out.println(of2.normalize());
        System.out.println(of3.normalize());
    }
}
