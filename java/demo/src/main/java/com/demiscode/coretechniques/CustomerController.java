package com.demiscode.coretechniques;

public class CustomerController {
    public ActionResult getCustomer(int id) {
        if (id == 0)
            return new NotFound();
        return new Ok();
    }
}
