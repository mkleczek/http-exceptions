package org.kleczek.io.http.exceptions.checked;

public class Http304NotModifiedException extends Http3xException
{
    private static final long serialVersionUID = 1L;

    Http304NotModifiedException(final Details details)
    {
        super(details);
    }

    public static final int STATUS_CODE = 304;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
