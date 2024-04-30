FROM postgres

LABEL author="Gianluca Evangelista"
LABEL description="Container image for Music application"
LABEL version="1.0.0"

ENV POSTGRES_USER root
ENV POSTGRES_PASSWORD rootpassword
ENV POSTGRES_DB musicDB

COPY src/sql/init.sql /docker-entrypoint-initdb.d/
COPY src/sql/insert.sql /docker-entrypoint-initdb.d/

EXPOSE 5432