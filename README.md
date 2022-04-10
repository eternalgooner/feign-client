# feign-client

Service A is a REST service with exposed GET & POST endpoints  
Service B is a REST service with exposed GET & POST endpoints

Calls to service A are routed through a feign client which then calls service B, and returns the data from service B  


GET request example
- http://127.0.0.1/

POST request example (using body JSON)
- http://127.0.0.1/
{
    "name": "test post request",
    "age": 99
}
