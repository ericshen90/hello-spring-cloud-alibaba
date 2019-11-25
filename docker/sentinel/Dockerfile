FROM openjdk:8

MAINTAINER EricShen <ahsbt@126.com>

ARG SENTINEL_VERSION="1.7.0"
# https://github.com/alibaba/Sentinel/releases/download/1.7.0/sentinel-dashboard-1.7.0.jar

ENV SENTINEL_HOME /opt/sentinel-dashboard

RUN  mkdir -p ${SENTINEL_HOME} && \
     cd ${SENTINEL_HOME} && \
     wget -O sentinel-dashboard.jar "https://github.com/alibaba/Sentinel/releases/download/${SENTINEL_VERSION}/sentinel-dashboard-${SENTINEL_VERSION}.jar"

RUN chmod -R +x ${SENTINEL_HOME}/*jar

EXPOSE 8080

WORKDIR ${SENTINEL_HOME}

CMD java ${JAVA_OPTS} -jar sentinel-dashboard.jar