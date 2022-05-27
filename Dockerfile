FROM mcr.microsoft.com/java/jdk:11-zulu-centos

WORKDIR /app
COPY build/libs/demo_ci_cd.jar .

ENTRYPOINT [ "sh", "-c", "java -Dspring.profiles.active=$SPRING_PROFILES_ACTIVE -jar demo_ci_cd.jar", \
"--SPRING_PROFILES_ACTIVE=${SPRING_PROFILES_ACTIVE}" ]
