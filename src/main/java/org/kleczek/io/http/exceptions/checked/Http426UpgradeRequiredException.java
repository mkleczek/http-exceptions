package org.kleczek.io.http.exceptions.checked;

public class Http426UpgradeRequiredException extends Http4xException
{

    Http426UpgradeRequiredException(final Details details)
    {
        super(details);
    }

    private static final long serialVersionUID = 1L;

    public static final int STATUS_CODE = 426;

    @Override
    public final int code()
    {
        return STATUS_CODE;
    }
}
