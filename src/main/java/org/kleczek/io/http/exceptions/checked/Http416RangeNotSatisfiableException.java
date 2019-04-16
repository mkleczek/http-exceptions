package org.kleczek.io.http.exceptions.checked;

public class Http416RangeNotSatisfiableException extends Http4xException
{

    Http416RangeNotSatisfiableException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 416;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
