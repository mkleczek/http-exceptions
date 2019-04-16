package org.kleczek.io.http.exceptions.checked;

public class Http301MovedPermanentlyException extends Http3xWithLocationException
{

    private static final long serialVersionUID = 1L;

    Http301MovedPermanentlyException(final Details details)
    {
        super(details);
    }

    public static final int STATUS_CODE = 301;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
