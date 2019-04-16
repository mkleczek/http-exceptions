package org.kleczek.io.http.exceptions.checked;

public class Http429TooManyRequestsException extends Http4xException
{

    Http429TooManyRequestsException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 429;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
