package org.kleczek.io.http.exceptions.checked;

public class Http423LockedException extends Http4xException
{

    Http423LockedException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 423;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
