(ns ogbe.fulcro.mui.icons.star-rate-sharp
  #?(:cljs (:require
            ["@mui/icons-material/StarRateSharp" :default StarRateSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-star-rate-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StarRateSharp)))