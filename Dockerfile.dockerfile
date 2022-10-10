FROM ubuntu:latest
RUN apt update \
    && apt install -y vim \
    && apt install -y wget \
    && wget https://download.java.net/openjdk/jdk17/ri/openjdk-17+35_linux-x64_bin.tar.gz \
    && tar -zxvf openjdk-17+35_linux-x64_bin.tar.gz \
    && mkdir /usr/local/java \
    && mv jdk-17/ /usr/local/java/ \
    && rm /openjdk-17+35_linux-x64_bin.tar.gz 

ENV JAVA_HOME=/usr/local/java/jdk-17
ENV PATH=$JAVA_HOME/bin:$PATH

WORKDIR /home