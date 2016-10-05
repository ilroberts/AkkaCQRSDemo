package com.ilroberts.domain

/**
  * Created by iwan roberts on 05/10/2016.
  */
sealed trait Game {

  def handleCommand(command: GameCommand): Either[GameRulesValidation, Game]
  def applyEvent: PartialFunction[GameEvent, Game]

}

case class UninitializedGame(...) extends Game {

  def roll(player: PlayerId): Either[GameRulesValidation], Game]
  def tickCountdown(): Game
}

case class FinishedGame(...) extends Game {}