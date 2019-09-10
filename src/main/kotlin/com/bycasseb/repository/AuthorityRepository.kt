package com.bycasseb.repository

import com.bycasseb.domain.Authority
import org.springframework.data.mongodb.repository.MongoRepository

/**
 * Spring Data MongoDB repository for the [Authority] entity.
 */

interface AuthorityRepository : MongoRepository<Authority, String>
