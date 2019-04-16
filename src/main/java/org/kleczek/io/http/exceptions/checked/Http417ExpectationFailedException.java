package org.kleczek.io.http.exceptions.checked;

public class Http417ExpectationFailedException extends Http4xException
{

    Http417ExpectationFailedException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 417;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
