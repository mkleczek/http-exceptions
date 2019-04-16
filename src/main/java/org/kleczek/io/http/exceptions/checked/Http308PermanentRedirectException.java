package org.kleczek.io.http.exceptions.checked;

public class Http308PermanentRedirectException extends Http3xWithLocationException
{

    private static final long serialVersionUID = 1L;

    Http308PermanentRedirectException(final Details details)
    {
        super(details);
    }

    public static final int STATUS_CODE = 308;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
