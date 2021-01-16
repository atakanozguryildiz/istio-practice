FROM adoptopenjdk/openjdk11:ubi
COPY . /app
RUN mkdir /opt/app
COPY target/review*.jar /opt/app/review.jar
CMD ["java", "-jar", "/opt/app/review.jar"]
