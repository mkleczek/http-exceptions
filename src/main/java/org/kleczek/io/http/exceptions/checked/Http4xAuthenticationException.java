package org.kleczek.io.http.exceptions.checked;

import java.util.Optional;

public abstract class Http4xAuthenticationException extends Http4xException
{

    private static final long serialVersionUID = 1L;

    Http4xAuthenticationException(final Details details)
    {
        super(details);
    }

    public Optional<String> challenge()
    {
        return details().responseHeader("WWW-Authenticate");
    }
}
