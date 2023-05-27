package ru.billing.client;

import ru.billing.exceptions.CatalogLoadException;
import ru.billing.stocklist.ItemCatalog;


public class Main {
    public static void main(String[] args) throws CatalogLoadException {

            ItemCatalog cat = new ItemCatalog();
            CatalogStubLoader stub = new CatalogStubLoader();
            stub.load(cat);

    }

}
