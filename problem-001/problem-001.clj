; find all multiples of 3
; find all multiples of 5
; find union of them
; sum results

(defn multiples [root max]
	(loop [current root
		   mulls '()]
		(if (>= current max)
			mulls
			(recur (+ current root) (conj mulls current)))))

(println
	(reduce +
		(distinct (concat
			(multiples 3 1000)
			(multiples 5 1000)))))
