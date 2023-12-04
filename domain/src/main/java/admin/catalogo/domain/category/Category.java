package admin.catalogo.domain.category; 

import java.time.Instant;

import admin.catalogo.domain.AggregateRoot;

public class Category extends AggregateRoot<CategoryID>{ 
    final String name;
    final String description;
    final Boolean active;
    final Instant createdAt;
    final Instant updatedAt;
    final Instant deletedAt;

    private Category(CategoryID anId ,String anName, String anDescription, Boolean isActive, Instant anCreatedAt, Instant anUpdatedAt, Instant anDeletedAt) {
        super(anId);
        this.name = anName;
        this.description = anDescription;
        this.active = isActive;
        this.createdAt = anCreatedAt;
        this.updatedAt = anUpdatedAt;
        this.deletedAt = anDeletedAt;
    }

    public static Category newCategory(final String aName, final String aDescription, final Boolean aIsActive) {
        final var id = CategoryID.unique();
        final var now = Instant.now();
        return new Category(id, aName, aDescription, aIsActive, now, now, null);
    }

    public CategoryID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription(){
        return description;
    }

    public Boolean getIsActive(){
        return active;
    }

    public Instant getCreatedAt(){
        return createdAt;
    }

    public Instant getUpdatedAt(){
        return updatedAt;
    }

    public Instant getDeletedAt(){
        return deletedAt;
    }

    

}