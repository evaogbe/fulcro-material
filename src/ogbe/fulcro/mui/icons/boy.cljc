(ns ogbe.fulcro.mui.icons.boy
  #?(:cljs (:require
            ["@mui/icons-material/Boy" :default Boy]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-boy
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Boy)))