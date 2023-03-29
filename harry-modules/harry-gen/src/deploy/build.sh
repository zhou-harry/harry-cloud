#!/bin/bash
#定义变量
API_NAME="harry-modules-gen"
API_VERSION="0.0.1"
API_PORT=9202
IMAGE_NAME=$API_NAME
CONTAINER_NAME=$API_NAME-$API_VERSION

#构建docker镜像
sudo docker build -t $IMAGE_NAME .
#删除docker容器
cid=$(sudo docker ps -a -q -f NAME="$CONTAINER_NAME")
if [ "$cid" != "" ]; then
   sudo docker rm -f $cid
   sudo docker rmi $IMAGE_NAME
fi
#启动docker容器
sudo docker run -d -p $API_PORT:$API_PORT --name $CONTAINER_NAME $IMAGE_NAME
