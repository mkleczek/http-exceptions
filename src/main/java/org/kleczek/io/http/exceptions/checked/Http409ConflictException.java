package org.kleczek.io.http.exceptions.checked;

public class Http409ConflictException extends Http4xException
{

    Http409ConflictException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 409;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
