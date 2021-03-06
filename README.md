# http-exceptions
Simple Java library with HTTP exception hierarchy.

Handling HTTP responses involves checking status codes. Depending on a library they are either provided as return values or as properties of generic exceptions thrown from library functions. Wouldn't it be nice if instead of writing these ugly chained if statements one could use structured exception handling?

I have been looking for something like this and the only ones I could find was Spring Framework HttpStatusCodeException (https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/client/HttpStatusCodeException.html) and restly (https://github.com/restly/http-status). They do however have some drawbacks.

In case of Spring:
* It is not generic but rather related to REST services/clients
* Sometimes it is not desireable to have a dependency on (part of) the Spring Framework
* Following Spring philosophy it is a runtime exception (I know, I know - checked exceptions are evil but I like them :) )

In case of restly:
* Exception class names do not contain numbers so it is pretty difficult to find the right ones.
* I personally prefer to have HTTP exceptions rooted at IOException

So here it is - a tiny handy library with exception types corresponding to HTTP status codes. Rooted - of course :) - in IOException hierarchy - as it should be from the very beginning.

Throwing:
~~~~
Details myExceptionDetails = ...
int code = ...
throw new HttpException.create(code, myExceptionDetails);
~~~~
Catching:
~~~~
try {
... really long try section - this is structured exception handling in the end
}
catch (Http404NotFoundException e) {
//handle 404
}
catch (Http401UnauthorizedException e) {
// handle 401
}
~~~~

**TODO**
* Add some Details implementations for most popular HTTP libraries (OkHttp is going to be first I guess)
* I can't think of anything specific
