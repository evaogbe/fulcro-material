(ns ogbe.fulcro.mui.icons.hardware
  #?(:cljs (:require
            ["@mui/icons-material/Hardware" :default Hardware]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hardware
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Hardware)))