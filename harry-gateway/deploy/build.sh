#!/bin/bash
#定义变量
API_NAME="harry-gateway"
API_VERSION=""
API_PORT=8080
IMAGE_NAME=$API_NAME
CONTAINER_NAME=$API_NAME-$API_VERSION

#构建docker镜像
docker build -t $IMAGE_NAME .
#删除docker容器
cid=$(docker ps -a -q -f NAME="$CONTAINER_NAME")
if [ "$cid" != "" ]; then
   docker rm -f $cid
   docker rmi $IMAGE_NAME
fi
#启动docker容器
docker run -d -p $API_PORT:$API_PORT --name $CONTAINER_NAME $IMAGE_NAME
