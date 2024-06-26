FROM maven
COPY . .

EXPOSE 8080


## Add a sleep command to delay execution
ENTRYPOINT ["mvn", "jetty:run"]
