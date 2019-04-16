package org.kleczek.io.http.exceptions.checked;

public class Http501NotImplementedException extends Http5xException
{

    Http501NotImplementedException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 501;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
