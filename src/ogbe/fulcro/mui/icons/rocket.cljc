(ns ogbe.fulcro.mui.icons.rocket
  #?(:cljs (:require
            ["@mui/icons-material/Rocket" :default Rocket]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rocket
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Rocket)))