create table if not exists franquicia_db.franquicia
(
    id     mediumint auto_increment
        primary key,
    nombre varchar(50) charset utf8mb3 not null
);

create table if not exists franquicia_db.producto
(
    id     mediumint auto_increment
        primary key,
    nombre varchar(50) charset utf8mb3 not null
);

create table if not exists franquicia_db.sucursal
(
    id     mediumint auto_increment
        primary key,
    nombre varchar(50) charset utf8mb3 not null
);

create table if not exists franquicia_db.sucursal_franquicia
(
    id            mediumint auto_increment
        primary key,
    id_franquicia mediumint not null,
    id_sucursal   mediumint not null,
    constraint sucursal_franquicia_unique
        unique (id_franquicia, id_sucursal),
    constraint sucursal_franquicia_franquicia_FK
        foreign key (id_franquicia) references franquicia_db.franquicia (id)
            on update cascade on delete cascade,
    constraint sucursal_franquicia_sucursal_FK
        foreign key (id_sucursal) references franquicia_db.sucursal (id)
            on update cascade on delete cascade
)
    comment 'Sucursales por Franquicia';

create table if not exists franquicia_db.producto_sucursal
(
    id                     mediumint auto_increment
        primary key,
    id_sucursal_franquicia mediumint not null,
    id_producto            mediumint not null,
    cantidad_stock         bigint    not null comment 'Existencias del producto',
    constraint producto_sucursal_unique
        unique (id_sucursal_franquicia, id_producto),
    constraint producto_sucursal_producto_FK
        foreign key (id_producto) references franquicia_db.producto (id)
            on update cascade on delete cascade,
    constraint producto_sucursal_sucursal_franquicia_FK
        foreign key (id_sucursal_franquicia) references franquicia_db.sucursal_franquicia (id)
            on update cascade on delete cascade
)
    comment 'Existencias de productos por sucursal';

