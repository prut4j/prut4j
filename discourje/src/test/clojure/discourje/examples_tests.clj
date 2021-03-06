(ns discourje.examples-tests
  (:refer-clojure :exclude [print])
  (:require [clojure.test :refer :all]
            [clojure.pprint :as p]
            [discourje.examples.main :as main]))

(defn- print [x]
  (prn)
  (p/pprint x))

(deftest micro-tests

  ;; Ring

  (print (main/run-all [:clj :dcj]
                       ['discourje.examples.micro.ring]
                       {:buffered [true] :k [2] :secs [0]}))
  (is true)

  (print (main/run-all [:clj :dcj]
                       ['discourje.examples.micro.ring]
                       {:buffered [false] :k [2] :secs [0]}))
  (is true)

  ;; Mesh

  (print (main/run-all [:clj :dcj]
                       ['discourje.examples.micro.mesh]
                       {:buffered [true] :k [2] :secs [0]}))
  (is true)

  (print (main/run-all [:clj :dcj]
                       ['discourje.examples.micro.mesh]
                       {:buffered [false] :k [2] :secs [0]}))
  (is true)

  ;; Star

  (print (main/run-all [:clj :dcj]
                       ['discourje.examples.micro.star]
                       {:buffered [true] :ordered-sends [true] :ordered-receives [true] :k [2] :secs [0]}))
  (is true)

  (print (main/run-all [:clj :dcj]
                       ['discourje.examples.micro.star]
                       {:buffered [true] :ordered-sends [true] :ordered-receives [false] :k [2] :secs [0]}))
  (is true)

  (print (main/run-all [:clj :dcj]
                       ['discourje.examples.micro.star]
                       {:buffered [true] :ordered-sends [false] :ordered-receives [true] :k [2] :secs [0]}))
  (is true)

  (print (main/run-all [:clj :dcj]
                       ['discourje.examples.micro.star]
                       {:buffered [true] :ordered-sends [false] :ordered-receives [false] :k [2] :secs [0]}))
  (is true)

  (print (main/run-all [:clj :dcj]
                       ['discourje.examples.micro.star]
                       {:buffered [false] :ordered-sends [true] :k [2] :secs [0]}))
  (is true)

  (print (main/run-all [:clj :dcj]
                       ['discourje.examples.micro.star]
                       {:buffered [false] :ordered-sends [false] :k [2] :secs [0]}))
  (is true))

(defn- stockfish [os]
  (str (System/getProperty "user.dir") "/"
       "src/main/java/"
       "discourje/examples/games/impl/chess/"
       (cond (= os "linux")
             "stockfish-linux"
             (= os "mac")
             "stockfish-mac"
             (= os "win32")
             "stockfish-win32.exe"
             (= os "win64'")
             "stockfish-win64.exe")))

(deftest games-tests

  ;; Tic-Tac-Toe

  (print (main/run-all [:clj :dcj]
                       ['discourje.examples.games.tic-tac-toe]
                       {:buffered [true]}))
  (is true)

  (print (main/run-all [:clj :dcj]
                       ['discourje.examples.games.tic-tac-toe]
                       {:buffered [false]}))
  (is true)

  ;; Chess

  (print (main/run-all [:clj :dcj]
                       ['discourje.examples.games.chess]
                       {:buffered [true] :stockfish [(stockfish "mac")] :turns-per-player [1] :time-per-player [0]}))
  (is true)

  (print (main/run-all [:clj :dcj]
                       ['discourje.examples.games.chess]
                       {:buffered [false] :stockfish [(stockfish "mac")] :turns-per-player [1] :time-per-player [0]}))
  (is true)

  ;; Rock-Paper-Scissors

  (print (main/run-all [:clj :dcj]
                       ['discourje.examples.games.rock-paper-scissors]
                       {:buffered [true] :k [3]}))
  (is true)

  (print (main/run-all [:clj :dcj]
                       ['discourje.examples.games.rock-paper-scissors]
                       {:buffered [false] :k [3]}))
  (is true)

  ;; Go Fish

  (print (main/run-all [:clj :dcj]
                       ['discourje.examples.games.go-fish]
                       {:buffered [true] :k [3]}))
  (is true)

  (print (main/run-all [:clj :dcj]
                       ['discourje.examples.games.go-fish]
                       {:buffered [false] :k [3]}))
  (is true))

(deftest npb3-tests

  (print (main/run-all [:clj :dcj]
                       ['discourje.examples.npb3.cg]
                       {:k [3] :class ['w] :secs [0]}))
  (is true)

  (print (main/run-all [:clj :dcj]
                       ['discourje.examples.npb3.ft]
                       {:k [3] :class ['w] :secs [0]}))
  (is true)

  (print (main/run-all [:clj :dcj]
                       ['discourje.examples.npb3.is]
                       {:k [3] :class ['w] :secs [0]}))
  (is true)

  (print (main/run-all [:clj :dcj]
                       ['discourje.examples.npb3.cg]
                       {:k [3] :class ['w] :secs [0]}))
  (is true))