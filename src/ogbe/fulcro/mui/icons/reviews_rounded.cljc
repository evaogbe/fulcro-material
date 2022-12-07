(ns ogbe.fulcro.mui.icons.reviews-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ReviewsRounded" :default ReviewsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-reviews-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReviewsRounded)))