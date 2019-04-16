package org.kleczek.io.http.exceptions.checked;

public class Http505HttpVersionNotSupportedException extends Http5xException
{

    Http505HttpVersionNotSupportedException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 505;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
