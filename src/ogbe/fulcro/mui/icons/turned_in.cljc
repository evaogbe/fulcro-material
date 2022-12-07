(ns ogbe.fulcro.mui.icons.turned-in
  #?(:cljs (:require
            ["@mui/icons-material/TurnedIn" :default TurnedIn]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-turned-in
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TurnedIn)))