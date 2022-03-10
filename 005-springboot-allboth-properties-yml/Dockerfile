FROM java:8

COPY *.jar /aap.jar

CMD ["--server.port=8081"]

EXPOSE 8081

ENTRYPOINT ["java","-jar","/app.jar"]