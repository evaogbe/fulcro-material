(ns ogbe.fulcro.mui.icons.no-sim
  #?(:cljs (:require
            ["@mui/icons-material/NoSim" :default NoSim]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-no-sim
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoSim)))