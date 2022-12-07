(ns ogbe.fulcro.mui.icons.lock-open-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LockOpenRounded" :default LockOpenRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lock-open-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LockOpenRounded)))