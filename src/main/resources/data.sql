-- sm_user
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo, role) VALUES ('user1@example.com', 'John', 'Doe', 'pass123', '1234567890', null, 'USER');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo, role) VALUES ('user2@example.com', 'Jane', 'Smith', 'pass456', '9876543210', null, 'USER');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo, role) VALUES ('admin1@example.com', 'Admin', 'One', 'adminpass1', '1112223333', null, 'ADMIN');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo, role) VALUES ('admin2@example.com', 'Admin', 'Two', 'adminpass2', '4445556666', null, 'ADMIN');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo, role) VALUES ('user3@example.com', 'Alice', 'Johnson', 'pass789', '2223334444', null, 'USER');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo, role) VALUES ('user4@example.com', 'Bob', 'Brown', 'passabc', '5556667777', null, 'USER');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo, role) VALUES ('user5@example.com', 'Eve', 'Wilson', 'passefg', '8889990000', null, 'USER');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo, role) VALUES ('user6@example.com', 'Charlie', 'Davis', 'passhij', '1231231234', null, 'USER');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo, role) VALUES ('user7@example.com', 'Grace', 'Martinez', 'passklm', '4564564567', null, 'USER');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo, role) VALUES ('user8@example.com', 'Frank', 'Garcia', 'passnop', '7897897890', null, 'USER');
INSERT INTO sm_user (email, first_name, last_name, password, phone, photo, role) VALUES ('user10@example.com', 'Tony', 'Graciano', 'passnop', '3897897890', null, 'USER');
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
INSERT INTO sm_hobby (description, name) VALUES ('Playing musical instruments', 'Music');
INSERT INTO sm_hobby (description, name) VALUES ('Capturing beautiful moments through photography', 'Photography');
INSERT INTO sm_hobby (description, name) VALUES ('Exploring new hiking trails and nature', 'Hiking');
INSERT INTO sm_hobby (description, name) VALUES ('Creating art and expressing creativity through painting', 'Art');
INSERT INTO sm_hobby (description, name) VALUES ('Reading and discussing books of various genres', 'Reading');
INSERT INTO sm_hobby (description, name) VALUES ('Cooking and experimenting with different recipes', 'Cooking');
INSERT INTO sm_hobby (description, name) VALUES ('Staying fit and active through various workout routines', 'Fitness');
INSERT INTO sm_hobby (description, name) VALUES ('Traveling to new destinations and experiencing different cultures', 'Travel');
INSERT INTO sm_hobby (description, name) VALUES ('Advocating for environmental sustainability and eco-friendly practices', 'Sustainability');
INSERT INTO sm_hobby (description, name) VALUES ('Exploring and learning about new technologies and coding', 'Tech');
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
INSERT INTO sm_interaction (liked, saved, shared, liked_date, saved_date, shared_date) VALUES (1, 1, 1,  '2022-01-01 12:00:00.000000', '2022-01-01 12:00:00.000000', '2022-01-01 12:00:00.000000');
INSERT INTO sm_interaction (liked, saved, shared,  liked_date, saved_date, shared_date) VALUES (0, 1, 0,  null, '2022-01-04 12:00:00.000000', null);
INSERT INTO sm_interaction (liked, saved, shared,  liked_date, saved_date, shared_date) VALUES (1, 1, 1,  '2022-01-04 12:00:00.000000', '2022-01-05 12:00:00.000000', '2022-01-06 12:00:00.000000');
INSERT INTO sm_interaction (liked, saved, shared,  liked_date, saved_date, shared_date) VALUES (1, 0, 0,  '2022-01-06 12:00:00.000000', null, null);
INSERT INTO sm_interaction (liked, saved, shared,  liked_date, saved_date, shared_date) VALUES (0, 1, 1,  null, '2022-01-07 12:00:00.000000', '2022-01-08 12:00:00.000000');
INSERT INTO sm_interaction (liked, saved, shared,  liked_date, saved_date, shared_date) VALUES (1, 1, 0,  '2022-01-07 12:00:00.000000', '2022-01-09 12:00:00.000000', null);
INSERT INTO sm_interaction (liked, saved, shared,  liked_date, saved_date, shared_date) VALUES (0, 0, 1,  null, null, '2022-01-10 12:00:00.000000');
INSERT INTO sm_interaction (liked, saved, shared,  liked_date, saved_date, shared_date) VALUES (1, 1, 1,  '2022-01-10 12:00:00.000000', '2022-01-11 12:00:00.000000', '2022-01-12 12:00:00.000000');
INSERT INTO sm_interaction (liked, saved, shared,  liked_date, saved_date, shared_date) VALUES (0, 1, 0,  null, '2022-01-13 12:00:00.000000', null);
INSERT INTO sm_interaction (liked, saved, shared,  liked_date, saved_date, shared_date) VALUES (1, 0, 1, '2022-01-12 12:00:00.000000', '2022-01-11 12:00:00.000000', '2022-01-12 12:00:00.000000');
INSERT INTO sm_interaction (liked, saved, shared,liked_date, saved_date, shared_date) VALUES (1, 0, 1, '2022-01-02 12:00:00.000000', '2022-01-03 12:00:00.000000', '2022-01-04 12:00:00.000000');
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
