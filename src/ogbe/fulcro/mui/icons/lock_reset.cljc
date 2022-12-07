(ns ogbe.fulcro.mui.icons.lock-reset
  #?(:cljs (:require
            ["@mui/icons-material/LockReset" :default LockReset]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lock-reset
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LockReset)))