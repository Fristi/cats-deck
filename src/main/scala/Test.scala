import cats.{Id, Monad}

object Test {
  val id = new Monad[Id] {
    override def pure[A](x: A): Id[A] = x

    override def flatMap[A, B](fa: Id[A])(f: A => Id[B]): Id[B] = f(fa)

    override def tailRecM[A, B](a: A)(f: A => Id[Either[A, B]]): Id[B] = ???
  }
}
