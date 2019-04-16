package org.kleczek.io.http.exceptions.checked;

public class Http408RequestTimeoutException extends Http4xException
{

    Http408RequestTimeoutException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 408;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
