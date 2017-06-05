package com.capgemini.demos.ms.ipservice.eureka;

class IPAddress {
    private final long id;
    private final String ipAddress;
    private String message;

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
