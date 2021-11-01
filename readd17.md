## Hibernate Many to Many Annotation

- **this annotation** is helpful to create a relation between two entities, so they will be linked together in the data base In a bi-directional association , we must notice that only one entity can be the owner of the relationship.

- to make that so , at first we create two classes and we put the annotations to create the relation .. this explains what happens in the data base once we add the relation : 

![](dz.png)

- we aslo should notice these annotations :

- **@JoinTable :** is used to define the join/link table.
- **@JoinColumn annotation** used to specify the join/linking column with the main table.