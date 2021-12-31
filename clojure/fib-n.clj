;; Recursively computes Fibonacci numbers.
;; CSC 349, sample submission


;; (fib (Long -> Long))
(def fib
  "Computes the \"n\"th Fibonacci number."
  (memoize
    (fn [n]
      (cond
        (< n 0) -1
        (or (= n 0) (= n 1)) n
        :else (+ (fib (- n 1)) (fib (- n 2)))))))

(prn (fib (read-string (first *command-line-args*))))
