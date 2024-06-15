package ru.klimov.java.course.work_with_file;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileTree {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("C:\\Users\\Medved\\Desktop\\result");
        Path target = Paths.get("C:\\Users\\Medved\\Desktop\\copyHere");
        if (!Files.exists(target)) {
            Files.createFile(target);
        }
        Files.walkFileTree(source, new MyVisitor2(source, target));
    }
}

class MyVisitor2 extends SimpleFileVisitor<Path> {
    Path source;
    Path target;

    public MyVisitor2(Path source, Path target) {
        this.source = source;
        this.target = target;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Path newTarget = target.resolve(source.relativize(dir));
        Files.copy(dir, newTarget, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newTarget = target.resolve(source.relativize(file));
        Files.copy(file, newTarget, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }
}
