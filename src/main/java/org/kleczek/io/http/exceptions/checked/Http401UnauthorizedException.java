package org.kleczek.io.http.exceptions.checked;

public class Http401UnauthorizedException extends Http4xAuthenticationException
{

    private static final long serialVersionUID = 1L;

    Http401UnauthorizedException(final Details details)
    {
        super(details);
    }

    public static final int STATUS_CODE = 401;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
