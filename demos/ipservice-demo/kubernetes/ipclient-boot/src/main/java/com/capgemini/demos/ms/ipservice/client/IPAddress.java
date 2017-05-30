package com.capgemini.demos.ms.ipservice.client;

class IPAddress {
    private long id;
    private String ipAddress;
    private String message;

    public IPAddress() {
    }

    public IPAddress(long id, String ipAddress, String message) {
        this.id = id;
        this.ipAddress = ipAddress;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getMessage() {
        return message;
    }
}
