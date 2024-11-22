
FROM maven:3.9.5-eclipse-temurin-17 as builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests


FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=builder /app/target/codigo-certo-api-0.0.1-SNAPSHOT.jar app.jar

# Cria diretório para o banco SQLite
RUN mkdir /app/data

# Porta usada pela aplicação
EXPOSE 8080

# Comando para rodar a aplicação
CMD ["java", "-jar", "app.jar", "--server.port=${PORT}"]