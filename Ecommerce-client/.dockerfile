FROM node:16-alpine

WORKDIR './src/app'

COPY package.json .
RUN npm install

COPY . .
EXPOSE 4200

CMD ["npm","start"]