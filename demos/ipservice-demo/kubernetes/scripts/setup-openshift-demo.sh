#!/bin/sh

minishift config set vm-driver virtualbox
minishift config set memory 4096
minishift config set cpus 2
minishift addons install --defaults
minishift addons enable admin-user

minishift start
eval $(minishift docker-env)
eval $(minishift oc-env)

oc login -u admin

oc policy add-role-to-user cluster-reader system:serviceaccount:$(oc project -q):default
oc policy add-role-to-user view system:serviceaccount:$(oc project -q):turbine
oc policy add-role-to-user view system:serviceaccount:$(oc project -q):name-client-service

oc login -u developer