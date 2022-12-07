(ns ogbe.fulcro.mui.icons.star-rate-rounded
  #?(:cljs (:require
            ["@mui/icons-material/StarRateRounded" :default StarRateRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-star-rate-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StarRateRounded)))