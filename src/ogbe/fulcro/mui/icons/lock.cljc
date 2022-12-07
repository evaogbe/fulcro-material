(ns ogbe.fulcro.mui.icons.lock
  #?(:cljs (:require
            ["@mui/icons-material/Lock" :default Lock]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lock
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Lock)))