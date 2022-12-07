(ns ogbe.fulcro.mui.icons.lock-reset-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LockResetRounded" :default LockResetRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lock-reset-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LockResetRounded)))