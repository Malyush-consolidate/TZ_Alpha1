Получить список кодов для валют:
GET /gg/getcodes
Получить гифку:
GET /gg/getgif/{Char Code}
Запуск .jar:
java -jar gif_giver-0.0.1.jar
Docker:
Для создания образа Docker перейти в корневую директорию проекта,
где лежит фаил Dockerfile:
docker build gif_giver_image:gg .  
Запуск:
docker run -p 8080:8080 gif_giver_image:gg
