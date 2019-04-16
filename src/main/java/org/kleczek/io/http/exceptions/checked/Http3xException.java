package org.kleczek.io.http.exceptions.checked;

public abstract class Http3xException extends HttpException
{
    private static final long serialVersionUID = 1L;

    Http3xException(final Details details)
    {
        super(details);
    }
}
