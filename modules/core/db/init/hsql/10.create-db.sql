-- begin DEMO_CUSTOMER
create table DEMO_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    DTYPE varchar(31),
    --
    TITLE varchar(255) not null,
    ADDRESS longvarchar not null,
    --
    -- from demo_Company
    PROFIT bigint,
    --
    -- from demo_Individual
    PASSPORT varchar(255),
    --
    primary key (ID)
)^
-- end DEMO_CUSTOMER
