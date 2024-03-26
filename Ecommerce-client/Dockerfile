#Phase 1: Compile and build Angular
FROM node:alpine as build

WORKDIR /usr/local/app

COPY ./ /usr/local/app

RUN npm install
RUN npm run build

#Phase 2: Serve the app with nginx server
FROM nginx

#The path is taken from angular.json
#The --from=build is important, it reference the first phase
COPY --from=build /usr/local/app/dist/ecommerce-client /usr/share/nginx/html 

EXPOSE 80