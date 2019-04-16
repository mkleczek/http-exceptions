package org.kleczek.io.http.exceptions.checked;

public class Http400PBadRequestException extends Http4xException
{

    Http400PBadRequestException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 400;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
