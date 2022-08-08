CREATE DATABASE users;

GRANT ALL PRIVILEGES ON DATABASE postgres TO postgres;

\connect users;

CREATE SCHEMA security
    AUTHORIZATION postgres;


CREATE TABLE security.roles
(
    uuid uuid NOT NULL UNIQUE,
    role_name text NOT NULL UNIQUE
)
    TABLESPACE pg_default;

CREATE TABLE security.users (
    uuid uuid NOT NULL UNIQUE,
    account_non_expired boolean NOT NULL,
    account_non_locked boolean NOT NULL,
    credentials_non_expired boolean NOT NULL,
    enabled boolean NOT NULL,
    dt_create timestamp(3) WITHOUT time zone NULL,
    dt_update timestamp(3) WITHOUT time zone NULL,
    mail text NOT NULL UNIQUE,
    status text NOT NULL,
    PASSWORD text NOT NULL,
    username text NOT NULL UNIQUE,
    CONSTRAINT pk_users PRIMARY KEY (uuid)
)
    TABLESPACE pg_default;


CREATE TABLE security.users_roles (
    role_uuid uuid NOT NULL,
    user_uuid uuid NOT NULL
)
    TABLESPACE pg_default;

ALTER TABLE IF EXISTS security.roles
    OWNER to postgres;

ALTER TABLE IF EXISTS security.users_roles
    ADD CONSTRAINT fk_user_on_role FOREIGN KEY (role_uuid) REFERENCES security.roles (uuid);

ALTER TABLE IF EXISTS security.users_roles
    ADD CONSTRAINT fk_user_on_user FOREIGN KEY (user_uuid) REFERENCES security.users (uuid);


ALTER TABLE security.users
    ADD CONSTRAINT uc_users_mail UNIQUE (mail);

ALTER TABLE security.users
    ADD CONSTRAINT uc_users_uuid UNIQUE (uuid);