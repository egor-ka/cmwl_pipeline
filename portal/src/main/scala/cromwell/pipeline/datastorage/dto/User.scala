package cromwell.pipeline.datastorage.dto

import slick.lifted.MappedTo

case class User(userId: UserId,
                email: String,
                passwordHash: String,
                passwordSalt: String,
                firstName: String,
                lastName: String,
                profilePicture: Option[ProfilePicture])

final case class UserId(value: String) extends MappedTo[String]
final case class ProfilePicture(value: Array[Byte]) extends MappedTo[Array[Byte]]