package org.kleczek.io.http.exceptions.checked;

public abstract class Http5xException extends HttpException
{

    private static final long serialVersionUID = 1L;

    Http5xException(final Details details)
    {
        super(details);
    }

}
