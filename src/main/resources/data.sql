-- sm_user
INSERT INTO `sm_user` (`available`, `fecha_nacimiento`, `id`, `ciudad`, `codigo_postal`, `email`, `first_name`, `last_name`, `password`, `phone`, `photo`, `role`, `sexo`) VALUES (1,'2000-01-01',1,'Madrid','28001','user1@example.com','John','Doe','pass123','1234567890','foto.jpg','USER','MASCULINO');
INSERT INTO `sm_user` (`available`, `fecha_nacimiento`, `id`, `ciudad`, `codigo_postal`, `email`, `first_name`, `last_name`, `password`, `phone`, `photo`, `role`, `sexo`) VALUES (0,'2000-01-01',2,'Madrid','28001','user2@example.com','Jane','Smith','pass456','9876543210','foto.jpg','USER','MASCULINO');
INSERT INTO `sm_user` (`available`, `fecha_nacimiento`, `id`, `ciudad`, `codigo_postal`, `email`, `first_name`, `last_name`, `password`, `phone`, `photo`, `role`, `sexo`) VALUES (0,'2000-01-01',3,'Madrid','28001','admin1@example.com','Admin','One','adminpass1','1112223333','foto.jpg','ADMIN','MASCULINO');
INSERT INTO `sm_user` (`available`, `fecha_nacimiento`, `id`, `ciudad`, `codigo_postal`, `email`, `first_name`, `last_name`, `password`, `phone`, `photo`, `role`, `sexo`) VALUES (0,'2000-01-01',4,'Madrid','28001','admin2@example.com','Admin','Two','adminpass2','4445556666','foto.jpg','ADMIN','MASCULINO');
INSERT INTO `sm_user` (`available`, `fecha_nacimiento`, `id`, `ciudad`, `codigo_postal`, `email`, `first_name`, `last_name`, `password`, `phone`, `photo`, `role`, `sexo`) VALUES (0,'2000-01-01',5,'Madrid','28001','user3@example.com','Alice','Johnson','pass789','2223334444','foto.jpg','USER','NO_BINARIO');
INSERT INTO `sm_user` (`available`, `fecha_nacimiento`, `id`, `ciudad`, `codigo_postal`, `email`, `first_name`, `last_name`, `password`, `phone`, `photo`, `role`, `sexo`) VALUES (1,'2000-01-01',6,'Madrid','28001','user4@example.com','Bob','Brown','passabc','5556667777','foto.jpg','USER','FEMENINO');
INSERT INTO `sm_user` (`available`, `fecha_nacimiento`, `id`, `ciudad`, `codigo_postal`, `email`, `first_name`, `last_name`, `password`, `phone`, `photo`, `role`, `sexo`) VALUES (1,'2000-01-01',7,'Madrid','28001','user5@example.com','Eve','Wilson','passefg','8889990000','foto.jpg','USER','FEMENINO');
INSERT INTO `sm_user` (`available`, `fecha_nacimiento`, `id`, `ciudad`, `codigo_postal`, `email`, `first_name`, `last_name`, `password`, `phone`, `photo`, `role`, `sexo`) VALUES (1,'2000-01-01',8,'Madrid','28001','user6@example.com','Charlie','Davis','passhij','1231231234','foto.jpg','USER','FEMENINO');
INSERT INTO `sm_user` (`available`, `fecha_nacimiento`, `id`, `ciudad`, `codigo_postal`, `email`, `first_name`, `last_name`, `password`, `phone`, `photo`, `role`, `sexo`) VALUES (1,'2000-01-01',9,'Madrid','28001','user7@example.com','Grace','Martinez','passklm','4564564567','foto.jpg','USER','FEMENINO');
INSERT INTO `sm_user` (`available`, `fecha_nacimiento`, `id`, `ciudad`, `codigo_postal`, `email`, `first_name`, `last_name`, `password`, `phone`, `photo`, `role`, `sexo`) VALUES (1,'2000-01-01',10,'Madrid','28001','user8@example.com','Frank','Garcia','passnop','7897897890','foto.jpg','USER','FEMENINO');
-- sm_group
INSERT INTO sm_group (description, photo_url, rules, title) VALUES ('Group for hiking enthusiasts', 'hiking.jpg', 'Respect nature and leave no trace behind', 'Hiking Group');
INSERT INTO sm_group (description, photo_url, rules, title) VALUES ('Photography lovers community', 'photography.jpg', 'Share your best shots and tips', 'Photography Club');
INSERT INTO sm_group (description, photo_url, rules, title) VALUES ('Healthy cooking and nutrition group', 'cooking.jpg', 'Promote healthy eating and share recipes', 'Nutrition Club');
INSERT INTO sm_group (description, photo_url, rules, title) VALUES ('Bookworms reading club', 'books.jpg', 'Discuss your favorite books and authors', 'Bookworms Club');
INSERT INTO sm_group (description, photo_url, rules, title) VALUES ('Tech and coding enthusiasts network', 'coding.jpg', 'Discuss the latest tech trends and coding challenges', 'Tech Enthusiasts Group');
INSERT INTO sm_group (description, photo_url, rules, title) VALUES ('Art and painting community', 'art.jpg', 'Share your artwork and painting techniques', 'Artists Network');
INSERT INTO sm_group (description, photo_url, rules, title) VALUES ('Fitness and workout motivation group', 'fitness.jpg', 'Share workout routines and motivate each other', 'Fitness Motivation Club');
INSERT INTO sm_group (description, photo_url, rules, title) VALUES ('Travelers and wanderlust explorers', 'travel.jpg', 'Share travel experiences and tips for exploring new destinations', 'Wanderlust Travelers');
INSERT INTO sm_group (description, photo_url, rules, title) VALUES ('Music lovers jamming group', 'music.jpg', 'Discuss your favorite music genres and bands', 'Music Lovers Jamming');
INSERT INTO sm_group (description, photo_url, rules, title) VALUES ('Environmental sustainability advocates', 'sustainability.jpg', 'Promote eco-friendly practices and sustainable living', 'Sustainability Advocates');
-- sm_hobby
INSERT INTO `sm_hobby` (`description`, `name`, `photo_url`) VALUES
('Escuchar música, cantar o aprender a tocar un instrumento. La música es el lenguaje del alma','Música','musica.jpg'),
('Tomar fotos de la familia, paisajes o momentos especiales.','Fotografía','foto.jpg'),
('Salir a caminar por tu lugar favorito. Mantenerse activo y disfrutar del aire fresco es vital','Caminatas','caminata.jpg'),
('Expresar sentimientos y creatividad a través de colores y formas. Darle vida a tus ideas. Todos podemos ser artistas','Pintura y Dibujo','pintura.jpg'),
('Perderse en las páginas de un buen libro o revista. a lectura es una ventana a nuevos mundos, historias y conocimientos.','Lectura','leyendo.jpg'),
('Preparar esos platos o dulces que tanto te gustan. Cocinar es un arte que alimenta tanto el cuerpo como el alma.','Cocina','cocinando_hombre.jpg'),
('Disfrutar de un café mientras se charla con amigos. Es una buena forma de compartir historias, risas y buenos momentos','Ratitos de Café y Charla','mayores_tomando_cafe.jpg'),
('Viajar a nuevos destinos y descubrir diferentes culturas','Viajar','viajar.jpg'),
('Aprender y disfrutar utilizando de las nuevas tecnologías','Tecnología','tecnologia.jpg'),
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
INSERT INTO sm_comment (user_id, content) VALUES (1, "Great post!");
INSERT INTO sm_comment (user_id, content) VALUES (2, "Thanks for sharing!");
INSERT INTO sm_comment (user_id, content) VALUES (3, "Interesting perspective...");
INSERT INTO sm_comment (user_id, content) VALUES (4, "Good job.");
INSERT INTO sm_comment (user_id, content) VALUES (5, "Nice work.");
INSERT INTO sm_comment (user_id, content) VALUES (6, "What a great idea!");
INSERT INTO sm_comment (user_id, content) VALUES (7, "Well done.");
INSERT INTO sm_comment (user_id, content) VALUES (8, "Keep up the good work.");
INSERT INTO sm_comment (user_id, content) VALUES (9, "Very informative.");
INSERT INTO sm_comment (user_id, content) VALUES (10, "Excellent share.");
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
