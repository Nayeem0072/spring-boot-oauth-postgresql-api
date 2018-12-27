# spring-boot-oauth-postgresql-api
A Spring Boot based application configured with Maven and implemented with Spring Security and OAuth2 authentication for seamless communication between authentication server and resource servers. 
Database used here is Postgresql, passwords are being hashed with BCryptPasswordEncoder.

# testing APIs with cURL
Get token:
curl -X POST \
  http://localhost:9091/oauth/token \
  -H 'Authorization: Basic YW5kcm9pZC1jbGllbnQ6YW5kcm9pZC1zZWNyZXQ=' \ base64(android-client:android-secret)
  -H 'Cache-Control: no-cache' \
  -H 'Content-Type: application/x-www-form-urlencoded' \
  -H 'Accept: application/json' \
  -F grant_type=password \
  -F username=nayeem \
  -F password=123456

Test authed API:
curl -X GET \
  http://localhost:9091/authed/test \
  -H 'Accept: application/json' \
  -H 'Authorization: Bearer b602a833-2396-43be-ad96-d5a5d09beb6a' \
  -H 'Cache-Control: no-cache' \
  -F access_token=843c7945-9703-48c5-98ac-3018741bad13
