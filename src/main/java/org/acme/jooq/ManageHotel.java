/*
 * This file is generated by jOOQ.
 */
package org.acme.jooq;


import java.util.Arrays;
import java.util.List;

import org.acme.jooq.tables.FlywaySchemaHistory;
import org.acme.jooq.tables.Users;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ManageHotel extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>manage_hotel</code>
     */
    public static final ManageHotel MANAGE_HOTEL = new ManageHotel();

    /**
     * The table <code>manage_hotel.flyway_schema_history</code>.
     */
    public final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * The table <code>manage_hotel.users</code>.
     */
    public final Users USERS = Users.USERS;

    /**
     * No further instances allowed
     */
    private ManageHotel() {
        super("manage_hotel", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY,
            Users.USERS
        );
    }
}