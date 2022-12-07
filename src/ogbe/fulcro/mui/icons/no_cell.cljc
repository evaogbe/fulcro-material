(ns ogbe.fulcro.mui.icons.no-cell
  #?(:cljs (:require
            ["@mui/icons-material/NoCell" :default NoCell]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-no-cell
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoCell)))