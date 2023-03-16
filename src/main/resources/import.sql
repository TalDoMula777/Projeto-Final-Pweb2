insert into produto (descricao, valor) values ('Notebook', 2500);
insert into produto (descricao, valor) values ('Smartphone', 1500);
insert into produto (descricao, valor) values ('Mouse Gamer', 200);
insert into produto (descricao, valor) values ('Teclado Mecânico', 350);
insert into produto (descricao, valor) values ('Monitor Curvo', 2000);

insert into item_produto (quantidade_produto, produto_id, venda_id) values (3, 1, 1);
insert into item_produto (quantidade_produto, produto_id, venda_id) values (5, 2, 1);
insert into item_produto (quantidade_produto, produto_id, venda_id) values (10, 3, 1);
insert into item_produto (quantidade_produto, produto_id, venda_id) values (10, 4, 1);
insert into item_produto (quantidade_produto, produto_id, venda_id) values (2, 5, 1);

insert into venda (data) values ('2023-03-16')
