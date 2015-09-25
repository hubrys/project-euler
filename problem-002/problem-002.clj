; build fibonacci sequence
; find even ones
; sum

(defn fib-list [max]
	(loop [values '(2 1)]
		(let [new-value (+ (first values) (second values))]
			(if (> new-value max)
				values
				(recur (cons new-value values))))))

(defn problem-2 []
	(reduce + (filter even? (fib-list 4000000))))

(println (problem-2))
