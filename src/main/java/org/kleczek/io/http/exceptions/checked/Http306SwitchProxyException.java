package org.kleczek.io.http.exceptions.checked;

public class Http306SwitchProxyException extends Http3xWithLocationException
{

    private static final long serialVersionUID = 1L;

    Http306SwitchProxyException(final Details details)
    {
        super(details);
    }

    public static final int STATUS_CODE = 306;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
