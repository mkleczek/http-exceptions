# http-exceptions
Simple Java library with HTTP exception hierarchy.

Handling HTTP responses involves checking status codes. Depending on a library they are either provided as return values or as properties of generic exceptions thrown from library functions. Wouldn't it be nice if instead of writing these ugly chained if statements one could use structured exception handling?

I have been looking for something like this and the only one I could find was Spring Framework HttpStatusCodeException (https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/client/HttpStatusCodeException.html). It does however have some drawbacks:
* It is not generic but rather related to REST services/clients
* Sometimes it is not desireable to have a dependency on (part of) the Spring Framework
* Following Spring philosophy it is a runtime exception (I know, I know - checked exceptions are evil but I like them :) )

So here it is - a tiny library with exception types corresponding to HTTP status codes. Rooted - of course :) - in IOException hierarchy - as it should be from the very beginning.
