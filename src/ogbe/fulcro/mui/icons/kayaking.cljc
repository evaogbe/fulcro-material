(ns ogbe.fulcro.mui.icons.kayaking
  #?(:cljs (:require
            ["@mui/icons-material/Kayaking" :default Kayaking]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-kayaking
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Kayaking)))