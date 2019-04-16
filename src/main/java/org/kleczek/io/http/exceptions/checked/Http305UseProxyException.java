package org.kleczek.io.http.exceptions.checked;

public class Http305UseProxyException extends Http3xWithLocationException
{

    private static final long serialVersionUID = 1L;

    Http305UseProxyException(final Details details)
    {
        super(details);
    }

    public static final int STATUS_CODE = 305;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
