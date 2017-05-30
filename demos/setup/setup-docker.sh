#!/bin/sh

curl -L https://github.com/docker/machine/releases/download/v0.11.0/docker-machine-`uname -s`-`uname -m` >/tmp/docker-machine && \
  chmod +x /tmp/docker-machine && \
  sudo cp /tmp/docker-machine /usr/local/bin/docker-machine

curl -L https://github.com/docker/compose/releases/download/1.13.0/docker-compose-`uname -s`-`uname -m` > /tmp/docker-compose && \
  chmod +x /tmp/docker-compose && \
  sudo cp /tmp/docker-compose /usr/local/bin/docker-compose
