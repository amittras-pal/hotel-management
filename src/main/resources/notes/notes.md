## SQLs

#### Database Creation

```sql
CREATE DATABASE "hms-dev"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LOCALE_PROVIDER = 'libc'
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
```

#### Defining Columns
```sql
CREATE TABLE hotels
(
    id serial NOT NULL,
    name character varying(60) NOT NULL,
    address character varying(240) NOT NULL,
    phone_numbers character varying(12)[] NOT NULL,
    email character varying(50) NOT NULL,
    map_link character varying(240),
    PRIMARY KEY (id)
);
```