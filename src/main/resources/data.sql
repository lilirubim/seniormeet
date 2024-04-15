-- sm_user
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role) VALUES ('angel@gmail.com', 'Angel', 'Sigueros', '12345678', '666555444', 'angel.jpg', 'ADMIN');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role) VALUES ('lili@gmail.com', 'Lili', 'Rubim', '12345678', '666555444', 'lili.jpg', 'ADMIN');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role) VALUES ('fran@gmail.com', 'Fran', 'Ramírez', '12345678', '666555444', 'fran.jpg', 'ADMIN');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role) VALUES ('noemi@gmail.com', 'Noemi', 'Herrera', '12345678', '666555444', 'noemi.jpg', 'ADMIN');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role) VALUES ('yessenia@gmail.com', 'Yessenia', 'Cherrez', '12345678', '666555444', 'yessenia.png', 'ADMIN');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role) VALUES ('alan@gmail.com', 'Alan', 'Sastre', 'user1234', '666777888', 'alan.jpg', 'USER');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role) VALUES ('angelmaria@gmail.com', 'Angel María', 'Martinez', 'user1234', '666777888', 'angelm.png', 'USER');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role) VALUES ('silvia@gmail.com', 'Silvia', 'Sanchez', 'user1234', '666777888', 'silvia.jpg', 'USER');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role) VALUES ('angelsc@gmail.com', 'Angel', 'Sanz', 'user1234', '666777888', 'angelsc.png', 'USER');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role) VALUES ('judith@gmail.com', 'Judith', 'Blandin', 'user1234', '666777888', 'judith.jpg', 'USER');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo_url, role) VALUES ('@gmail.com', 'Javier', 'Baeza-Rojano', 'user1234', '666777888', 'javier.jpg', 'USER');
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
INSERT INTO sm_hobby (description, name, photo_url) VALUES ('Playing musical instruments', 'Music', 'https://picsum.photos/id/944/900/500');
INSERT INTO sm_hobby (description, name, photo_url) VALUES ('Capturing beautiful moments through photography', 'Photography', 'https://picsum.photos/id/944/900/500');
INSERT INTO sm_hobby (description, name, photo_url) VALUES ('Exploring new hiking trails and nature', 'Hiking', 'https://picsum.photos/id/944/900/500');
INSERT INTO sm_hobby (description, name, photo_url) VALUES ('Creating art and expressing creativity through painting', 'Art', 'https://picsum.photos/id/944/900/500');
INSERT INTO sm_hobby (description, name, photo_url) VALUES ('Reading and discussing books of various genres', 'Reading', 'https://picsum.photos/id/944/900/500');
INSERT INTO sm_hobby (description, name, photo_url) VALUES ('Cooking and experimenting with different recipes', 'Cooking', 'https://picsum.photos/id/944/900/500');
INSERT INTO sm_hobby (description, name, photo_url) VALUES ('Staying fit and active through various workout routines', 'Fitness', 'https://picsum.photos/id/944/900/500');
INSERT INTO sm_hobby (description, name, photo_url) VALUES ('Traveling to new destinations and experiencing different cultures', 'Travel', 'https://picsum.photos/id/944/900/500');
INSERT INTO sm_hobby (description, name, photo_url) VALUES ('Advocating for environmental sustainability and eco-friendly practices', 'Sustainability', 'https://picsum.photos/id/944/900/500');
INSERT INTO sm_hobby (description, name, photo_url) VALUES ('Exploring and learning about new technologies and coding', 'Tech', 'https://picsum.photos/id/944/900/500');
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
