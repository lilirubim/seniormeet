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
