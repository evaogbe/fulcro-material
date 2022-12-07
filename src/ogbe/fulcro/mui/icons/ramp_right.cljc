(ns ogbe.fulcro.mui.icons.ramp-right
  #?(:cljs (:require
            ["@mui/icons-material/RampRight" :default RampRight]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-ramp-right
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RampRight)))