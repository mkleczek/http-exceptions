package org.kleczek.io.http.exceptions.checked;

public class Http403ForbiddenException extends Http4xException
{

    Http403ForbiddenException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 403;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
