create table produto(
    id    bigint auto_increment primary key,
    nome  varchar(255) null,
    valor double       not null
);

INSERT INTO produto (id, nome, valor) VALUES (1, 'Boné', 25);
INSERT INTO produto (id, nome, valor) VALUES (2, 'Bola', 120);
INSERT INTO produto (id, nome, valor) VALUES (3, 'Bermuda', 60);
INSERT INTO produto (id, nome, valor) VALUES (4, 'Camiseta', 80);
INSERT INTO produto (id, nome, valor) VALUES (5, 'Chuteira', 130);