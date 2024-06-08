package ru.klimov.java.course.work_with_file;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class ChannelBufferEx1 {
    public static void main(String[] args) throws IOException {
        try (RandomAccessFile file = new RandomAccessFile("text.txt", "rw");
             FileChannel channel = file.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder text = new StringBuilder();

            int count = 0;
            int read = channel.read(buffer);
            while (read > 0) {
                System.out.println("Count " + count + " Read: " + read);
                buffer.flip();
                count++;
                Charset cs = StandardCharsets.UTF_8;
                while (buffer.hasRemaining()) {
                    CharBuffer decode = cs.decode(buffer);
                    text.append(decode);
                }
                buffer.clear();
                read = channel.read(buffer);
            }
            System.out.println(text);

            String text2 = "\n\nПортрет\n\nС своей пылающей душой,\n" +
                    "С своими бурными страстями,\n" +
                    "О жены Севера, меж вами\n" +
                    "Она является порой\n" +
                    "И мимо всех условий света\n" +
                    "Стремится до утраты сил,\n" +
                    "Как беззаконная комета\n" +
                    "В кругу расчисленном светил.";
            ByteBuffer buffer2 = ByteBuffer.wrap(text2.getBytes(StandardCharsets.UTF_8));
            channel.write(buffer2);
//            ByteBuffer buffer2 = ByteBuffer.allocate(text2.getBytes().length);
//            buffer2.put(text2.getBytes(StandardCharsets.UTF_8));
//            buffer2.flip();
//            channel.write(buffer2);
        }
    }
}
