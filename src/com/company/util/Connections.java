package com.company.util;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Connections {

    Socket server;

    DataInputStream in;
    DataOutputStream out;

    public Connections(Socket server, DataInputStream in, DataOutputStream out) throws IOException {
        this.server = server;
        this.in = in;
        this.out = out;
    }

    public Connections() throws IOException{}

    public Socket getServer() {
        return server;
    }

    public void setServer(Socket server) {
        this.server = server;
    }

    public DataInputStream getIn() {
        return in;
    }

    public void setIn(DataInputStream in) {
        this.in = in;
    }

    public DataOutputStream getOut() {
        return out;
    }

    public void setOut(DataOutputStream out) {
        this.out = out;
    }
}
