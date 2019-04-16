package org.kleczek.io.http.exceptions.checked;

public class Http413PayloadTooLargeException extends Http4xException
{

    Http413PayloadTooLargeException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 413;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
