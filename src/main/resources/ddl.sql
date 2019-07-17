CREATE TABLE person
(
  id serial,
  name text,
  cpf text,
  age text,
  sex text,
  civil_status text,
  state text,
  dependents text,
  income text,
  CONSTRAINT pk_person PRIMARY KEY (id)
);

ALTER TABLE person ADD
  CONSTRAINT uq_person_name UNIQUE (cpf);

