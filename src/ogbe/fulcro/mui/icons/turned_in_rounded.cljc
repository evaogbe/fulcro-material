(ns ogbe.fulcro.mui.icons.turned-in-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TurnedInRounded" :default TurnedInRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-turned-in-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TurnedInRounded)))