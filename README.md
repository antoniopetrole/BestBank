# Environment Setup

## Setup Postgres
docker run --name best-bank -e POSTGRES_PASSWORD=<password> -it -p 5432:5432 -d postgres

## Set Database Environment Variables
export SPRING_DATASOURCE_USERNAME=<docker_postgres_username>
export SPRING_DATASOURCE_PASSWORD=<docker_postgres_password>
