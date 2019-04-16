package org.kleczek.io.http.exceptions.checked;

public class Http412PreconditionFailedException extends Http4xException
{

    Http412PreconditionFailedException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 412;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
