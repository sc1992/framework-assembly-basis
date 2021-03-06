package com.cmc.demo.socket.client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * UDP client.
 * @author Thomas Lee
 * @version 2017年4月21日 下午4:17:52
 */
public class UDPClient implements Client {

    private static final Logger LOG = LoggerFactory.getLogger(UDPClient.class);
    private static final String UDP_SERVER_IP = "127.0.0.1";
    private static final int UDP_SERVER_PORT = 9999;
    private static final String FIRST_MSG = "Hello, Server.";

    /** 线程间隔时间1000ms */
    public static final long THREAD_INTERNAL_TIME = 1000;

    public static void main(String[] args) {
        javaSETimer(new UDPClient());
    }

    @Override
    public void send() {
        try (DatagramSocket datagramSocket = new DatagramSocket()) {
            byte[] buffer = new byte[1024];
            buffer = FIRST_MSG.getBytes();
            DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length, new InetSocketAddress(UDP_SERVER_IP, UDP_SERVER_PORT));
            datagramSocket.send(datagramPacket);
            datagramSocket.close();
        } catch (SocketException e) {
            LOG.error(e.getMessage(), e);
        } catch (IOException e) {
            LOG.error(e.getMessage(), e);
        }
    }

    // http://batitan.iteye.com/blog/253483 
    public static void javaSETimer(final Client client) {
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            public void run() {
                client.send();
            }
        };
        timer.schedule(timerTask, new Date(), THREAD_INTERNAL_TIME);
    }

}