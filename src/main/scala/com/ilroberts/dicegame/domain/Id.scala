package com.ilroberts.dicegame.domain

trait Id[T] extends Any {
  def value: String
}