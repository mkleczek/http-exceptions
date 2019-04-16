package org.kleczek.io.http.exceptions.checked;

public abstract class HttpUnofficialCodeException extends HttpException
{
    private static final long serialVersionUID = 1L;

    protected HttpUnofficialCodeException(final Details details)
    {
        super(details);
    }
}
