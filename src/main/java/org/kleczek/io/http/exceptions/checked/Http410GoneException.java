package org.kleczek.io.http.exceptions.checked;

public class Http410GoneException extends Http4xException
{

    Http410GoneException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 410;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
