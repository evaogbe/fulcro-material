(ns ogbe.fulcro.mui.icons.outlined-flag
  #?(:cljs (:require
            ["@mui/icons-material/OutlinedFlag" :default OutlinedFlag]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-outlined-flag
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OutlinedFlag)))