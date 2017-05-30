#!/bin/sh

curl -L https://github.com/kubernetes/minikube/releases/download/v0.19.0/minikube-linux-amd64 >/tmp/minikube && \
  chmod +x /tmp/minikube && \
  sudo cp /tmp/minikube /usr/local/bin/minikube

curl -L https://github.com/minishift/minishift/releases/download/v1.0.1/minishift-1.0.1-linux-amd64.tgz >/tmp/minishift.tgz && \
  tar xvf /tmp/minishift.tgz -C /tmp/
  chmod +x /tmp/minishift && \
  sudo cp /tmp/minishift /usr/local/bin/minishift