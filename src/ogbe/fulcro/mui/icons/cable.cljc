(ns ogbe.fulcro.mui.icons.cable
  #?(:cljs (:require
            ["@mui/icons-material/Cable" :default Cable]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cable
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Cable)))