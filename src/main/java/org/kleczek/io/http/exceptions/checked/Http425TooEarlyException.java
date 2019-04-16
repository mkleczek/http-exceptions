package org.kleczek.io.http.exceptions.checked;

public class Http425TooEarlyException extends Http4xException
{

    Http425TooEarlyException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 425;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
