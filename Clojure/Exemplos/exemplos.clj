; Remove os números impares da lista

(def numero [1 2 3 4 5])
(def carros [5000.0 6000.0])


(defn impar [x] (not= 0 (rem x 2)))


; Escreva uma função que filtra todos os números menores do que 2 OU maiores
; do que 4 da lista numeros. Use filter para isso. Para fazer o OU, você pode
; usar a função (or booleano-1 booleano-2).

(filter (fn [x] (or (< x 2) (> x 4))) numeros)

; Declare um conjunto chamado palavra e coloque dentro dele as letras A, L,
; U, R.

; Em seguida, descubra se a letra A e a letra O estão dentro desse conjunto.

(def palavra ["A", "L", "U", "R"])

(def palavra #{"A" "L" "U" "R"})
(contains? palavra "A")
(contains? palavra "O")

; VIDEO 4

; Defina a função:

(defn le-letra! [] (read-line))

; Agora, escreva um programa que pega uma string, converte para inteiro, e
; devolva o resultado da multiplicação por 7. Para converter, use
; (Integer/parseInt "1"), e troque o "1" pela String a ser convertida.

(defn convert [x] ())

; Aula 5 - Funções recursivas e recursão de cauda

; Essa foi a função que escrevemos no capítulo 2:

(defn fib[x]
    (if (= x 0) 0
    (if (= x 1) 1
    (+ (fib (- x 1)) (fib (- x 2))))))

; Faça com que ela agora use recursão de cauda. Para isso, você precisa usar
; loop e recur. Como dica, veja a estrutura abaixo, e substitua os ?:

(defn fib[x]
  (loop [a 1 b 1 numero 2]
    (if
      (= numero x) ???
      (recur ? (+ ? ?) (inc ?))
      )
    ))

; Resposta

(defn fib[x]
    (loop [a 1 b 1 numero 2]
        (if
            (= numero x) b
            (recur b (+ a b) (inc numero))
        )
    ))

; Escreva uma função soma que recebe um número n e retorna a soma de 1 até n.
; Por exemplo, se n = 5, ele retorna 15, que é 1+2+3+4+5. Use recursão de
; cauda.

; Para ajudar, veja o esqueleto abaixo e complete os ?.

(defn soma[n]

    (loop [contador 1 soma 0]
        (if (> contador n) ?
        (recur (?) (?)))))

; Resposta

(defn soma[n]

    (loop [contador 1 soma 0]
        (if (> contador n) soma
        (recur (inc contador) (+ soma contador)))))
