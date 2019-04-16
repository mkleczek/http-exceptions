package org.kleczek.io.http.exceptions.checked;

public class Http421MisdirectedRequestException extends Http4xException
{

    Http421MisdirectedRequestException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 421;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
