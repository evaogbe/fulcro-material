(ns ogbe.fulcro.mui.icons.turned-in-not
  #?(:cljs (:require
            ["@mui/icons-material/TurnedInNot" :default TurnedInNot]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-turned-in-not
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TurnedInNot)))