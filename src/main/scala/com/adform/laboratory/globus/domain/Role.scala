package com.adform.laboratory.globus.domain

/** @author zenind */
sealed trait Role extends Serializable

case object Admin extends Role
case object PodLead extends Role
case object User extends Role
case object Viewer extends Role
case class CustomRole(name: String) extends Role
