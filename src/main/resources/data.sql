-- sm_user
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role, available) VALUES ('angel@gmail.com', 'Angel', 'Sigueros', '$2a$10$Da/0KQVt4FusDlhQk2n9Lu2olKG1aYB3.Bezn3DaH0kKngMxznP1W', '666555444', 'angel.jpg', 'ADMIN', 1);
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role, available) VALUES ('lili@gmail.com', 'Lili', 'Rubim', '$2a$10$Da/0KQVt4FusDlhQk2n9Lu2olKG1aYB3.Bezn3DaH0kKngMxznP1W', '666555444', 'lili.jpg', 'ADMIN', 1);
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role, available) VALUES ('fran@gmail.com', 'Fran', 'Ramírez', '$2a$10$Da/0KQVt4FusDlhQk2n9Lu2olKG1aYB3.Bezn3DaH0kKngMxznP1W', '666555444', 'fran.jpg', 'ADMIN', 1);
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role, available) VALUES ('noemi@gmail.com', 'Noemi', 'Herrera', '$2a$10$Da/0KQVt4FusDlhQk2n9Lu2olKG1aYB3.Bezn3DaH0kKngMxznP1W', '666555444', 'noemi.jpg', 'ADMIN', 1);
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role, available) VALUES ('yessenia@gmail.com', 'Yessenia', 'Cherrez', '$2a$10$Da/0KQVt4FusDlhQk2n9Lu2olKG1aYB3.Bezn3DaH0kKngMxznP1W', '666555444', 'yessenia.png', 'ADMIN', 1);
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role, available) VALUES ('alan@gmail.com', 'Alan', 'Sastre', '$2a$10$Da/0KQVt4FusDlhQk2n9Lu2olKG1aYB3.Bezn3DaH0kKngMxznP1W', '666777888', 'alan.jpg', 'USER', 1);
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role, available) VALUES ('angelmaria@gmail.com', 'Angel María', 'Martinez', '$2a$10$Da/0KQVt4FusDlhQk2n9Lu2olKG1aYB3.Bezn3DaH0kKngMxznP1W', '666777888', 'angelm.png', 'USER', 1);
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role, available) VALUES ('silvia@gmail.com', 'Silvia', 'Sanchez', '$2a$10$Da/0KQVt4FusDlhQk2n9Lu2olKG1aYB3.Bezn3DaH0kKngMxznP1W', '666777888', 'silvia.jpg', 'USER', 1);
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role, available) VALUES ('angelsc@gmail.com', 'Angel', 'Sanz', '$2a$10$Da/0KQVt4FusDlhQk2n9Lu2olKG1aYB3.Bezn3DaH0kKngMxznP1W', '666777888', 'angelsc.png', 'USER', 1);
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role, available) VALUES ('judith@gmail.com', 'Judith', 'Blandin', '$2a$10$Da/0KQVt4FusDlhQk2n9Lu2olKG1aYB3.Bezn3DaH0kKngMxznP1W', '666777888', 'judith.jpg', 'USER', 1);
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role, available) VALUES ('@gmail.com', 'Javier', 'Baeza-Rojano', '$2a$10$Da/0KQVt4FusDlhQk2n9Lu2olKG1aYB3.Bezn3DaH0kKngMxznP1W', '666777888', 'javier.jpg', 'USER', 1);
-- sm_group
INSERT INTO sm_group (id, description, photo_url, rules, title) VALUES (1, 'Entusiastas de los paseos, respeto por la naturaleza', 'caminata.jpg', 'Sábado 08:00hrs, Parque del Buen Retiro', 'Caminatas');
INSERT INTO sm_group (id, description, photo_url, rules, title) VALUES (2, 'Enamorados de la fotografía, comparte tus mejores fotos y trucos', 'foto.jpg', ' Viernes 18:00hrs, Principe de Vergara 110', 'Club de Fotografía');
INSERT INTO sm_group (id, description, photo_url, rules, title) VALUES (3, 'Cocina saludable y nutrition, ven y comparte tus recetas', 'cocina.jpg', 'Jueves 17:00hrs, Centro cultural "Edad Dorada"', 'Club de Cocina');
INSERT INTO sm_group (id, description, photo_url, rules, title) VALUES (4, 'Comedores libro, debate sobre tus libros y autores favoritos', 'lectura.jpg', 'Lunes y miércoles 17:00hrs, Biblioteca "José deL Hierro"', 'Club de lectura');
INSERT INTO sm_group (id, description, photo_url, rules, title) VALUES (5, 'Grupo de baile, aprende todos los ritmos', 'baile.jpg', 'Viernes 19.00hrs, Escuela de Danza "Elena Rojo"', 'Bailadores');
INSERT INTO sm_group (id, description, photo_url, rules, title) VALUES (6, 'Comunidad de arte y pintura, comparte tus técnicas y obras de arte', 'arte.jpg', 'Martes 16:00hrs, Centro cultural "Buena Esperanza"', 'Arte y Pintura');
INSERT INTO sm_group (id, description, photo_url, rules, title) VALUES (7, 'Viajeros exploradores, viajes y nuevos destinos', 'viajeros.jpg', 'Lunes 19:00hrs, Biblioteca "José deL Hierro"', 'Pasión por Viajar');
INSERT INTO sm_group (id, description, photo_url, rules, title) VALUES (8, 'Amantes de la música, Hablamos de música, solistas y  bandas', 'musica.png', 'Miércoles 18:00hrs, Centro cultural "Edad Dorada"', 'Club de música');
INSERT INTO sm_group (id, description, photo_url, rules, title) VALUES (9, 'Huertos urbanos, promovemos los huertos sostenible', 'huerto.jpg', 'Viernes 10:00hrs, parque "Pradolongo', 'Huerto');
-- sm_hobby
INSERT INTO `sm_hobby` (`description`, `name`, `photo_url`) VALUES
('Escuchar música, cantar o aprender a tocar un instrumento. La música es el lenguaje del alma','Música','musica.jpg'),
('Salir a caminar por tu lugar favorito. Mantenerse activo y disfrutar del aire fresco es vital','Caminatas','caminando.jpg'),
('Disfrutar bailando diferentes estilos...','Bailar','bailando.jpg'),
('Expresar sentimientos y creatividad a través de colores y formas. Darle vida a tus ideas. Todos podemos ser artistas','Pintura y Dibujo','pintando.jpg'),
('Perderse en las páginas de un buen libro o revista. a lectura es una ventana a nuevos mundos, historias y conocimientos.','Lectura','leyendo.jpg'),
('Preparar esos platos o dulces que tanto te gustan. Cocinar es un arte que alimenta tanto el cuerpo como el alma.','Cocina','cocinando.jpg'),
('Disfrutar de un café mientras se charla con amigos. Es una buena forma de compartir historias, risas y buenos momentos','Ratitos de Café y Charla','tomando_cafe.jpg'),
('Viajar a nuevos destinos y descubrir diferentes culturas','Viajar','viajando.jpg'),
('Tomar fotos de la familia, paisajes o momentos especiales.','Fotografía','fotografia.jpg'),
('Escribir historias, poemas o llevar un diario personal. La escritura es una excelente manera de expresar pensamientos y sentimientos, y puede ser una actividad muy gratificante.','Escribir','escribiendo.jpg');
-- sm_post
INSERT INTO sm_post (`user_id`, `content`, `photo_url`, `video_url`, `date`, `group_id`) VALUES (1, 'Gran contenido', 'grancontenido.png', null, '2024-02-01', 1);
INSERT INTO sm_post (`user_id`, `content`, `photo_url`, `video_url`, `date`, `group_id`) VALUES (1, 'Articulo interesante', 'articulo.jpg', null, '2024-01-12', 2);
INSERT INTO sm_post (`user_id`, `content`, `photo_url`, `video_url`, `date`, `group_id`) VALUES (3, 'Nuevo grupo de Cocina', 'cocinando.jpg', null, '2024-03-15', 3);
INSERT INTO sm_post (`user_id`, `content`, `photo_url`, `video_url`, `date`, `group_id`) VALUES (10, 'Nuevo Producto', 'nuevoproducto.jpg', null, '2024-03-28', 4);
INSERT INTO sm_post (`user_id`, `content`, `photo_url`, `video_url`, `date`, `group_id`) VALUES (7, 'Aficiones Excitantes!', 'baile.jpg', null, '2024-02-11', 5);
INSERT INTO sm_post (`user_id`, `content`, `photo_url`, `video_url`, `date`, `group_id`) VALUES (6, 'Divertido meme', 'meme.jpg', null, '2024-01-01', 6);
INSERT INTO sm_post (`user_id`, `content`, `photo_url`, `video_url`, `date`, `group_id`) VALUES (4, 'Cita importante', 'evento.jpg', null, '2024-04-26', 7);
INSERT INTO sm_post (`user_id`, `content`, `photo_url`, `video_url`, `date`, `group_id`) VALUES (2, 'Te invito a la reflexión', 'cita.jpg', null, '2024-04-30', 8);
INSERT INTO sm_post (`user_id`, `content`, `photo_url`, `video_url`, `date`, `group_id`) VALUES (8,'Feliz Viernes', 'happyFridays.jpg', null, '2024-04-22', 9);
INSERT INTO sm_post (`user_id`, `content`, `photo_url`, `video_url`, `date`, `group_id`) VALUES (5,'Recordatorio de  evento', 'evento.jpg', null, '2024-04-30', 1);
INSERT INTO sm_post (`user_id`, `content`, `photo_url`, `video_url`, `date`, `group_id`) VALUES (11,'Feliz Halloween!', 'halloween.jpg' , null, '2023-10-31', 2);
-- sm_interaction
INSERT INTO sm_interaction (date, id, post_id, user_id, type) VALUES ('2022-01-12', 1, 1, 1, 'LIKE');
INSERT INTO sm_interaction (date, id, post_id, user_id, type) VALUES ('2022-01-12', 2, 2, 2, 'SAVE');
INSERT INTO sm_interaction (date, id, post_id, user_id, type) VALUES ('2022-01-12', 3, 3, 3, 'LIKE');
INSERT INTO sm_interaction (date, id, post_id, user_id, type) VALUES ('2022-01-12', 4, 4, 4, 'SAVE');
INSERT INTO sm_interaction (date, id, post_id, user_id, type) VALUES ('2022-01-12', 5, 5, 5, 'LIKE');
INSERT INTO sm_interaction (date, id, post_id, user_id, type) VALUES ('2022-01-12', 6, 6, 6, 'SAVE');
INSERT INTO sm_interaction (date, id, post_id, user_id, type) VALUES ('2022-01-12', 7, 7, 7, 'LIKE');
INSERT INTO sm_interaction (date, id, post_id, user_id, type) VALUES ('2022-01-12', 8, 8, 8, 'SAVE');
INSERT INTO sm_interaction (date, id, post_id, user_id, type) VALUES ('2022-01-12', 9, 9, 9, 'LIKE');
INSERT INTO sm_interaction (date, id, post_id, user_id, type) VALUES ('2022-01-12', 10, 10, 10, 'SAVE');
INSERT INTO sm_interaction (date, id, post_id, user_id, type) VALUES ('2022-01-12', 11, 11, 11, 'LIKE');
-- sm_comment
INSERT INTO sm_comment (user_id, content,date) VALUES (1, "Great post!", '2024-10-01');
INSERT INTO sm_comment (user_id, content,date) VALUES (2, "Thanks for sharing!",'2024-10-01');
INSERT INTO sm_comment (user_id, content,date) VALUES (3, "Interesting perspective...",'2024-10-01');
INSERT INTO sm_comment (user_id, content,date) VALUES (4, "Good job.",'2024-10-01');
INSERT INTO sm_comment (user_id, content,date) VALUES (5, "Nice work.",'2024-10-01');
INSERT INTO sm_comment (user_id, content,date) VALUES (6, "What a great idea!",'2024-10-01');
INSERT INTO sm_comment (user_id, content,date) VALUES (7, "Well done.",'2024-10-01');
INSERT INTO sm_comment (user_id, content,date) VALUES (8, "Keep up the good work.",'2024-10-01');
INSERT INTO sm_comment (user_id, content,date) VALUES (9, "Very informative.",'2024-10-01');
INSERT INTO sm_comment (user_id, content,date) VALUES (10, "Excellent share.",'2024-10-01');
--
INSERT INTO sm_user_groups (group_id, user_id) VALUES (1, 1);
INSERT INTO sm_user_groups (group_id, user_id) VALUES (2, 2);
INSERT INTO sm_user_groups (group_id, user_id) VALUES (3, 3);
INSERT INTO sm_user_groups (group_id, user_id) VALUES (4, 4);
INSERT INTO sm_user_groups (group_id, user_id) VALUES (5, 5);
INSERT INTO sm_user_groups (group_id, user_id) VALUES (1, 6);
INSERT INTO sm_user_groups (group_id, user_id) VALUES (2, 7);
INSERT INTO sm_user_groups (group_id, user_id) VALUES (3, 8);
INSERT INTO sm_user_groups (group_id, user_id) VALUES (4, 9);
INSERT INTO sm_user_groups (group_id, user_id) VALUES (5, 10);
--
INSERT INTO sm_user_hobbies (hobby_id, user_id) VALUES (1, 1);
INSERT INTO sm_user_hobbies (hobby_id, user_id) VALUES (2, 2);
INSERT INTO sm_user_hobbies (hobby_id, user_id) VALUES (3, 3);
INSERT INTO sm_user_hobbies (hobby_id, user_id) VALUES (4, 4);
INSERT INTO sm_user_hobbies (hobby_id, user_id) VALUES (5, 5);
INSERT INTO sm_user_hobbies (hobby_id, user_id) VALUES (1, 6);
INSERT INTO sm_user_hobbies (hobby_id, user_id) VALUES (2, 7);
INSERT INTO sm_user_hobbies (hobby_id, user_id) VALUES (3, 8);
INSERT INTO sm_user_hobbies (hobby_id, user_id) VALUES (4, 9);
INSERT INTO sm_user_hobbies (hobby_id, user_id) VALUES (5, 10);
