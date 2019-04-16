package org.kleczek.io.http.exceptions.checked;

public class Http406NotAcceptableException extends Http4xException
{

    Http406NotAcceptableException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 406;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
