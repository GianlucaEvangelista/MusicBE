REM Crea l'immagine Docker
docker build -t music_db_image .

REM Crea un container Docker con il database
docker run -d --name music_db -p 5432:5432 music_db_image

REM Controlla lo stato del container
docker ps