(ns ogbe.fulcro.mui.icons.fluorescent
  #?(:cljs (:require
            ["@mui/icons-material/Fluorescent" :default Fluorescent]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fluorescent
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Fluorescent)))