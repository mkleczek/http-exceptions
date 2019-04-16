package org.kleczek.io.http.exceptions.checked;

public class Http402PaymentRequiredException extends Http4xException
{

    public Http402PaymentRequiredException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 402;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
