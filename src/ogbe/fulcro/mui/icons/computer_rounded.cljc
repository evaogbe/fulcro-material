(ns ogbe.fulcro.mui.icons.computer-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ComputerRounded" :default ComputerRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-computer-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ComputerRounded)))