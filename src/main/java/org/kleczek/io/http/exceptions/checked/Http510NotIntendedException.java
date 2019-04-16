package org.kleczek.io.http.exceptions.checked;

public class Http510NotIntendedException extends Http5xException
{

    Http510NotIntendedException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 510;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
