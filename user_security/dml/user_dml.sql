\connect users;
INSERT INTO security.roles(
    uuid, role_name)
VALUES ('611a0946-37c4-4427-9089-d01ad5722558', 'USER'),
       ('e4b67d6e-e061-412f-8899-33962e53709c', 'ADMIN');

INSERT INTO security.users (
                            account_non_expired,
                            account_non_locked,
                            credentials_non_expired,
                            dt_create,
                            dt_update,
                            enabled,
                            mail,
                            PASSWORD,
                            status,
                            username,
                            uuid)
VALUES (
           true,
           true,
           true,
           CURRENT_TIMESTAMP,
           CURRENT_TIMESTAMP,
           true,
           'admin@gmail.com',
           '$2a$10$IGppn9wQ71NugkAJOiB3C.TtRXeksW4IO.IxzdqWHCTxRfz65mUxq',
           'ACTIVATED',
           'Admin',
           'ecb7990f-ba5a-4039-8bc8-375e8f908c77'
        );

INSERT INTO security.users_roles (user_uuid, role_uuid)
VALUES ('ecb7990f-ba5a-4039-8bc8-375e8f908c77', '611a0946-37c4-4427-9089-d01ad5722558');

INSERT INTO security.users_roles (user_uuid, role_uuid)
VALUES ('ecb7990f-ba5a-4039-8bc8-375e8f908c77', 'e4b67d6e-e061-412f-8899-33962e53709c');