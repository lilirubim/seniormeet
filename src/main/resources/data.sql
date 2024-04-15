-- sm_user
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role) VALUES ('user1@example.com', 'John', 'Doe', 'pass123', '1234567890', null, 'USER');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role) VALUES ('user2@example.com', 'Jane', 'Smith', 'pass456', '9876543210', null, 'USER');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role) VALUES ('admin1@example.com', 'Admin', 'One', 'adminpass1', '1112223333', null, 'ADMIN');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role) VALUES ('admin2@example.com', 'Admin', 'Two', 'adminpass2', '4445556666', null, 'ADMIN');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role) VALUES ('user3@example.com', 'Alice', 'Johnson', 'pass789', '2223334444', null, 'USER');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role) VALUES ('user4@example.com', 'Bob', 'Brown', 'passabc', '5556667777', null, 'USER');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role) VALUES ('user5@example.com', 'Eve', 'Wilson', 'passefg', '8889990000', null, 'USER');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role) VALUES ('user6@example.com', 'Charlie', 'Davis', 'passhij', '1231231234', null, 'USER');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role) VALUES ('user7@example.com', 'Grace', 'Martinez', 'passklm', '4564564567', null, 'USER');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role) VALUES ('user8@example.com', 'Frank', 'Garcia', 'passnop', '7897897890', null, 'USER');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role) VALUES ('user10@example.com', 'Tony', 'Graciano', 'passnop', '3897897890', null, 'USER');
-- sm_group
INSERT INTO sm_group (description, photo_url, rules, title) VALUES ('Entusiastas de los paseos', 'caminata.jpg', 'Respeto por la naturaleza', 'Caminatas');
INSERT INTO sm_group (description, photo_url, rules, title) VALUES ('Enamorados de la fotografía', 'foto.jpg', 'Comparte tus mejores fotos y trucos', 'Club de Fotografía');
INSERT INTO sm_group (description, photo_url, rules, title) VALUES ('Cocina saludable y nutrition', 'cocina.jpg', 'Promueve comer saludable y compartir recetas', 'Club de Cocina');
INSERT INTO sm_group (description, photo_url, rules, title) VALUES ('Comedores libro', 'lectura.jpg', 'Debate sobre tus libros y autores favoritos', 'Club de lectura');
INSERT INTO sm_group (description, photo_url, rules, title) VALUES ('Grupo de baile', 'baile.jpg', 'Aprende a bailar topo tipo de música', 'Entusiastas Bailadores');
INSERT INTO sm_group (description, photo_url, rules, title) VALUES ('Comunidad de arte y pintura', 'arte.jpg', 'Comparte tus obras de arte y técnicas de pintura ', 'Arte y Pintura');
INSERT INTO sm_group (description, photo_url, rules, title) VALUES ('Viajeros exploradores', 'viajeros.jpg', 'Comparte tus viajes y explora nuevos destinos', 'Pasión por Viajar');
INSERT INTO sm_group (description, photo_url, rules, title) VALUES ('Amantes de la música', 'musica.png', 'Hablamos de música, solistas y  bandas', 'Amantes de la música');
INSERT INTO sm_group (description, photo_url, rules, title) VALUES ('Huertos urbanos', 'huerto.jpg', 'Promueve los huertos sostenible', 'Huerto');
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
INSERT INTO sm_post (content, photo_url, video_url) VALUES ('Great content', 'https://example.com/photo1.jpg', null);
INSERT INTO sm_post (content, photo_url, video_url) VALUES ('Interesting article', null, null);
INSERT INTO sm_post (content, photo_url, video_url) VALUES ('Check out this video!', null, 'https://example.com/video1.mp4');
INSERT INTO sm_post (content, photo_url, video_url) VALUES ('New product announcement', 'https://example.com/product.jpg', null);
INSERT INTO sm_post (content, photo_url, video_url) VALUES ('Exciting news!', null, null);
INSERT INTO sm_post (content, photo_url, video_url) VALUES ('Funny meme', 'https://example.com/meme.jpg', null);
INSERT INTO sm_post (content, photo_url, video_url) VALUES ('Important update', null, null);
INSERT INTO sm_post (content, photo_url, video_url) VALUES ('Event reminder', 'https://example.com/event.jpg', null);
INSERT INTO sm_post (content, photo_url, video_url) VALUES ('Thought-provoking quote', null, null);
INSERT INTO sm_post (content, photo_url, video_url) VALUES ('Happy Friday!', null, null);
INSERT INTO sm_post (content, photo_url, video_url) VALUES ('Happy Halloween!', null, null);
-- sm_interaction
-- INSERT INTO sm_interaction (liked, saved, shared, liked_date, saved_date, shared_date) VALUES (1, 1, 1,  '2022-01-01 12:00:00.000000', '2022-01-01 12:00:00.000000', '2022-01-01 12:00:00.000000');
-- INSERT INTO sm_interaction (liked, saved, shared,  liked_date, saved_date, shared_date) VALUES (0, 1, 0,  null, '2022-01-04 12:00:00.000000', null);
-- INSERT INTO sm_interaction (liked, saved, shared,  liked_date, saved_date, shared_date) VALUES (1, 1, 1,  '2022-01-04 12:00:00.000000', '2022-01-05 12:00:00.000000', '2022-01-06 12:00:00.000000');
-- INSERT INTO sm_interaction (liked, saved, shared,  liked_date, saved_date, shared_date) VALUES (1, 0, 0,  '2022-01-06 12:00:00.000000', null, null);
-- INSERT INTO sm_interaction (liked, saved, shared,  liked_date, saved_date, shared_date) VALUES (0, 1, 1,  null, '2022-01-07 12:00:00.000000', '2022-01-08 12:00:00.000000');
-- INSERT INTO sm_interaction (liked, saved, shared,  liked_date, saved_date, shared_date) VALUES (1, 1, 0,  '2022-01-07 12:00:00.000000', '2022-01-09 12:00:00.000000', null);
-- INSERT INTO sm_interaction (liked, saved, shared,  liked_date, saved_date, shared_date) VALUES (0, 0, 1,  null, null, '2022-01-10 12:00:00.000000');
-- INSERT INTO sm_interaction (liked, saved, shared,  liked_date, saved_date, shared_date) VALUES (1, 1, 1,  '2022-01-10 12:00:00.000000', '2022-01-11 12:00:00.000000', '2022-01-12 12:00:00.000000');
-- INSERT INTO sm_interaction (liked, saved, shared,  liked_date, saved_date, shared_date) VALUES (0, 1, 0,  null, '2022-01-13 12:00:00.000000', null);
-- INSERT INTO sm_interaction (liked, saved, shared,  liked_date, saved_date, shared_date) VALUES (1, 0, 1, '2022-01-12 12:00:00.000000', '2022-01-11 12:00:00.000000', '2022-01-12 12:00:00.000000');
-- INSERT INTO sm_interaction (liked, saved, shared,liked_date, saved_date, shared_date) VALUES (1, 0, 1, '2022-01-02 12:00:00.000000', '2022-01-03 12:00:00.000000', '2022-01-04 12:00:00.000000');
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
