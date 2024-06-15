package ru.klimov.java.course.work_with_file;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileTree2 {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("C:\\Users\\Medved\\Desktop\\result");
        Path target = Paths.get("C:\\Users\\Medved\\Desktop\\target4");
        if (!Files.exists(target)) {
            Files.createDirectory(target);
        }
        Files.walkFileTree(source, new FileVisitorTarget(source, target));
    }
}

class FileVisitorTarget extends SimpleFileVisitor<Path> {
    Path source;
    Path target;

    public FileVisitorTarget(Path source, Path target) {
        this.source = source;
        this.target = target;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newTarget = target.resolve(file.getFileName());
        Files.copy(file, newTarget, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }
}
