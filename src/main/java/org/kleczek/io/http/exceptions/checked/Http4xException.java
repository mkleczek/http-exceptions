package org.kleczek.io.http.exceptions.checked;

public abstract class Http4xException extends HttpException
{

    private static final long serialVersionUID = 1L;

    Http4xException(final Details details)
    {
        super(details);
    }

}
