package org.kleczek.io.http.exceptions.checked;

public class Http506VariantAlsoNegotiatesException extends Http5xException
{

    Http506VariantAlsoNegotiatesException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 506;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
