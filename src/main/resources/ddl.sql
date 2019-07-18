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
  message text,
  result text,
  CONSTRAINT pk_person PRIMARY KEY (id)
);

