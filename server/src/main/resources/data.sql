insert into medicijn (NAAM) values ('Paracetamol'),
                                   ('Broomhexine'),
                                   ('Chlooramfenicol');

INSERT INTO verpakking (VERPAKKING_ID, EENHEID, AANTAL, NAAM, MILLILITER_PER_FLESJE, TABLETTEN_PER_STRIP, OVERIG)
VALUES (1, 0, 3, 'Paracetamol', 0, 10, 0),
       (2, 2, 10, 'Paracetamol', 0, 0, 5),
       (3, 0, 20, 'Broomhexine', 0, 5, 0),
       (4, 1, 10, 'Broomhexine', 1, 0, 0),
       (5, 1, 10, 'Chlooramfenicol', 1, 0, 0);

# insert into RECEPT (RECEPT_ID, BSN, AFLEVER_METHODE, EIND_DATUM, VOORSCHRIJF_DATUM)
# values (1, '1234567890', 0, CURDATE() + interval 7 day, CURDATE());
#
# insert into RECEPT_VERPAKKING (ID, VERPAKKING_ID, RECEPT_ID, GEBRUIKS_VOORSCHRIFT)
# values (1, 1,1, 'gebruik het zo'),
#        (2, 2,1, 'zo gebruiken');