package org.kleczek.io.http.exceptions.checked;

public class Http503ServiceUnavailableException extends Http5xException
{

    Http503ServiceUnavailableException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 503;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
