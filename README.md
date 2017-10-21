# luxoft-movie
Your task is to implement RESTful facade backend API with two mock up services: 
-          Movie details service (movie: id, title, description) 
-          Movie comments service (comment: movieId, username, message)  Movie details service and Movie comments service are simple standalone services providing mock up data. You can use any mock server library.  Requirements for the facade: 
-          Endpoint for providing combined movie details and movie comments by movie id (in JSON) 
-          Dummy endpoint for creating movie details. No communication with Movie details service. Endpoint should be authorized with ROLE_ADMIN 
-          Dummy endpoint for creating Comment. No communication with Comments service. Endpoint should be authorized with ROLE_USER 
-          Basic authentication 
-          No user registration required. You can store mocked user data in memory. 
-          Calls to the backend services should be implemented asynchronously 
-          Movie details service responses should be cached with Least Frequently Used strategy 
-          Comments service responses should also be cached but only as fallback. When the backend service is down, comments should be taken from cache. 
-          Implemented with JAVA 8 
-          Should start as a normal java application with embedded servlet container  Things that will be evaluated:
 ï         Implementation 
 ï         REST principles, proper status codes, headers, error responses
 ï         Tests 
 ï         Clean code 
 ï         Commits  You can use any open source library or framework you wish.  Please create an open repository on github and send us the link with your final implementation.   GOOD LUCK!
