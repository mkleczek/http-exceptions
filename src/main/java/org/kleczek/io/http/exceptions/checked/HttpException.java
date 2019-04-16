package org.kleczek.io.http.exceptions.checked;

import java.io.IOException;
import java.util.function.Function;

public abstract class HttpException extends IOException
{

    private static final long serialVersionUID = 1L;

    @FunctionalInterface
    private interface Factory
    {
        HttpException create(int code,
                             Details details);
    }

    @FunctionalInterface
    private interface Constructor extends Function<Details, HttpException>
    {
    }

    private static Factory constructor(final Constructor constructor)
    {
        return (code,
                details) -> constructor.apply(details);
    }

    private static final int MAX_CODE = 511;
    private static final Factory[] factories = new Factory[MAX_CODE + 1];

    private static void initRange(final int start,
                                  final Constructor... fs)
    {
        for (int i = 0; i < fs.length; ++i)
        {
            factories[i + start] = constructor(fs[i]);
        }
    }

    static
    {
        for (int i = 0; i < factories.length; ++i)
        {
            factories[i] = HttpUnknownCodeException::new;
        }
        initRange(300, Http300MultipleChoicesException::new, Http301MovedPermanentlyException::new,
                Http302FoundException::new, Http303SeeOtherException::new, Http304NotModifiedException::new,
                Http305UseProxyException::new, Http306SwitchProxyException::new, Http307TemporaryRedirectException::new,
                Http308PermanentRedirectException::new);
        initRange(400, Http400PBadRequestException::new, Http401UnauthorizedException::new,
                Http402PaymentRequiredException::new, Http403ForbiddenException::new, Http404NotFoundException::new,
                Http405MethodNotAllowedException::new, Http406NotAcceptableException::new,
                Http407ProxyAuthenticationRequiredException::new, Http408RequestTimeoutException::new,
                Http409ConflictException::new, Http410GoneException::new, Http411LengthRequiredException::new,
                Http412PreconditionFailedException::new, Http413PayloadTooLargeException::new,
                Http414UriTooLongException::new, Http415UnsupportedMediaTypeException::new,
                Http416RangeNotSatisfiableException::new, Http417ExpectationFailedException::new,
                Http418IAmATeapotException::new);
        initRange(421, Http421MisdirectedRequestException::new, Http422UnprocessableEntityException::new,
                Http423LockedException::new, Http424FailedDependencyException::new, Http425TooEarlyException::new,
                Http426UpgradeRequiredException::new);
        initRange(428, Http428PreconditionRequiredException::new, Http429TooManyRequestsException::new);
        initRange(500, Http500InternalServerErrorException::new, Http501NotImplementedException::new,
                Http502BadGatewayException::new, Http503ServiceUnavailableException::new,
                Http504GatewayTimeoutException::new, Http505HttpVersionNotSupportedException::new,
                Http506VariantAlsoNegotiatesException::new, Http507UnsufficientStorageException::new,
                Http508LoopDetectedException::new);
        initRange(510, Http510NotIntendedException::new, Http511NetworkAuthenticationRequiredException::new);
    }

    public static HttpException create(final int code,
                                       final Details details)
    {
        if (code >= 0 && code < factories.length)
        {
            return factories[code].create(code, details);
        }
        return new HttpUnknownCodeException(code, details);
    }

    private final Details details;

    HttpException(final Details details)
    {
        this.details = details;
    }

    public final Details details()
    {
        return details;
    }

    @Override
    public String getMessage()
    {
        return String.format("%s", details);
    }

    public abstract int code();

}
