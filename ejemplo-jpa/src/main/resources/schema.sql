create table rol
(
    id varchar(255) not null,
    primary key (id)
);
create table users
(
    id            bigint not null,
    register_time timestamp,
    name          varchar(255),
    primary key (id)
);
create table users_roles
(
    usuario_id bigint       not null,
    roles_id   varchar(255) not null
);
alter table users
    add constraint UK_3g1j96g94xpk3lpxl2qbl985x unique (name);
alter table users_roles
    add constraint FKdkcgn949s9pxu64n65csmhh9b foreign key (roles_id) references rol;
alter table users_roles
    add constraint FK8vwygo3ui4kqlsun5g8twkvl foreign key (usuario_id) references users;