FROM node:16-alpine as builder

WORKDIR './src/app'

COPY package.json .
RUN npm install

#if you need curl to test calls uncomment these lines, i run apk because i'm using alpine linux
#RUN apk update 
#RUN apk add curl

COPY . .
EXPOSE 4200

CMD ["npm","start"]