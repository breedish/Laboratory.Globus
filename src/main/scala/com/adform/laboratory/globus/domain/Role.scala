package com.adform.laboratory.globus.domain

/** @author zenind */
sealed trait Role

case object AdminRole extends Role
case object PodLeaderRole extends Role
case object RodKeeperRole extends Role
case class CustomRole(name: String) extends Role
