package org.kleczek.io.http.exceptions.checked;

public class Http507UnsufficientStorageException extends Http5xException
{

    Http507UnsufficientStorageException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 507;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
