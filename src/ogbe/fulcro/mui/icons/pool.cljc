(ns ogbe.fulcro.mui.icons.pool
  #?(:cljs (:require
            ["@mui/icons-material/Pool" :default Pool]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pool
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Pool)))