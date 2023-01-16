printf " -> Saving message to elasticsearch:/n"
curl -X POST \
 -H "Content-Type: application/json"  \
 http://localhost:8080/twin-peaks
printf "\n--------------------------------------------\n"

printf " -> All data, that is in elasticsearch: \n"
curl -X GET \
 http://localhost:8080/twin-peaks
printf "\n--------------------------------------------\n"

printf " -> All quotes of Phillip Gerard, that is in elasticsearch: \n"
curl -X GET \
 http://localhost:8080/twin-peaks/Phillip%20Gerard
printf "\n--------------------------------------------\n"