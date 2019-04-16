package org.kleczek.io.http.exceptions.checked;

public class Http511NetworkAuthenticationRequiredException extends Http5xException
{

    Http511NetworkAuthenticationRequiredException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 511;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
