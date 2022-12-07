(ns ogbe.fulcro.mui.icons.card-travel
  #?(:cljs (:require
            ["@mui/icons-material/CardTravel" :default CardTravel]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-card-travel
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CardTravel)))