package org.kleczek.io.http.exceptions.checked;

public class Http418IAmATeapotException extends Http4xException
{

    Http418IAmATeapotException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 418;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
