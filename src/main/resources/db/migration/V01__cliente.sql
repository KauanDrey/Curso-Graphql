create table cliente (
    id    bigint auto_increment primary key,
    email varchar(255) null,
    nome  varchar(255) null
);

INSERT INTO cliente (id, email, nome) VALUES (1, 'a@a.com', 'Cliente A');
INSERT INTO cliente (id, email, nome) VALUES (2, 'b@b.com', 'Cliente B');
INSERT INTO cliente (id, email, nome) VALUES (3, 'c@c.com', 'Cliente C');
