package codinpad.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import codinpad.models.Review;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}