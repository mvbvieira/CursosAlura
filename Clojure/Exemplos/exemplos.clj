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
