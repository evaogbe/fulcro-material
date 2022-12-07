(ns ogbe.fulcro.mui.icons.moped
  #?(:cljs (:require
            ["@mui/icons-material/Moped" :default Moped]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-moped
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Moped)))