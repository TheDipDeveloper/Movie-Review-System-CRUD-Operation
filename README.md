# Movie Review System

## Spring Boot application that performs CRUD (Create, Read, Update, Delete) operations
## (Spring Boot 3.x, Java 17, MySQL, Postman, IntelliJ IDEA)

### Add a new Movie Review
URI: http://localhost:8080/movie/add

CURL: <code>curl --location 'http://localhost:8080/movie/add' \
--header 'Content-Type: application/json' \
--data '{
"title": "Hobinhood",
"releaseYear": "2024-01-25",
"rating": 4,
"comment": "nice movie"
}'</code>
### Get a Movie Review Detail by Id
URI: http://localhost:8080/movie/get/2

CURL: <code>curl --location 'http://localhost:8080/movie/get/2'</code>
### Get all Movie details
URI: http://localhost:8080/movie/all

CURL: <code>curl --location 'http://localhost:8080/movie/all'</code>
### Delete a Movie by Id
URI: http://localhost:8080/movie/delete/1

CURL: <code>curl --location --request DELETE 'http://localhost:8080/movie/delete/1'</code>
### Update a Movie Detail
URI: http://localhost:8080/movie/update/20

CURL: <code>curl --location --request PUT 'http://localhost:8080/movie/update/20' \
--header 'Content-Type: application/json' \
--data '{
"title": "Hobinhood",
"releaseYear": "2024-01-25T00:00:00.000+00:00",
"rating": 10,
"comment": "nice movie"
}'
</code>

# Please SUBSCRIBE - LIKE - SHARE the video
## Please provide feedback on COMMENT section

[![Watch the video](https://img.youtube.com/vi/U6Ogp4D_eZ8/maxresdefault.jpg)](https://www.youtube.com/watch?v=U6Ogp4D_eZ8)

