package com.odoo.experience.core.api.odoo.client.listeners;

import com.odoo.experience.core.api.odoo.client.helper.OdooErrorException;
import com.odoo.experience.core.api.odoo.client.helper.data.OdooResult;

public abstract class IOdooResponse {

    public String requestingURL = null;
    public int uuid = 0;

    public abstract void onResult(OdooResult result);

    public boolean onError(OdooErrorException error) {
        return false;
    }
}
