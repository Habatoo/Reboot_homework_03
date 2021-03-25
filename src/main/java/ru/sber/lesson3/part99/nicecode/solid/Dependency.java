package ru.sber.lesson3.part99.nicecode.solid;

import ru.sber.lesson3.part99.nicecode.solid.ip.Ip;

public class Dependency {
}

class Http{
    private Ip ip;
    public void sendData(String data){
        ip.sendRawData(data.getBytes());
    }
}
