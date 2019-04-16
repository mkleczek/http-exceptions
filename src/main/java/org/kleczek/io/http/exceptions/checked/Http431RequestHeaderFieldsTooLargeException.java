package org.kleczek.io.http.exceptions.checked;

public class Http431RequestHeaderFieldsTooLargeException extends Http4xException
{

    Http431RequestHeaderFieldsTooLargeException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 431;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
