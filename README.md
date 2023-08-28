# Ecommerce App

## Open problems and TODOs
- I'm having problems with the CORS policy, i tryed everything i saw online but nothing worked. As a temporary solution i installed an extension to block the CORS policy, and finally everything worked
- Evaluate using github actions to automate the Docker pipeline

## How to dockerize
- Build a correct Dockerfile
- run docker build -t name . (build the image)
- run docker run -p 8080:8080 imagename   (NB: the start command must have --host flag to be seen outside)

## Resolve comunication errors between client/server by construct docker compose
- Build a docker-compose.yml file
- docker-compose build
- docker-compose up

## Open a shell inside a docker container to debug
- docker ps (list your containers and shows their ids)
- docker exec -it container_id //bin//sh
- NB: you have to had installed in your Dockerfile curl
- Alternative is to use docker attach and do everything from there, including apk update & apk add curl