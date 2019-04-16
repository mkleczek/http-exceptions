package org.kleczek.io.http.exceptions.checked;

import java.util.Optional;

public abstract class Http3xWithLocationException extends Http3xException
{

    private static final long serialVersionUID = 1L;

    Http3xWithLocationException(final Details details)
    {
        super(details);
    }

    public final Optional<String> location()
    {
        return details().responseHeader("Location");
    }
}
