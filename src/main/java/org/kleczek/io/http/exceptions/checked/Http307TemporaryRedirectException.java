package org.kleczek.io.http.exceptions.checked;

public class Http307TemporaryRedirectException extends Http3xWithLocationException
{

    private static final long serialVersionUID = 1L;

    Http307TemporaryRedirectException(final Details details)
    {
        super(details);
    }

    public static final int STATUS_CODE = 307;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
