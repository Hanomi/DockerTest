# copied from - https://hub.docker.com/_/java/
FROM java:8

COPY . /usr/src/myapp
WORKDIR /usr/src/myapp

# compile
RUN javac Test/HelloDocker.java

# run
CMD ["java", "-cp", "Test", "HelloDocker"]