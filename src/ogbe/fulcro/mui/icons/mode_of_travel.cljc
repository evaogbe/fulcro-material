(ns ogbe.fulcro.mui.icons.mode-of-travel
  #?(:cljs (:require
            ["@mui/icons-material/ModeOfTravel" :default ModeOfTravel]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mode-of-travel
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ModeOfTravel)))