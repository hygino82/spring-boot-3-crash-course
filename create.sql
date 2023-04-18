
    create table tb_content (
       id serial not null,
        content_type smallint not null,
        date_created timestamp(6),
        date_updated timestamp(6),
        desc varchar(255),
        status smallint not null,
        title varchar(255),
        url varchar(255),
        primary key (id)
    );
INSERT INTO tb_content(title, content_type, date_created, desc, url, status) VALUES('Bob Esponja', 2, '2023-02-17T14:21:05', 'Bob filme', 'www.bob.com/movie', 2);
INSERT INTO tb_content(title, content_type, date_created, desc, url, status) VALUES('Heman', 1, '2023-03-14T14:11:15', 'Animacao netflix', 'www.heman.com/masters', 3);

