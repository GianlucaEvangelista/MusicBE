# Music App

To correctly run the app, put the directories MusicFE (frontend directory) and MusicBE (backend directory) at the same level.

After the Docker containers are created and running, the app is reachable at

### `http://localhost:3000/`



## Docker

In the project directory of the frontend (MusicFE), you can run:

### `docker-compose -p music up --build`

Creates the network of containers for the backend, the frontend and the database and runs all of them. After this the app is ready and running.


Alternatively, it's possible to create a container just for the backend following these steps:

### `docker build -t music_be_image .`

Builds the Docker image just for the backend.


### `docker run -d --name music_be -p 8080:8080 music_be_image`

Creates and runs a container using the image created just for the backend.



## Database

To check the DB tables from Docker Desktop, inside the terminal of the container you can run:

### `psql -U root -d musicDB`

### `\dt`

Shows all the tables of the DB. At this point it's possible to use SQL queries to check the DB.