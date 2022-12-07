(ns ogbe.fulcro.mui.icons.rate-review
  #?(:cljs (:require
            ["@mui/icons-material/RateReview" :default RateReview]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rate-review
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RateReview)))