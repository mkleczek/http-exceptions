package org.kleczek.io.http.exceptions.checked;

public class Http504GatewayTimeoutException extends Http5xException
{

    Http504GatewayTimeoutException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 504;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
