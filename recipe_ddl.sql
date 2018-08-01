create table category (id bigint not null auto_increment, recipes_id bigint, primary key (id)) engine=MyISAM
create table category_recipes (category_id bigint not null, recipes_id bigint not null, primary key (category_id, recipes_id)) engine=MyISAM
create table ingredient (id bigint not null auto_increment, amount decimal(19,2), description varchar(255), recipe_id bigint, primary key (id)) engine=MyISAM
create table notes (id bigint not null, recipe_note longtext, recipe_id bigint, primary key (id)) engine=MyISAM
create table recipe (id bigint not null auto_increment, cook_time integer not null, description varchar(255), difficulty integer, direction varchar(255), image longblob, prep_time integer not null, servings integer not null, source varchar(255), notes_id bigint, primary key (id)) engine=MyISAM
create table unit_of_measure (id bigint not null auto_increment, ingredient_id bigint, primary key (id)) engine=MyISAM
alter table category_recipes add constraint UK_6pg1g4efieqpleicuyt8r8hxg unique (recipes_id)
alter table category add constraint FK5q2elxhkgx7cpjcolbobsqj3w foreign key (recipes_id) references recipe (id)
alter table category_recipes add constraint FKh48plx4pt6sd122piao8xot1u foreign key (recipes_id) references recipe (id)
alter table category_recipes add constraint FKd0bswler7xyafar8pt4ob4isa foreign key (category_id) references category (id)
alter table ingredient add constraint FKj0s4ywmqqqw4h5iommigh5yja foreign key (recipe_id) references recipe (id)
alter table notes add constraint FKdbfsiv21ocsbt63sd6fg0t3c8 foreign key (recipe_id) references recipe (id)
alter table recipe add constraint FK37al6kcbdasgfnut9xokktie9 foreign key (notes_id) references notes (id)
alter table unit_of_measure add constraint FKsuvp4jw48bi3h82hkxrfbgfqu foreign key (ingredient_id) references ingredient (id)
create table category (id bigint not null auto_increment, recipes_id bigint, primary key (id)) engine=MyISAM
create table category_recipes (category_id bigint not null, recipes_id bigint not null, primary key (category_id, recipes_id)) engine=MyISAM
create table ingredient (id bigint not null auto_increment, amount decimal(19,2), description varchar(255), recipe_id bigint, primary key (id)) engine=MyISAM
create table notes (id bigint not null, recipe_note longtext, recipe_id bigint, primary key (id)) engine=MyISAM
create table recipe (id bigint not null auto_increment, cook_time integer not null, description varchar(255), difficulty integer, direction varchar(255), image longblob, prep_time integer not null, servings integer not null, source varchar(255), notes_id bigint, primary key (id)) engine=MyISAM
create table unit_of_measure (id bigint not null auto_increment, ingredient_id bigint, primary key (id)) engine=MyISAM
alter table category_recipes add constraint UK_6pg1g4efieqpleicuyt8r8hxg unique (recipes_id)
alter table category add constraint FK5q2elxhkgx7cpjcolbobsqj3w foreign key (recipes_id) references recipe (id)
alter table category_recipes add constraint FKh48plx4pt6sd122piao8xot1u foreign key (recipes_id) references recipe (id)
alter table category_recipes add constraint FKd0bswler7xyafar8pt4ob4isa foreign key (category_id) references category (id)
alter table ingredient add constraint FKj0s4ywmqqqw4h5iommigh5yja foreign key (recipe_id) references recipe (id)
alter table notes add constraint FKdbfsiv21ocsbt63sd6fg0t3c8 foreign key (recipe_id) references recipe (id)
alter table recipe add constraint FK37al6kcbdasgfnut9xokktie9 foreign key (notes_id) references notes (id)
alter table unit_of_measure add constraint FKsuvp4jw48bi3h82hkxrfbgfqu foreign key (ingredient_id) references ingredient (id)
create table category (id bigint not null auto_increment, recipes_id bigint, primary key (id)) engine=MyISAM
create table category_recipes (category_id bigint not null, recipes_id bigint not null, primary key (category_id, recipes_id)) engine=MyISAM
create table ingredient (id bigint not null auto_increment, amount decimal(19,2), description varchar(255), recipe_id bigint, primary key (id)) engine=MyISAM
create table notes (id bigint not null, recipe_note longtext, recipe_id bigint, primary key (id)) engine=MyISAM
create table recipe (id bigint not null auto_increment, cook_time integer not null, description varchar(255), difficulty integer, direction varchar(255), image longblob, prep_time integer not null, servings integer not null, source varchar(255), notes_id bigint, primary key (id)) engine=MyISAM
create table unit_of_measure (id bigint not null auto_increment, ingredient_id bigint, primary key (id)) engine=MyISAM
alter table category_recipes add constraint UK_6pg1g4efieqpleicuyt8r8hxg unique (recipes_id)
alter table category add constraint FK5q2elxhkgx7cpjcolbobsqj3w foreign key (recipes_id) references recipe (id)
alter table category_recipes add constraint FKh48plx4pt6sd122piao8xot1u foreign key (recipes_id) references recipe (id)
alter table category_recipes add constraint FKd0bswler7xyafar8pt4ob4isa foreign key (category_id) references category (id)
alter table ingredient add constraint FKj0s4ywmqqqw4h5iommigh5yja foreign key (recipe_id) references recipe (id)
alter table notes add constraint FKdbfsiv21ocsbt63sd6fg0t3c8 foreign key (recipe_id) references recipe (id)
alter table recipe add constraint FK37al6kcbdasgfnut9xokktie9 foreign key (notes_id) references notes (id)
alter table unit_of_measure add constraint FKsuvp4jw48bi3h82hkxrfbgfqu foreign key (ingredient_id) references ingredient (id)
