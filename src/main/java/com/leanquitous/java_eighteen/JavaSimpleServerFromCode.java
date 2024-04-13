package com.leanquitous.java_eighteen;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.SimpleFileServer;

import java.net.InetSocketAddress;
import java.nio.file.Path;

public class JavaSimpleServerFromCode {

    public static void main(String[] args) {
        System.out.println(Path.of("/00-FL").toAbsolutePath().toString());
        HttpServer httpServer = SimpleFileServer.createFileServer(
                new InetSocketAddress(8081), Path.of("/00-FL").toAbsolutePath(), SimpleFileServer.OutputLevel.INFO);
        httpServer.start();


    }

}
