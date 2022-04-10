# feign-client

Service A is a REST service with exposed GET & POST endpoints
Service B is a REST service with exposed GET & POST endpoints

Calls to service A are routed through a feign client which then calls service B, and returns the data from service B
