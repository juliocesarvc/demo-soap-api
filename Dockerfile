FROM openjdk:11-slim
COPY './target/demo-soap-api.jar' /usr/local
COPY './target/*.dylib' './target/*.so' './target/*.dll' /usr/lib/java/
RUN chmod +x ./usr/local/demo-soap-api.jar
CMD ["java", "-jar", "./usr/local/demo-soap-api.jar"]
