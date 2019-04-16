package org.kleczek.io.http.exceptions.checked;

public class Http502BadGatewayException extends Http5xException
{

    Http502BadGatewayException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 502;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
