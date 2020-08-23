#FROM node:12.2.0
FROM node:12.18.3-alpine as build-step

RUN mkdir -p /app
WORKDIR /app
COPY package.json /app
RUN npm install
COPY . /app
RUN npm run build --prod

FROM nginx:1.19.2-alpine
COPY --from=build-step /app/docs /usr/share/nginx/html
