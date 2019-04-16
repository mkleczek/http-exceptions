package org.kleczek.io.http.exceptions.checked;

public class Http500InternalServerErrorException extends Http5xException
{

    Http500InternalServerErrorException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 500;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
