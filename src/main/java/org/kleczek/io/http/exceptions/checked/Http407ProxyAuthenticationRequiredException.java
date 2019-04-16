package org.kleczek.io.http.exceptions.checked;

public class Http407ProxyAuthenticationRequiredException extends Http4xAuthenticationException
{

    private static final long serialVersionUID = 1L;

    Http407ProxyAuthenticationRequiredException(final Details details)
    {
        super(details);
    }

    public static final int STATUS_CODE = 407;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
